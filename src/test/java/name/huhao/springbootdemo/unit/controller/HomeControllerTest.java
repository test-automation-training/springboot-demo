package name.huhao.springbootdemo.unit.controller;

import name.huhao.springbootdemo.controller.HomeController;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HomeControllerTest {

    private HomeController controller;

    @Before
    public void setUp() {
        controller = new HomeController();
    }

    @Test
    public void indexShouldReturnHelloWorld() {
        assertThat(controller.index()).isEqualTo("Hello World!");
    }
}
