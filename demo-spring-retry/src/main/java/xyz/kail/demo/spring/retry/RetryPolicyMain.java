package xyz.kail.demo.spring.retry;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

/**
 * RetryPolicy: SimpleRetryPolicy(3) -- 默认重试三次
 * BackOffPolicy: NoBackOffPolicy
 * RetryListener: empty
 * RetryContextCache: MapRetryContextCache()
 * ThrowLastExceptionOnExhausted: false -- 不抛出最后一个异常
 */
public class RetryPolicyMain {

    public static void main(String[] args) throws Throwable {

        RetryTemplate retryTemplate = new RetryTemplate();

        SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
        // 最大尝试次数
        retryPolicy.setMaxAttempts(SimpleRetryPolicy.DEFAULT_MAX_ATTEMPTS);

        final String result = retryTemplate.execute((RetryCallback<String, Throwable>) context -> "Hello");

        System.out.println(result);

    }
}
