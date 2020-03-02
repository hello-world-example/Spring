---
headless: true
bookMenuLevels: 1
---



- **spring-core🍃**
  
  * **springframework.core🌱**
      * [Constants]({{< relref "/docs/spring-core/core/Constants.md" >}})
      * [SpringVersion]({{< relref "/docs/spring-core/core/SpringVersion.md" >}})
  * **springframework.core.io🌱**
      * [Resource]({{< relref "/docs/spring-core/core/io/Resource.md" >}})
      * [ResourceLoader]({{< relref "/docs/spring-core/core/io/ResourceLoader.md" >}})
      * [ResourcePatternResolver]({{< relref "/docs/spring-core/core/io/ResourcePatternResolver.md" >}})
  * **springframework.util🌱**
      * [AntPathMatcher]({{< relref "/docs/spring-core/util/AntPathMatcher.md" >}})
  * [cglib 🌱]({{< relref "/docs/spring-core/cglib.md" >}}) 
  * [objenesis 🌱]({{< relref "/docs/spring-core/objenesis.md" >}})
  
- **spring-beans🍃**

  - [生命周期]({{< relref "/docs/spring-beans/Lifecycle.md" >}})
  - [BeanFactory]({{< relref "/docs/spring-beans/BeanFactory.md" >}})
    - [BeanFactory.getBean]({{< relref "/docs/spring-beans/BeanFactory.getBean.md" >}})
    - [StaticListable**BeanFactory**]({{< relref "/docs/spring-beans/StaticListableBeanFactory.md" >}})
  * [FactoryBean]({{< relref "/docs/spring-beans/FactoryBean.md" >}})
  * [BeanFactoryPostProcessor]({{< relref  "/docs/spring-beans/BeanFactoryPostProcessor.md" >}})
  * [BeanPostProcessor]({{< relref   "/docs/spring-beans/BeanPostProcessor.md" >}})
    * [Aware]({{< relref  "/docs/spring-beans/Aware.md" >}})
    * [InitializingBean]({{< relref "/docs/spring-beans/InitializingBean.md" >}})
    * [DisposableBean]({{<  relref "/docs/spring-beans/DisposableBean.md" >}})

- **spring-context**

  * **Handlers**
    * **ContextNamespaceHandler**
      * [_&lt;context: component-scan/&gt;](spring-context/handlers/ContextNamespaceHandler/component-scan.md)
      * [&lt;context: load-time-weaver/&gt;](spring-context/handlers/ContextNamespaceHandler/load-time-weaver.md)
      * [&lt;context: spring-configured/&gt;](spring-context/handlers/ContextNamespaceHandler/spring-configured.md)

- **spring-aop**

  - [概念](spring-aop/core.md)
  - [aopalliance](spring-aop/aopalliance.md)
  - **Spring AOP 使用方式**
    * [**基于AspectJ注解**](spring-aop/usage/annotation-usage.md)
    * [**基于 Schema**](spring-aop/usage/schema-xml-usage.md)
    * [基于编码](spring-aop/usage/code-usage.md)
  - **Handlers**
    * **AopNamespaceHandler**
      * [&lt;aop: spring-configured/&gt;](spring-aop/handlers/AopNamespaceHandler/spring-configured.md)
  - ~~_AopProxy~~
    * ~~_DefaultAopProxyFactory~~
    * ~~_JdkDynamicAopProxy~~
    * ~~_CglibAopProxy & ObjenesisCglibAopProxy~~

- **spring-tx**
  
  - PlatformTransactionManager](spring-tx/PlatformTransactionManager.md)
  - 使用方式
      - 编码](spring-tx/usage-mode/code.md)
      - 注解
      - AOP
  - TransactionInterceptor
  - SpringTransactionAnnotationParser
  
- **spring-webmvc**

- **FAQ**



