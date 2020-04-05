package com.company.sapriko.config;

import com.company.sapriko.controller.AdminController;
import com.company.sapriko.controller.MainController;
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
public class WebMvcConfigTest {

    @Autowired
    private AdminController adminController;

    @Autowired
    private MainController mainController;

    @BeforeClass
    public static void setUp() {
        System.out.println("\nTesting class \"WebConfig\" - START.\n");
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("\nTesting class \"WebConfig\" - FINISH.\n");
    }

    @Test
    public void adminControllerNotNull() {
        System.out.println("-> adminController Not Null - ");
        assertNotNull(adminController);
        System.out.println("OK!");
    }

    @Test
    public void mainControllerNotNull() {
        System.out.println("-> mainController Not Null - ");
        assertNotNull(mainController);
        System.out.println("OK!");
    }

    @Test
    public void getViewResolveTest() {
        System.out.println("-> addResourceHandlers() - ");
        ApplicationContextConfig applicationContextConfig = new ApplicationContextConfig();
        assertNotNull(applicationContextConfig.getViewResolver());
        System.out.println("OK!");
    }
}
