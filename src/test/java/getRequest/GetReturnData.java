package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetReturnData {

    @Test
    public void testResponseCode() {

        int code = get("http://dummy.restapiexample.com/api/v1/employee/6").getStatusCode();
        System.out.println("Status code is " + code);
        Assert.assertEquals(code, 200);
    }

    @Test
    public void testBody() {

        String data = get("http://dummy.restapiexample.com/api/v1/employee/6").asString();
        long time = get("http://dummy.restapiexample.com/api/v1/employee/6").getTime();
        System.out.println("Data is " + data);
        System.out.println("Response time " + time);
    }


}
