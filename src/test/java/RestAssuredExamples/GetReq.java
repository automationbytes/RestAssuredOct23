package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import org.testng.annotations.Test;

/*

Given - Pre Conditions
When - Action to be performed
Then - Outcome of that particular action


 */


public class GetReq {

    //public static void main(String[] args) {

    @Test
    public void getReqEx()
    {
        RestAssured.baseURI ="http://tosca-webservice-ng.azurewebsites.net";

        Response response = RestAssured
                .when()
                .get("/api/Coffees_V4")
                .then()
                .extract()
                .response();

        System.out.println(response.asPrettyString());
        System.out.println("Status Code :"+response.statusCode());
//
//        if(response.statusCode() == 200){
//
//        }

        Assert.assertEquals(204
                , response.statusCode());
    }
}
