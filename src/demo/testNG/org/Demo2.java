package demo.testNG.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

	@BeforeSuite
	public void bs() {
		System.out.println("Before suit");
	}

	@BeforeTest
	public void bT()
	{
		System.out.println("Before test");
	}
	@BeforeClass
	public void beforeC() {
		System.out.println("before class");
	}

	@BeforeMethod
	public void bmeforeM() {
		System.out.println("before method");
	}

	@Test
	public void tc1() {
		System.out.println("Hi........tc2");
	}

	@Test
	public void tc2() {
		System.out.println("Hi........tc2");
	}

	@AfterMethod
	public void afterM() {
		System.out.println("after method");

	}
	@AfterClass
	public void aC()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void aT()
	{
		System.out.println("After test");
	}
	
	@AfterSuite
	public void aS()
	{
		System.out.println("After suit");
	}
}
