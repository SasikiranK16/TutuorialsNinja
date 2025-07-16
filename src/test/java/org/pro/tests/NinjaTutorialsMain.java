package org.pro.tests;

import org.pro.base.TutorialsNinjaBase;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NinjaTutorialsMain extends TutorialsNinjaBase {

	@Test
	public void testOne() throws Exception {
		System.out.println(getRetriveProperties("pro").getProperty("url"));
		System.out.println(getRetriveProperties("pro").getProperty("browser"));
	}
}
