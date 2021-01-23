package Academy;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import resource.InputJsonData;

public class RestApiTest1 {

	public static void main(String[] args) {
	
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().queryParam("key", "qaclick123")
		//.header("Content-Type", "application/json")
		.body(InputJsonData.DataForAPIBody())
		.when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).extract().response().asString();
		//System.out.println(response);
	

JsonPath js = new JsonPath(response);
String placeid = js.getString("place_id");
System.out.println(placeid);
}}