package name.huhao.springbootdemo.unit.controller;

import name.huhao.springbootdemo.controller.UserController;
import name.huhao.springbootdemo.model.User;
import name.huhao.springbootdemo.repository.UserRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class UserControllerTest {

    @Mock
    private UserRepository userRepository;

    private UserController controller;

    @Before
    public void setUp() {
        controller = new UserController(userRepository);
    }

    @Test
    public void indexShouldReturnUsers() {

        List<User> usersFromDB = Lists.newArrayList(new User("Alex", 18));
        when(userRepository.findAll()).thenReturn(usersFromDB);

        List<User> users = controller.index();

        assertThat(users).isEqualTo(usersFromDB);
    }
}
