# HK2 Getting Started

Unlike the `main` branch this repository, this branch makes use the `hk2-metadata-generator` which will be used with `javac` during compilation time. You need to include this into the `maven-compiler-plugin` configuration in your pom. This might feel more natural to use.

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.1</version>
    <inherited>true</inherited>
    <configuration>
        <source>1.8</source>
        <target>1.8</target>
        <annotationProcessorPaths>
            <annotationProcessorPath>
                <groupId>org.glassfish.hk2</groupId>
                <artifactId>hk2-metadata-generator</artifactId>
                <version>${hk2.version}</version>
            </annotationProcessorPath>
        </annotationProcessorPaths>
    </configuration>
</plugin>
```

The code does not need to be change from the code in the `main` branch.

```java
ServiceLocatorUtilities.createAndPopulateServiceLocator();
```

The file gets populated with the service classes annotated with `@Service`.

## Build/Run

```
$ ./mvnw clean package exec:java
```

You can also just run your `main` method from your IDE and the inhabitants file will be generated during compilation.

### See also

* [HK2 Documentation](https://javaee.github.io/hk2/)
* [HK2 Getting Started](https://javaee.github.io/hk2/getting-started.html)