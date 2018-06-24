package com.marketmojo.nse;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class OpenHighLow {
	WebDriver web;
	String s1,s2, s3, low, high;
	String[] s4, s5;
	int j=0, k=0;
	ArrayList<String> openLow = new ArrayList<String>();
	ArrayList<String> openHigh = new ArrayList<String>();
	ListIterator<String> itr = openHigh.listIterator();
	
	{
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		web = new ChromeDriver(chrome);
		
	}

	ArrayList<String> openHighTest()
  {
	 web.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
	 web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[1]/a"));
	 web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 for(int i = 3;i<53;i++)
	 {
	
	 //open high
		 if((web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
		{
			System.out.print("in open high block");
			System.out.println(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
			high = web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText();
			openHigh.add(high);
					
		}
	
		 //open low
		 if((web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
			{
				
			openLow.add(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());

			 System.out.print("open low");
			 	System.out.println(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				for(String s: openLow)
				 {
					 System.out.println("OpenLow"+s);
				 }

			}	 
		 
	 
	 
 }
	 web.close(); 
	return openHigh;
  } 
}