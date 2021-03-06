package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {
	
	static String roundTrip_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td"
				+ "/form/table/tbody/tr[2]/td[2]/b/font/input[1]";
	static String oneWay_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody"
				+ "/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td"
				+ "/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	
	static String passCount_name = "passCount";
	static String fromPort_name = "fromPort";
	static String fromMonth_name = "fromMonth";
	static String fromDay_name = "fromDay";
	static String toPort_name = "toPort";
	static String toMonth_name = "toMonth";
	static String toDay_name = "toDay";
	static String airLine_name = "airline";
	static String findFlights_name = "findFlights";
	
	
	
	static String serviceEco_xpath = "/html/body/div/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
			+ "td/form/table/tbody/tr[9]/td[2]/font/input";
			
	static String serviceBiz_xpath = "/html/body/div/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
			+ "td/form/table/tbody/tr[9]/td[2]/font/font/input[1]";
	
	static String serviceFirst_xpath = "/html/body/div/table/tbody/tr/td[2]/"
			+ "table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
			+ "td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";
	
	public WebElement radio_roundTrip(WebDriver driver){
		return driver.findElement(By.xpath(roundTrip_xpath));
	}
	
	public WebElement radio_oneWay(WebDriver driver){
		return driver.findElement(
				By.xpath(oneWay_xpath));
	}
	
	public void selectPassengersCount(WebDriver driver, String visibleText_passCount){
		Select passengers = new Select(driver.findElement(By.name(passCount_name)));
		passengers.selectByVisibleText(visibleText_passCount);
	}
	
	public Select selectPassengersCount(WebDriver driver){
		Select passengers = new Select(driver.findElement(By.name(passCount_name)));
		//passengers.selectByVisibleText(visibleText_passCount);
		return passengers;
	}

	public void selectDepartingFrom(WebDriver driver, String visibleText_depFrom){
		Select departingfrom = new Select(driver.findElement(By.name(fromPort_name)));
		departingfrom.selectByVisibleText(visibleText_depFrom);
	}
	
	public void selectFromMonth(WebDriver driver, String visibleText_fromMonth){
		Select on = new Select(driver.findElement(By.name("fromMonth")));
		on.selectByVisibleText(visibleText_fromMonth);
	}
	
	public void selectFromDay(WebDriver driver, String visibleText_fromDay){
		Select on2 = new Select(driver.findElement(By.name("fromDay")));
		on2.selectByVisibleText(visibleText_fromDay);
	}
	
	public void selectToPort(WebDriver driver, String visibleText_toPort){
		Select arrivingIn = new Select(driver.findElement(By.name("toPort")));
		arrivingIn.selectByVisibleText(visibleText_toPort);
	}
	
	public void selectToMonth(WebDriver driver, String visibleText_toMonth){
		Select returning = new Select(driver.findElement(By.name("toMonth")));
		returning.selectByVisibleText(visibleText_toMonth);
	}
	
	public void selectToDay(WebDriver driver, String visibleText_toDay){
		Select returning2 = new Select(driver.findElement(By.name("toDay")));
		returning2.selectByVisibleText(visibleText_toDay);
	}
	
	
	public WebElement radioChooseClass_economy(WebDriver driver){
		return driver.findElement(By.xpath(serviceEco_xpath));
	}
	
	public WebElement radioChooseClass_business(WebDriver driver){
		return driver.findElement(By.xpath(serviceBiz_xpath));
	}
	
	public WebElement radioChooseClass_first(WebDriver driver){
		return driver.findElement(By.xpath(serviceFirst_xpath));
	}
	
	
	public void selectAirline(WebDriver driver, String visibleText){
		Select airline = new Select(driver.findElement(By.name(airLine_name)));
		airline.selectByVisibleText(visibleText);
	}

	public WebElement buttonFindFlights(WebDriver driver){
		return driver.findElement(By.name(findFlights_name));
	}
}
