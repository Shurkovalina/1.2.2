

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequest {

    @Test
    public void postRequest(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Bonne nuit")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("nuit"))
        ;
    }
}