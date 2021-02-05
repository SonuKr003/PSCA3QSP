package demo.DataProvider.testNG;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {

	@Test
	public void tc() {
		String st1 = "abc";
		String st2 = "abc";

		Assert.assertEquals(st1, st2);
		Reporter.log("Matched", true);

		List<Object> lst1 = new ArrayList<>();
		lst1.add(true);
		lst1.add("abc");
		lst1.add(99);
		lst1.add(90.05);

		List<Object> lst2 = new ArrayList<>();
		lst2.add(true);
		lst2.add("abc");
		lst2.add(99);
		lst2.add(90.05);

		Assert.assertEquals(lst1, lst2);
		Reporter.log("Matched2", true);
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ABC", "ABC");
		Reporter.log("MatchedSA",true);
		sa.assertAll();               // to check which one is failes
		Assert.fail();

	}
}
