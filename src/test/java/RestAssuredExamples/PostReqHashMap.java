package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

public class PostReqHashMap {

    @Test
    public void PostReq(){
        HashMap hashMap = new HashMap();
        hashMap.put("Description","Post req wit Hashmap");
        hashMap.put("Name","Post Req Hashmap");
        JSONObject jsonObject = new JSONObject(hashMap);

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
