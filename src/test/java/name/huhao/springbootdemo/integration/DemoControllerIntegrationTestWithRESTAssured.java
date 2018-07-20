package name.huhao.springbootdemo.integration;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import name.huhao.springbootdemo.controller.DemoController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.CoreMatchers.containsString;

@RunWith(SpringRunner.class)
public class DemoControllerIntegrationTestWithRESTAssured {

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(new DemoController());
    }

    @Test
    public void indexShouldReturnHelloWorld() {
        when().get("/")
                .then()
                .statusCode(200).contentType(ContentType.TEXT)
                .body(containsString("Hello World!"));
    }
}
