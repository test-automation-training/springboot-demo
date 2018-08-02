package name.huhao.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        // 生成 pid 文件，用于后台运行时方便 kill
        SpringApplicationBuilder app = new SpringApplicationBuilder(Application.class);
        app.build().addListeners(new ApplicationPidFileWriter("./bin/shutdown.pid"));
        app.run(args);
    }
}
