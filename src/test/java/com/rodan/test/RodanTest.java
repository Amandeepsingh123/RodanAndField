package com.rodan.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.rodan.base.RodanBase;
import com.rodan.page.RodanPage;

public class RodanTest extends RodanBase{
	
	@Test(priority=0)
	public void testFunc() throws InterruptedException
	{

	driver.get("https://www.rodanandfields.com/ca/businessSys/selectSponsor/SelectSponsorPage");
	//send mary
	RodanPage obj = new RodanPage(driver);
	obj.sendMary();
	obj.clickSearch();
	obj.clickArrow();
	String s = driver.getCurrentUrl();
    Assert.assertTrue(s.contains("searchSponser"));
	
    }
	@Test(priority=1)
	public void testFunc2() throws InterruptedException
	{
		RodanPage obj = new RodanPage(driver);
		obj.mouseShopSkin();
		obj.clickPoduct();
		obj.clickPrice();
//		List<WebElement> alllist = driver.findElements(By.xpath("//span[@class='your-price' and contains(text(),'CAD$ 71.00')]"));
//		Assert.assertTrue(alllist.size()>CAD$50 && alllist.size()<CAD$199.99);
//		
//
//		System.out.println("Number of count "+alllist.size());
		obj.clickRange();
		obj.selectArrow();
		obj.selectLowToHigh();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

	

}
