package getRequest;

import org.testng.annotations.Test;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData2
{
	@Test
	public void testResponsecode()
	{
		int code =get("https://my-json-server.typicode.com/typicode/demo/posts/1").getStatusCode();
		System.out.println("Status code is"+code);
		Assert.assertEquals(code,200);
		
	}
	
	@Test
	public void testbody()
	{
		String data=get("https://my-json-server.typicode.com/typicode/demo/posts/1").asString();
		long time=get("https://my-json-server.typicode.com/typicode/demo/posts/1").getTime();
		System.out.println("Response time "+time);
	}
}