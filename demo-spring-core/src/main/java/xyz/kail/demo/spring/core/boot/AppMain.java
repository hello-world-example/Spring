package xyz.kail.demo.spring.core.boot;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import xyz.kail.demo.spring.core.boot.service.DemoService;

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
