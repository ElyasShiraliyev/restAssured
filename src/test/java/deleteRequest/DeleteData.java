package deleteRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteData {

    @Test
    public void testResponseCode() {

        int code = delete("http://dummy.restapiexample.com/api/v1/delete/10").getStatusCode();
        System.out.println("Status code is " + code);
        Assert.assertEquals(code, 200);
    }

    @Test
    public void testBody() {

        long time = delete("http://dummy.restapiexample.com/api/v1/delete/10").getTime();
        System.out.println("Response time " + time);
    }
}
