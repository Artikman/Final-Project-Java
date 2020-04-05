package com.company.sapriko.config;

import com.company.sapriko.service.MyDBAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
// @EnableWebSecurity = @EnableWebMVCSecurity + Extra features
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    MyDBAuthenticationService myDBAauthenticationService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

        // For User in database.
        auth.userDetailsService(myDBAauthenticationService);

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();

        http.authorizeRequests().antMatchers("/", "/registration", "/login", "/logout").permitAll();

        // The pages requires login as USER or ADMIN.
        // If no login, it will redirect to /login page.
        http.authorizeRequests().antMatchers("/productList", "/depositoryList1", "/orderList","/order", "/accountInfo")//
                .access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");

        // For ADMIN only.
        http.authorizeRequests().antMatchers("/product").access("hasRole('ROLE_ADMIN')");


        // When the user has logged in as XX.
        // But access a page that requires role YY,
        // AccessDeniedException will throw.
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");

        // Config for Login Form
        http.authorizeRequests().and().formLogin()//
                // Submit URL of login page.
                .loginProcessingUrl("/j_spring_security_check") // Submit URL
                .loginPage("/login")//
                .defaultSuccessUrl("/accountInfo")//
                .failureUrl("/login?error=true")//
                .usernameParameter("userName")//
                .passwordParameter("password")
                // Config for Logout Page
                // (Go to home page).
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/");
    }
}