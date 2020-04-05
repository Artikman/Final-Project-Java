package com.company.sapriko.config;

import com.company.sapriko.service.MyDBAuthenticationService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
        @ContextConfiguration(classes = ApplicationContextConfig.class),
        @ContextConfiguration(classes = WebMvcConfig.class)
})
public class WebSecurityConfigTest {

    @Autowired
    private MyDBAuthenticationService myDBAuthenticationService;

    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"curityConfig\" - START.\n");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("\nTesting class \"curityConfig\" - FINISH.\n");
    }

    @Test
    public void myDBAuthenticationServiceNotNull() {
        System.out.println("-> myDBAuthenticationService() - ");
        assertNotNull(myDBAuthenticationService);
        System.out.println("OK!");
    }
}