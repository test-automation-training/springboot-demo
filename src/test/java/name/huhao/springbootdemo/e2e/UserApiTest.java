package name.huhao.springbootdemo.e2e;

import com.fasterxml.jackson.databind.ObjectMapper;
import name.huhao.springbootdemo.model.User;
import name.huhao.springbootdemo.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.flywaydb.test.FlywayTestExecutionListener;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, FlywayTestExecutionListener.class})
public class UserApiTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private UserRepository userRepository;

    @Before
    @FlywayTest
    public void setUp() {

    }

    @Test
    public void indexShouldReturnHelloWorld() throws Exception {
        var alex = userRepository.save(new User("Alex", 18));

        var mapper = new ObjectMapper();
        var expectedJson = mapper.writeValueAsString(Lists.newArrayList(alex));

        var result = restTemplate.getForObject("/users", String.class);
        assertThat(result).isEqualTo(expectedJson);
    }
}
