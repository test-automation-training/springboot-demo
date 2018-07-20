# SpringBoot Demo

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