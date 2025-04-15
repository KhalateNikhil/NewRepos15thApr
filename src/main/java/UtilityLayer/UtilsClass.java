package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	//reusable script code for isDiplayed and isEnabled
	
	
	public static void sendKeys(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
	}
	
}
