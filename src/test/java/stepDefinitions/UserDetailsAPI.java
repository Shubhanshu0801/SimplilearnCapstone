package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import org.junit.Assert;
import pages.APITestingPage;

import static io.restassured.RestAssured.given;

public class UserDetailsAPI {
    @When("user gets the list of user details")
    public void user_gets_the_list_of_user_details() {
        RestAssured.baseURI = "https://in.puma.com";
        given().log().all().headers("Content-Type","application/json",
                "Accept-Language","en-US,en;q=0.9",
                "Customer-Group","edfcf3d448af2951143b00941cdd4c946b0a74127fa20b5dcf3524c2ace2beb3",
                "Customer-Id","abkuk1wXFFlukRw0cXkqYYlHE0",
                "Locale","en-IN",
                "Bloomreach-Id","uid=7971871947221:v=12.1:ts=1685868597600:hc=6",
		"Authorization","Bearer eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJraWQiOiIzNThmYjlmZS00MzY2LTRmODctOThiMy0zNTAzMjViYTU1MDgiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLWNvbnRleHQucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5hZGRyZXNzZXMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wcm9kdWN0bGlzdHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItcHJvbW90aW9ucyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLWdpZnQtY2VydGlmaWNhdGVzIHNmY2Muc2hvcHBlci1wcm9kdWN0LXNlYXJjaCBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItY2F0ZWdvcmllcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Iiwic3ViIjoiY2Mtc2xhczo6YmN3cl9wcmQ6OnNjaWQ6OGMyMzM2MzMtNzQ2ZS00NDc5LWI0OWUtYmQ5YjRjNDNmMTk5Ojp1c2lkOjk1YjU4YzIyLWNhMDctNDE1OC04MDVkLTM1MDc3ODEzNjE5MSIsImN0eCI6InNsYXMiLCJpc3MiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJpc3QiOjEsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iY3dyX3ByZCIsIm5iZiI6MTY4NTg3MTA3Niwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOnNodWJoYW5zaHVkdWJleTkxQGdtYWlsLmNvbTo6dWlkbjpTaHViaGFuc2h1IER1YmV5OjpnY2lkOmFibXJ0R2xyRkhrSGdSdzBjVWxXWVlrcnMyOjpyY2lkOmFia3VrMXdYRkZsdWtSdzBjWGtxWVlsSEUwOjpjaGlkOklOIiwiZXhwIjoxNjg1ODcyOTA2LCJpYXQiOjE2ODU4NzExMDYsImp0aSI6IkMyQy0xNDcwNTc4NzY1MDQ0ODA4OTQ0MjM4MzAwMjQ1NjM4Mjc5NjUifQ.EKmRRRpeJhpitXnYulKcm7twbj4JQwTBTi7OMRkmfzXwLXY4pT6DH7vzcY8UsnoXqlu2KpJLhn9hlgg_F_odQw"
		,"Referer",
			"https://in.puma.com/in/en/account",
			"Refresh-Token",
			"rojIu9CZ6hMHSKrLT8zvbV-UQH-e8_eG3xHQWi69PGM"
        		).body(APITestingPage.PayloadUserDetails).when().post("/api/graphql").then().log().body(true).assertThat().statusCode(200);
    }

    @Then("user first name should be {string}")
    public void user_first_name_should_be(String firstName) {
        RestAssured.baseURI = "https://in.puma.com";
        String responseFirstName = given().log().all().headers("content-type","application/json",
                "Accept-Language","en-US,en;q=0.9",
                "Customer-Group","19df26d1b2520e8ed6804a6f43c65e6004b19e48439db9e65b3ef8b485114334",
                "Customer-Id","abkuk1wXFFlukRw0cXkqYYlHE0",
                "Dnt","1",
                "Locale","en-IN",
                "Bloomreach-Id","uid=8573448083425:v=12.1:ts=1683287311447:hc=11",
		"Authorization","Bearer eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJraWQiOiIzNThmYjlmZS00MzY2LTRmODctOThiMy0zNTAzMjViYTU1MDgiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLWNvbnRleHQucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5hZGRyZXNzZXMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wcm9kdWN0bGlzdHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItcHJvbW90aW9ucyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLWdpZnQtY2VydGlmaWNhdGVzIHNmY2Muc2hvcHBlci1wcm9kdWN0LXNlYXJjaCBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItY2F0ZWdvcmllcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Iiwic3ViIjoiY2Mtc2xhczo6YmN3cl9wcmQ6OnNjaWQ6OGMyMzM2MzMtNzQ2ZS00NDc5LWI0OWUtYmQ5YjRjNDNmMTk5Ojp1c2lkOjk1YjU4YzIyLWNhMDctNDE1OC04MDVkLTM1MDc3ODEzNjE5MSIsImN0eCI6InNsYXMiLCJpc3MiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJpc3QiOjEsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iY3dyX3ByZCIsIm5iZiI6MTY4NTg3MTA3Niwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOnNodWJoYW5zaHVkdWJleTkxQGdtYWlsLmNvbTo6dWlkbjpTaHViaGFuc2h1IER1YmV5OjpnY2lkOmFibXJ0R2xyRkhrSGdSdzBjVWxXWVlrcnMyOjpyY2lkOmFia3VrMXdYRkZsdWtSdzBjWGtxWVlsSEUwOjpjaGlkOklOIiwiZXhwIjoxNjg1ODcyOTA2LCJpYXQiOjE2ODU4NzExMDYsImp0aSI6IkMyQy0xNDcwNTc4NzY1MDQ0ODA4OTQ0MjM4MzAwMjQ1NjM4Mjc5NjUifQ.EKmRRRpeJhpitXnYulKcm7twbj4JQwTBTi7OMRkmfzXwLXY4pT6DH7vzcY8UsnoXqlu2KpJLhn9hlgg_F_odQw"
		,"Referer",
		"https://in.puma.com/in/en/account",
		"Refresh-Token",
		"rojIu9CZ6hMHSKrLT8zvbV-UQH-e8_eG3xHQWi69PGM").body(APITestingPage.PayloadUserDetails).when().post("/api/graphql").then().log().body(true).extract().path("data.me.firstName");
        Assert.assertTrue(responseFirstName.contains(firstName));
    }

