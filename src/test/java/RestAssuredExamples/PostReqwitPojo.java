package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class PostReqwitPojo {

    @Test
    public  void PostReq(){

        PojoReqBody pojoReqBody = new PojoReqBody();
        pojoReqBody.setDescription("Pojo Post Req");
        pojoReqBody.setName("Pojo pst name");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .contentType(ContentType.JSON)
                .and()
                .body(pojoReqBody)
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());



    }

}
