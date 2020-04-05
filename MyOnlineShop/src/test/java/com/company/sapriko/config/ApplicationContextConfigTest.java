package com.company.sapriko.config;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextHierarchy({
        @ContextConfiguration(classes = ApplicationContextConfig.class),
        @ContextConfiguration(classes = WebMvcConfig.class)
})
@ComponentScan
public class ApplicationContextConfigTest {

    @Test
    public void dataSourceTest() {
        System.out.println("-> dataSource() -");
        ApplicationContextConfig applicationContextConfig = new ApplicationContextConfig();
        assertNotNull(applicationContextConfig.getDataSource());
        System.out.println("OK!");
    }

    @Test
    public void sessionFactoryTest() throws Exception {
        System.out.println("-> jpaVendorAdapter() - ");
        ApplicationContextConfig applicationContextConfig = new ApplicationContextConfig();
        DataSource dataSource = mock(DataSource.class);
        assertNotNull(applicationContextConfig.getSessionFactory(dataSource));
        System.out.println("OK!");
    }

    @Test
    public void transactionManagerTest() {
        System.out.println("-> transactionManager() - ");
        ApplicationContextConfig applicationContextConfig = new ApplicationContextConfig();
        SessionFactory sessionFactory = mock(SessionFactory.class);
        assertNotNull(applicationContextConfig.getTransactionManager(sessionFactory));
        System.out.println("OK!");
    }
}