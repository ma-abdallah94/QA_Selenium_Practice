package RESTAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TanyTest {

    @Test
    public void test() {
        RestAssured
                .given()
                .when()
                .then();
    }
}
