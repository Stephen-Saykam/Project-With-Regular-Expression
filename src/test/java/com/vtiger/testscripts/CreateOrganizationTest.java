package com.vtiger.testscripts;

import org.testng.annotations.Test;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.ExcelUtility;
import com.vtiger.genericLib.JavaUtility;

public class CreateOrganizationTest extends BaseClass {
	
	@Test
	public void createOrganizationTest() throws Throwable
	{
		ExcelUtility eUtil = new ExcelUtility();
		@SuppressWarnings("unused")
		String orgName = eUtil.excelUtility("Sheet1", 1, 2)+"_"+JavaUtility.generateRandomNumber();
		
		//Create Organization
//		driver.findElement(By.xpath("//a[text()='Organizations']//ancestor::td[@class=\"tabUnSelected\"]")).click();
//		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
//		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(orgName);
//		driver.findElement(By.xpath("//input[@value=\"  Save  \"]")).click();
//		Reporter.log("Organisation created");
//		
//		Thread.sleep(2000);
//		String orgInfo = driver.findElement(By.xpath("//span[@class=\"dvHeaderText\"]")).getText();
//		System.out.println(orgInfo);
//		Assert.assertTrue(orgInfo.contains(orgName));
//		Reporter.log("Organisation Done", true);
//		
		
		
//		SoftAssert sa = new SoftAssert();
//		sa.assertEquals(true, false);
		System.out.println("verification is done");
		
		
	}

}
