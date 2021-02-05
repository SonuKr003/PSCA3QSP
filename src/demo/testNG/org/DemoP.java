package demo.testNG.org;

import org.testng.annotations.Test;

public class DemoP {
	
	@Test(dataProvider = "demo",dataProviderClass = DemoReadData.class)

}
