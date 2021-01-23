package Academy;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import resource.InputJsonData;
import resource.InputJsonData2;

public class RestApiManupulation {
@Test

public void verifyTotalSum() {
	JsonPath js = new JsonPath(InputJsonData2.DataForApiBody());
	int count = js.getInt("course.size()");
	for(int i=0; i<count; i++) {
		
	}
}
}
