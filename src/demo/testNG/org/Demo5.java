package demo.testNG.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo5 {

	@Test(groups = "smoke", priority = 3)
	public void tc1() {
		Reporter.log("Hey1...!", true);
	}

	@Test(groups = "regration", dependsOnGroups = "functional")
	public void tc2() {
		Reporter.log("Hey2...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc3() {
		Reporter.log("Hey3...!", true);
	}

	@Test(groups = "smoke", priority = 2)
	public void tc4() {
		Reporter.log("Hey4...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke", priority = -3)
	public void tc5() {
		Reporter.log("Hey5...!", true);
	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc6() {
		Reporter.log("Hey6...!", true);

	}

	@Test(groups = "functional", dependsOnGroups = "smoke")
	public void tc7() {
		Reporter.log("Hey7...!", true);

	}

}