    @Then("user last name should be {string}")
    public void user_last_name_should_be(String lastName) {
        RestAssured.baseURI = "https://in.puma.com";
        String responseLastName = given().log().all().headers("content-type","application/json",
                "Accept-Language","en-US,en;q=0.9",
                "Customer-Group","19df26d1b2520e8ed6804a6f43c65e6004b19e48439db9e65b3ef8b485114334",
                "Customer-Id","abkuk1wXFFlukRw0cXkqYYlHE0",
                "Dnt","1",
                "Locale","en-IN",
                "Bloomreach-Id","uid=8573448083425:v=12.1:ts=1683287311447:hc=11",
		"Authorization","Bearer eyJ2ZXIiOiIxLjAiLCJqa3UiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJraWQiOiIzNThmYjlmZS00MzY2LTRmODctOThiMy0zNTAzMjViYTU1MDgiLCJ0eXAiOiJqd3QiLCJjbHYiOiJKMi4zLjQiLCJhbGciOiJFUzI1NiJ9.eyJhdXQiOiJHVUlEIiwic2NwIjoic2ZjYy5zaG9wcGVyLW15YWNjb3VudC5iYXNrZXRzIHNmY2Muc2hvcHBlci1teWFjY291bnQuYWRkcmVzc2VzIHNmY2Muc2hvcHBlci1wcm9kdWN0cyBzZmNjLnNob3BwZXItbXlhY2NvdW50LnJ3IHNmY2Muc2hvcHBlci1teWFjY291bnQucGF5bWVudGluc3RydW1lbnRzIHNmY2Muc2hvcHBlci1jdXN0b21lcnMubG9naW4gc2ZjYy5zaG9wcGVyLWNvbnRleHQucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5vcmRlcnMgc2ZjYy5zaG9wcGVyLWN1c3RvbWVycy5yZWdpc3RlciBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5hZGRyZXNzZXMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wcm9kdWN0bGlzdHMucncgc2ZjYy5zaG9wcGVyLXByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItcHJvbW90aW9ucyBzZmNjLnNob3BwZXItYmFza2V0cy1vcmRlcnMucncgc2ZjYy5zaG9wcGVyLW15YWNjb3VudC5wYXltZW50aW5zdHJ1bWVudHMucncgc2ZjYy5zaG9wcGVyLWdpZnQtY2VydGlmaWNhdGVzIHNmY2Muc2hvcHBlci1wcm9kdWN0LXNlYXJjaCBzZmNjLnNob3BwZXItbXlhY2NvdW50LnByb2R1Y3RsaXN0cyBzZmNjLnNob3BwZXItY2F0ZWdvcmllcyBzZmNjLnNob3BwZXItbXlhY2NvdW50Iiwic3ViIjoiY2Mtc2xhczo6YmN3cl9wcmQ6OnNjaWQ6OGMyMzM2MzMtNzQ2ZS00NDc5LWI0OWUtYmQ5YjRjNDNmMTk5Ojp1c2lkOjk1YjU4YzIyLWNhMDctNDE1OC04MDVkLTM1MDc3ODEzNjE5MSIsImN0eCI6InNsYXMiLCJpc3MiOiJzbGFzL3Byb2QvYmN3cl9wcmQiLCJpc3QiOjEsImF1ZCI6ImNvbW1lcmNlY2xvdWQvcHJvZC9iY3dyX3ByZCIsIm5iZiI6MTY4NTg3MTA3Niwic3R5IjoiVXNlciIsImlzYiI6InVpZG86ZWNvbTo6dXBuOnNodWJoYW5zaHVkdWJleTkxQGdtYWlsLmNvbTo6dWlkbjpTaHViaGFuc2h1IER1YmV5OjpnY2lkOmFibXJ0R2xyRkhrSGdSdzBjVWxXWVlrcnMyOjpyY2lkOmFia3VrMXdYRkZsdWtSdzBjWGtxWVlsSEUwOjpjaGlkOklOIiwiZXhwIjoxNjg1ODcyOTA2LCJpYXQiOjE2ODU4NzExMDYsImp0aSI6IkMyQy0xNDcwNTc4NzY1MDQ0ODA4OTQ0MjM4MzAwMjQ1NjM4Mjc5NjUifQ.EKmRRRpeJhpitXnYulKcm7twbj4JQwTBTi7OMRkmfzXwLXY4pT6DH7vzcY8UsnoXqlu2KpJLhn9hlgg_F_odQw"
		,"Referer",
		"https://in.puma.com/in/en/account",
		"Refresh-Token",
		"rojIu9CZ6hMHSKrLT8zvbV-UQH-e8_eG3xHQWi69PGM").body(APITestingPage.PayloadUserDetails).when().post("/api/graphql").then().log().body(true).extract().path("data.me.lastName");
        Assert.assertTrue(responseLastName.contains(lastName));
    }
}
