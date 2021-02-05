package demo.testNG.org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {

	@Test(invocationCount = 5) // execute same tc multiple time with diff.. i/p so we go for invocationcount
	public void tc() {
		Reporter.log("Hey...!", true);
		// Reporter.log("bye...!",true);

	}

}
