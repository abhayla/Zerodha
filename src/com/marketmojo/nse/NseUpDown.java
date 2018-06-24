package com.marketmojo.nse;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class NseUpDown 
{
	ArrayList<String> openLow = new ArrayList<String>();
	ArrayList<String> openLowNext50 = new ArrayList<String>();
	ArrayList<String> openHigh = new ArrayList<String>();
	ArrayList<String> openHighNext50 = new ArrayList<String>();
	ArrayList<String> openHighMidcap = new ArrayList<String>();
	ArrayList<String> openLowMidcap = new ArrayList<String>();
	String high, low;
	
	public ArrayList<String>openHigh(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[1]/a"));
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
		
		 //open high
			 if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
			{
				System.out.print("in open high block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				high = driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText();
				openHigh.add(high);
						
			}
		
		 }
		return openHigh;
	}
	//nifty midcap 50 open low
	public ArrayList<String> openLowMidcap(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		Select dropdown = new Select(driv.findElement(By.xpath("//*[@id=\"bankNiftySelect\"]")));
		dropdown.selectByIndex(2);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
			driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText()+"::");
			driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()+"::");
			driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText());
			try
			{
				if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
				{
					System.out.print("in openLowMidcap block");
					System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
					openLowMidcap.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
											
				}
			}
				catch(Exception e)
				{
					if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
					{
						System.out.print("in openLowMidcap block");
						System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						openLowMidcap.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
												
					}
				}
			}
		return openLowMidcap;
		
		
		
		 }
		
		
	
	//nifty midcap 50 open high
	public ArrayList<String> openHighMidcap(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		Select dropdown = new Select(driv.findElement(By.xpath("//*[@id=\"bankNiftySelect\"]")));
		dropdown.selectByIndex(2);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
			try
			{
				System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText()+"::");
				driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()+"::");
				driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText());
			}
			catch(StaleElementReferenceException e)
			{
				System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText()+"::");
				driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.print(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()+"::");
				driv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText());
			}
			
		 //open high
		//	 if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
			 try
			 {
				 if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
				 {
						System.out.print("in openHighMidcap method try");
						System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						openHighMidcap.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
								
					}
			 }
			 catch(StaleElementReferenceException e)
			 {
				 driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
				 {
						System.out.print("in openHighMidcap method catch");
						System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						openHighMidcap.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
								
					}
				 else
				 {
					 System.out.println("no data for midcap open high");
				 }
				 
			 }
			/*{
				System.out.print("in open high 50 block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				openHighNext50.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						
			}*/
		
		 }
		
		return openHighMidcap;
	}
	//open high for next 50
	public ArrayList<String>openHigh50(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[1]/a"));
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Select dropdown = new Select(driv.findElement(By.xpath("//*[@id=\"bankNiftySelect\"]")));
		dropdown.selectByIndex(1);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
		
		 //open high
		try
		{
			if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
			{
				System.out.print("in open high 50 block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				openHighNext50.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						
			}
		}
		catch(StaleElementReferenceException e)
		{
			if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
			{
				System.out.print("in open high 50 block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				openHighNext50.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
						
			}
		}
		
		 }
		return openHighNext50;
	}
	
	
	public ArrayList<String>openLow(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[1]/a"));
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
		
		 //open low
			if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
			{
				System.out.print("in open low block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				openLow.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
										
			}
		
		 }
		return openLow;
	}
	
	//open low next 50
	public ArrayList<String>openLowNext50(ChromeOptions chrome, WebDriver driv)
	{
		driv.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
		Select dropdown = new Select(driv.findElement(By.xpath("//*[@id=\"bankNiftySelect\"]")));
		dropdown.selectByIndex(1);
		driv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i = 3;i<53;i++)
		 {
		
		 //open low
			if((driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
			{
				System.out.print("in open low 50 block");
				System.out.println(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				openLowNext50.add(driv.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
										
			}
		
		 }
		return openLowNext50;
	}
	
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
