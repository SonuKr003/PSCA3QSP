package demo.testNG.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {

	@Test(priority = 1, invocationCount = 2)
	public void tc1() {
		Reporter.log("Hey1...!", true);
	}

	@Test(priority = 0)
	public void tc2() {
		Reporter.log("Hey2...!", true);

	}

	@Test(priority = -3)
	public void tc3() {
		Reporter.log("Hey3...!", true);

	}

	@Test(dependsOnMethods = "tc1")
	public void tc3_1() {
		Reporter.log("Hey3_1...!", true);

	}

	@Test(enabled = false) // if we don't want to execute tc4 and by default enabled is true
	public void tc4() {
		Reporter.log("Hey4...!", true);
	}

	@Test(invocationCount = 0) // if we don't want to execute tc4 make invocationCount=0.
	public void tc5() {
		Reporter.log("Hey5...!", true);
	}

	@Test()
	public void tc6() {
		Reporter.log("Hey6...!", true);

	}
	@Test(priority = -3)
	public void tc7() {
		Reporter.log("Hey7...!", true);

	}

}