package com.marketmojo.nse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class OpenHighLow {
	WebDriver web;
	String s1,s2, s3;
	String[] s4, s5;
	int j=0, k=0;
	
	{
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		web = new ChromeDriver(chrome);
		
	}

	public OpenHighLow() {
		// TODO Auto-generated constructor stub
	}
 void openHigh()
 {
	 web.get("https://nseindia.com/live_market/dynaContent/live_watch/equities_stock_watch.htm");
	 web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[1]/a"));
	 web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 for(int i = 3;i<53;i++)
	 {
	/*	 System.out.print(i+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
		 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText());
		 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText());
		 System.out.println();*/
		 
/*		 if((Integer.Pa).equals(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
		 {
			 System.out.print(i+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
			 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText());
			 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText());
		 }
*/		 //open high
		 if((web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[5]")).getText()))
		{
			System.out.println(j);
			 //s4[j] = web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText();
			System.out.println(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
			
			
		}
		 //open low
		 if((web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText()).equals(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText()))
			{
				s5[k] = web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText();
				System.out.println(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
				k++;
				
			}	 
		 
	/*	 System.out.println(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[4]")).getText());
		 float ff = Float.parseFloat(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[4]")).getText());
		 System.out.println("ff : "+ff);
		 if((web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText())==(web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr[3]/td[5]")).getText()))
		 {
			 System.out.print(i+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[1]/a")).getText());
			 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[4]")).getText());
			 System.out.print("  "+" "+web.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[3]/div[2]/div[3]/table/tbody/tr["+i+"]/td[6]")).getText());
		 }*/

	 }
	 web.close();
 }
 
}