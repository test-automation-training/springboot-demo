# SpringBoot Demo

本 Demo 用于演示 SpringBoot 框架的使用。

本 Demo 的测试部分基于测试金字塔理论，目的是探求 SpringBoot 框架下对测试金字塔思想的表达，以及一些优秀工具的演示：

- [Practical Test Pyramid](https://martinfowler.com/articles/practical-test-pyramid.html)

## 运行程序

运行以下 `Gradle` 任务启动程序：

```bash
./gradlew bootrun
```

然后用浏览器访问：

- http://localhost:8080

## 运行测试

使用以下命令运行 API 的端到端测试：

```bash
./gradlew test --tests "name.huhao.springbootdemo.e2e.*"
```

使用以下命令运行 Controller 的集成测试：

```bash
./gradlew test --tests "name.huhao.springbootdemo.integration.*"
```

使用以下命令运行 Controller 的单元测试：

```bash
./gradlew test --tests "name.huhao.springbootdemo.controller.*"
```