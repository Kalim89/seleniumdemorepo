package TestNgFramework;

import org.testng.annotations.Test;

public class TestNgFreature {
@Test
public void LogInTest()
{
	System.out.println("Login to app");
}
@Test(dependsOnMethods="LogInTest",invocationCount=10)
public void Homepage()
{
	System.out.println("Home Page Open");
}
}
