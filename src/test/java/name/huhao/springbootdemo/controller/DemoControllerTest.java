package name.huhao.springbootdemo.controller;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoControllerTest {

    private DemoController controller;

    @Before
    public void setUp() throws Exception {
        controller = new DemoController();
    }

    @Test
    public void indexShouldReturnHelloWorld() throws Exception {
        assertThat(controller.index()).isEqualTo("Hello World!");
    }
}
