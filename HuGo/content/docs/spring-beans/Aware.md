# beans.factory.Aware

```java
/**
  * A marker superinterface indicating that a bean is eligible to be notified by the
  * Spring container of a particular framework object through a callback-style method.
  * The actual method signature is determined by individual subinterfaces but should
  * typically consist of just one void-returning method that accepts a single argument.
  *
  * @link org.springframework.beans.factory.config.BeanPostProcessor
  *  @link org.springframework.context.support.ApplicationContextAwareProcessor
  * @since 3.1
  */
public interface Aware {
}
```

## context.support.ApplicationContextAwareProcessor

