package org.pro.tests;

import org.pro.base.TutorialsNinjaBase;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NinjaTutorialsMain extends TutorialsNinjaBase {

	@BeforeSuite
	public void testOne() throws Exception {
		System.out.println(getRetriveProperties("pro").getProperty("url"));
		System.out.println(getRetriveProperties("pro").getProperty("browser"));
		optBrowserAndUrl(properties.getProperty("browser"), properties.getProperty("url"),"pro");
		commonDrivers(driver);
	}
	@Test
	public void TaskOne() throws Exception {
//		homePage.clickSpecificElementOfNavbarElements("My Account");
		homePage.clickSpecificElementOfDropDownOfMyAccount("My Account","Register");
		
	}
}
