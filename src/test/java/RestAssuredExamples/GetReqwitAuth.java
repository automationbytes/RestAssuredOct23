package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class GetReqwitAuth {

    @Test
    public void getAuthReq(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest"; //qa, uat, prod
        Response response = RestAssured
                .given()
                .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();


        System.out.println(response.statusCode());
        System.out.println(response.asPrettyString());

    }


    @Test
    public void AssertusingHamscrest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest"; //qa, uat, prod
        RestAssured
                .given()
                .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .assertThat()
               // .body("Name",hasItem("Vignesh"));
               // .body("Id",hasItems(130,124,135,136));
                .body(hasKey("Id"));
                //.extract().response();

    }


}
