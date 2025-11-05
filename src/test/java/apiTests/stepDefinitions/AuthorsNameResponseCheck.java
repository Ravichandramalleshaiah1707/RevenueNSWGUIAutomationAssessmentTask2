package apiTests.stepDefinitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;


import java.util.List;

public class AuthorsNameResponseCheck {

    private Response response;

    //commenting to push in the assesment
    @Given("access the OpenLibrary author API with ID {string}")
    public void accessOLAuthorWithIDi(String authorId) {
        RestAssured.baseURI = "https://openlibrary.org";
        response = RestAssured.get("/authors/" + authorId + ".json");
        response.then().statusCode(200);
    }

    @Then("the author personal_name should be {string}")
    public void verifyAuthorPersonalName(String personalName) {
        String actualPersonalNameFromResponse = response.jsonPath().getString("personal_name");
        assertThat("Personal name mismatch!", actualPersonalNameFromResponse, equalTo(personalName));
        System.out.println("Personal name from the response is: " + actualPersonalNameFromResponse + ", and it is matching with the expected personal name which is: " + personalName );
    }

    @Then("the author's one of the alternate_name should be {string}")
    public void verifyAuthorAlternativeName(String altName) {
        List<String> actualAltNamefromResponse = response.jsonPath().getList("alternate_names");
        assertThat("Alternate name mismatch!", actualAltNamefromResponse, hasItem(altName));
        System.out.println("Alternate name from the response is: " + actualAltNamefromResponse + ", and it is matching with the expected alt name which is: " + altName );
    }
}
