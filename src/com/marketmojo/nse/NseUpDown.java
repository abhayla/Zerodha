package com.marketmojo.nse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class NseUpDown 
{

	public String[] marketLooser50(ChromeOptions chrome, WebDriver driv)
	{
		String [] stocks = new String[20]; 
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driv = new ChromeDriver();
		//driv.manage().window().maximize();
		//WebDriver driv = new FirefoxDriver();
		System.out.println("driver object is created");
		driv.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		
		//WebElement str = driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr[11]/td[1]"));
		//String str1 = str.getText();
		//System.out.println("str1="+str1);
		String str2;
		
		WebElement web;
		for(int i = 2; i<=11; i++)
		{
			str2 = "/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr["+i+"]/td[1]";
			web = driv.findElement(By.xpath(str2));
			System.out.println("str1="+web.getText());
			stocks[i-2] = web.getText();
			
		}
	return stocks;
	
	

	}

	public String[] marketLooserNext50(ChromeOptions ch1, WebDriver driv1)
	{
		String [] stocks1 = new String[20]; 		
		driv1.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		driv1.findElement(By.xpath("//*[@id=\"GjrNifty\"]")).click();
		//String str3 = "//*[@id=\"topGainers\"]/tbody/tr["+i+"]/td[1]/a";
		
		WebElement web = null;
		for(int i = 2; i<=11; i++)
		try
		{
			driv1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv1.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in lossernext50 method = "+web.getText());
			stocks1[i-2] = web.getText();
		}
		catch(StaleElementReferenceException e)
		{
			driv1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv1.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in lossernext50 method = "+web.getText());
			stocks1[i-2] = web.getText();
			
		}
	return stocks1;	
	}
	
	public String[] FnoActivity(ChromeOptions ch1, WebDriver driv2)
	{
		String [] stocks2 = new String[20]; 		
		driv2.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		driv2.findElement(By.xpath("//*[@id=\"Gfno\"]")).click();
		//String str3 = "//*[@id=\"topGainers\"]/tbody/tr["+i+"]/td[1]/a";
		
		WebElement web = null;
		for(int i = 2; i<=11; i++)
		try
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in lossernext50 method = "+web.getText());
			stocks2[i-2] = web.getText();
		}
		catch(StaleElementReferenceException e)
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in activity method = "+web.getText());
			stocks2[i-2] = web.getText();
			
		}
	return stocks2;	
	}
	
	public String[] gainer50(ChromeOptions ch1, WebDriver driv2)
	{
		String [] stocks2 = new String[20]; 		
		driv2.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		driv2.findElement(By.xpath("//*[@id=\"tab8\"]")).click();
		//String str3 = "//*[@id=\"topGainers\"]/tbody/tr["+i+"]/td[1]/a";
		
		WebElement web = null;
		for(int i = 2; i<=11; i++)
		try
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer 50 try = "+web.getText());
			stocks2[i-2] = web.getText();
		}
		catch(StaleElementReferenceException e)
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer 50 catch = "+web.getText());
			stocks2[i-2] = web.getText();
			
		}
	return stocks2;	
	}
	//next 50 looser
	public String[] gainernext50(ChromeOptions ch1, WebDriver driv2)
	{
		String [] stocks2 = new String[20]; 		
		driv2.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		driv2.findElement(By.xpath("//*[@id=\"tab8\"]")).click();
		driv2.findElement(By.xpath("//*[@id=\"LjrNifty\"]")).click();
		//String str3 = "//*[@id=\"topGainers\"]/tbody/tr["+i+"]/td[1]/a";
		
		WebElement web = null;
		for(int i = 2; i<=11; i++)
		try
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer next 50 try = "+web.getText());
			stocks2[i-2] = web.getText();
		}
		catch(StaleElementReferenceException e)
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer next 50 catch = "+web.getText());
			stocks2[i-2] = web.getText();
			
		}
	return stocks2;	
	}
	
	//looser fno
	public String[] gainerfno(ChromeOptions ch1, WebDriver driv2)
	{
		String [] stocks2 = new String[20]; 		
		driv2.get("https://www.nseindia.com/live_market/dynaContent/live_analysis/top_gainers_losers.htm");
		driv2.findElement(By.xpath("//*[@id=\"tab8\"]")).click();
		driv2.findElement(By.xpath("//*[@id=\"Lfno\"]")).click();
		//String str3 = "//*[@id=\"topGainers\"]/tbody/tr["+i+"]/td[1]/a";
		
		WebElement web = null;
		for(int i = 2; i<=11; i++)
		try
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer fno try = "+web.getText());
			stocks2[i-2] = web.getText();
			System.out.println("gainer fno completed");
		}
		catch(StaleElementReferenceException e)
		{
			driv2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			web = driv2.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div[3]/div[2]/div[2]/div[2]/table/tbody/tr["+i+"]/td[1]/a"));
			System.out.println("in gainer fno catch = "+web.getText());
			stocks2[i-2] = web.getText();
			
		}
	return stocks2;	
	}
}
