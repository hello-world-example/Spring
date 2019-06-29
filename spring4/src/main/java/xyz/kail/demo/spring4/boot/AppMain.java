package xyz.kail.demo.spring4.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xyz.kail.demo.spring4.boot.service.DemoService;

/**
 * @author Kail
 */
@ComponentScan(basePackageClasses = AppMain.class)
public class AppMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppMain.class);

        DemoService bean = context.getBean(DemoService.class);
        System.out.println(bean);
    }

}
