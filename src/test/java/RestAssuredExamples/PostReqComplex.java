package RestAssuredExamples;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostReqComplex {
    public static void main(String[] args) {

        // Create a Person object
        Person person = new Person();

        // Set values for the fields in the Person object
        person.setFirstName("Vignesh");
        person.setLastName("A");
        person.setId(2);

        // Create an Address object and set values for its fields
        Person.Address address = new Person.Address();
        address.setCity("New York");
        address.setCountry("USA");
        address.setStreet("123 Main Street");
        address.setZipCode(10001);

        // Set the Address object in the Person object
        person.setAddress(address);

        // Access and print the values
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("ID: " + person.getId());

        Person.Address personAddress = person.getAddress();
        System.out.println("City: " + personAddress.getCity());
        System.out.println("Country: " + personAddress.getCountry());
        System.out.println("Street: " + personAddress.getStreet());
        System.out.println("Zip Code: " + personAddress.getZipCode());


        http://tosca-webservice-ng.azurewebsites.net/


        RestAssured.baseURI = "http://tosca-webservice-ng.azurewebsites.net/";
        Response response = RestAssured.given()
              //  .header("Authorization","Bearer 3de5ed93-377b-49e9-a13a-bda27467a583")
                .contentType(ContentType.JSON)
                .and()
                .body(person)
                .when()
                .put(" /api/Employee_V4")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        System.out.println(response.statusCode());




    }
}
