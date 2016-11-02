package com.rodan.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RodanPage {

	WebDriver driver;
	private By mary = By.xpath("//input[@id='sponserparam']");
	private By clicksearch = By.xpath("//button[@id='search-sponsor-button']");
	private By clickarrow = By.xpath("//a[@class='next']");
	private By mouseover = By.xpath("//*[@id='our-products']");
	private By clickproduct = By.xpath("//*[@id='dropdown-menu']/li[7]/div/a");
	private By pricelist = By.xpath("//input[@class='refine-products-button' and @value='- Price -']");
	private By clickrange = By.xpath("//div[@class='dropdown-items text-left pull-left' and contains(text(),'CAD$50 TO CAD$199.99')]");
	private By selectarrow = By.xpath("//select[@id='sortOptions']");
	private By selectlowtohigh = By.xpath("//option[@id='sort_code' and contains(text(),'Price: low to high')]");

	public RodanPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void sendMary()
	{
	 driver.findElement(mary).sendKeys("mary");	
	}
	public void clickSearch()
	{
	 driver.findElement(clicksearch).click();	
	}
	public void clickArrow()
	{
	 driver.findElement(clickarrow).click();	
	}
	public void mouseShopSkin()
	{
		WebElement menu = driver.findElement(mouseover);
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).build().perform();
	}
	public void clickPoduct()
	{
	 driver.findElement(clickproduct).click();	
	}
	public void clickPrice()
	{
	 driver.findElement(pricelist).click();	
	}
	public void clickRange()
	{
	 driver.findElement(clickrange).click();	
	}
	public void selectArrow()
	{
	 driver.findElement(selectarrow).click();	
	}
	public void selectLowToHigh()
	{
	driver.findElement(selectlowtohigh).click();	
	}


}
