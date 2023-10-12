package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostReqasString {

    @Test
    public void PostReq(){

        String rbody = """
                {
                  "Description": "Example Post Request from Request body as String",
                  "Name": "Request as String"
                }""";

        System.out.println(rbody);

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .contentType(ContentType.JSON)
               // applicable only for post/put/patch request
                .and()
                .body(rbody)
                //
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());

    }
}
