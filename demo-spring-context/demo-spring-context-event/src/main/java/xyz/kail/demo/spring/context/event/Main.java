package xyz.kail.demo.spring.context.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import xyz.kail.demo.spring.context.event.event.DemoEvent;
import xyz.kail.demo.spring.context.event.event.StatusEvent;

import java.util.Date;

@ComponentScan(basePackageClasses = Main.class)
public class Main {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        // 发布事件
        context.publishEvent(new DemoEvent("demo:" + new Date()));

        // 发布 - 状态事件
        context.publishEvent(new StatusEvent(300, "status:" + new Date()));
        context.publishEvent(new StatusEvent(400, "status:" + new Date()));
        context.publishEvent(new StatusEvent(500, "status:" + new Date()));
    }

}
