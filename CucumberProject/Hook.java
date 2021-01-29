package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseClass {
	
	@Before
	public void OpenUrl() {
		driver.get("https://alchemy.hguy.co/jobs/");
	}
	@After
	public void teardown() {
		driver.close();
	}

}
