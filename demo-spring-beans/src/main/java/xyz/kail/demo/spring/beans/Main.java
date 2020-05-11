package xyz.kail.demo.spring.beans;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Map;

@EnableAsync
public class Main {

    public static void main(String[] args) {

        AnnotationMetadata introspect = AnnotationMetadata.introspect(Main.class);
        Map<String, Object> annotationAttributes = introspect.getAnnotationAttributes(EnableAsync.class.getName());
        System.out.println(annotationAttributes);

        AnnotationAttributes attributes = AnnotationAttributes.fromMap(annotationAttributes);
        Number order = attributes.getNumber("order");
        System.out.println(order);


    }

}
