package Tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C06_ReponseBodyTesti
{
    @Test
    public void test01(){

        String url = "https://jsonplaceholder.typicode.com/posts/44";

        Response response = given().when().get(url);

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("userId", Matchers.equalTo(5))
                .body("title",Matchers.equalTo("optio dolor molestias sit"));






    }
}
