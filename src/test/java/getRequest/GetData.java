package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetData {

    @Test
    public void testResponseCode() {

        String status = get("http://dummy.restapiexample.com/api/v1/employees").statusLine();
        System.out.println("Status code is " + status);
        //Assert.assertEquals(status, "success");
    }



    @Test
    public void testBody() {

        //String data = get("http://dummy.restapiexample.com/api/v1/employees").asString();
        long time = get("http://dummy.restapiexample.com/api/v1/employees").getTime();
        //System.out.println("Data is " + data);
        System.out.println("Response time " + time);
    }
}
