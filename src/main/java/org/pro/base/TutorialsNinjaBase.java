package org.pro.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pro.pages.TutorialsNinjaHomePage;

public class TutorialsNinjaBase {

	public static Properties properties;
	public static FileInputStream fileInputStream;
	public static WebDriver driver;
	public static TutorialsNinjaHomePage homePage;
	public static Properties getRetriveProperties(String propFileName) {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\org\\pro\\properties\\"+propFileName+".properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}
	public static WebDriver optBrowserAndUrl(String browserName,String urlLink,String propFileName) {
		getRetriveProperties(propFileName);
		if (getRetriveProperties(propFileName).getProperty("browser").toLowerCase().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(getRetriveProperties(propFileName).getProperty("browser").toLowerCase().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		driver.get(urlLink.toLowerCase());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		return driver;
		
	}
	public WebDriver commonDrivers(WebDriver driver) {
		homePage = new TutorialsNinjaHomePage(driver);
		return driver;
	}
}
