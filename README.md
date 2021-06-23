# HK2 Getting Started

The easiest way to get started with HK2 is to use the [`hk2-inhabitant-generator`](https://javaee.github.io/hk2/inhabitant-generator.html).
This plugin will generate a `META-INF/hk2-locator/default` file which HK2 will use to populate the `ServiceLocator` when you call

```java
ServiceLocatorUtilities.createAndPopulateServiceLocator();
```

## Build/Run

```
$ ./mvnw clean package exec:java
```

### See also

* [HK2 Documentation](https://javaee.github.io/hk2/)
* [HK2 Getting Started](https://javaee.github.io/hk2/getting-started.html)