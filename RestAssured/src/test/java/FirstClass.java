import io.restassured.RestAssured;

public class FirstClass {


    public static void main(String[] args) {

        String APIKey = "9f45b89c7a8eef24798a06728a0ba4c3";
        String APIToken = "ATTAa6d0d77e21d762a2ddcad64f7f74da1f9620a8bf0f28179444f6ae2535b9a06c28FFB5BF";
        String BaseUri = "https://api.trello.com/";
        String DisplayName = "OrganizationBYAutomation";


        RestAssured.
                 given()
                .baseUri("https://api.trello.com/1/organizations?")
                .queryParam("displayName","OrganizationBYAutomation")
                .queryParams("key","9f45b89c7a8eef24798a06728a0ba4c3")
                .queryParams("token","ATTAa6d0d77e21d762a2ddcad64f7f74da1f9620a8bf0f28179444f6ae2535b9a06c28FFB5BF")
                .header("Accept","application/json")
                .when()
                .post();

    }
}
