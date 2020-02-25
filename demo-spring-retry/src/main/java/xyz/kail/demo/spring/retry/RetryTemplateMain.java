package xyz.kail.demo.spring.retry;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.support.RetryTemplate;

/**
 * RetryPolicy: SimpleRetryPolicy(3) -- 默认重试三次
 * BackOffPolicy: NoBackOffPolicy
 * RetryListener: empty
 * RetryContextCache: MapRetryContextCache()
 * ThrowLastExceptionOnExhausted: false -- 不抛出最后一个异常
 */
public class RetryTemplateMain {

    public static void main(String[] args) throws Throwable {

        RetryTemplate retryTemplate = new RetryTemplate();

        final String result = retryTemplate.execute((RetryCallback<String, Throwable>) context -> "Hello");

        System.out.println(result);

    }
}
