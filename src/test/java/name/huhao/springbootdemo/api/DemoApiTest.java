package name.huhao.springbootdemo.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoApiTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void indexShouldReturnHelloWorld() {
        String result = this.restTemplate.getForObject("/", String.class);
        assertThat(result).isEqualTo("Hello World!");
    }
}
