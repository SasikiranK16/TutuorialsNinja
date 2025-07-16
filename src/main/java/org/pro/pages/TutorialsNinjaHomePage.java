package org.pro.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsNinjaHomePage {
	public WebDriver driver;

	public TutorialsNinjaHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[starts-with(@class,'hidden-xs hidden-sm hidden-md')]")
	private List<WebElement> navBarElements;
	@FindBy(tagName = "a")
	private List<WebElement> myAccountDropDown;

	public void clickSpecificElementOfDropDownOfMyAccount(String NavBarElementName, String innerDropDownElement) {
		clickSpecificElementOfNavbarElements(NavBarElementName);
		myAccountDropDown.stream().filter(p -> p.getAttribute("innerText").contains(innerDropDownElement)).findFirst().orElse(null)
				.click();
//		myAccountDropDown.stream().forEach(p->System.out.println(p.getAttribute("innerText")));
		
	}

	public void clickSpecificElementOfNavbarElements(String elementName) {
		navBarElements.stream().filter(p -> p.getAttribute("innerText").contains(elementName)).findFirst().orElse(null)
				.click();
//		navBarElements.stream().forEach(p->System.out.println(p.getAttribute("innerText")));
	}
}
