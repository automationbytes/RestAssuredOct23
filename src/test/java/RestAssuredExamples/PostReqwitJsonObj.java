package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostReqwitJsonObj {

    @Test
    public void PostReq(){

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","Post Req wit Json Object");
        jsonObject.put("Name","Post Req wit Json Object");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .contentType(ContentType.JSON)
                .and()
                .body(jsonObject.toString())
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());



    }
}
