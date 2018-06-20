package com.marketmojo.nse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaTrigger {

	public ZerodhaTrigger() {
		// TODO Auto-generated constructor stub
	}
	
	void gainer(ChromeOptions chrome, WebDriver driv, String[] stockslist)
	{
		
		driv.manage().window().maximize();
		driv.get("https://kite.zerodha.com/");
		driv.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("YD3179");
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.findElement(By.xpath("//INPUT[@type='password']")).sendKeys("Nodejs22#");
		driv.findElement(By.xpath("//BUTTON[@type='submit']")).click();
		driv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/form/div[3]/div/input")).sendKeys("0812715");
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driv.findElement(By.xpath("(//INPUT[@type='password'])[1]")).sendKeys("0812715");
		driv.findElement(By.xpath("//BUTTON[@type='submit']")).click();
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driv.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/ul/li[3]")).click();
		for(int i=0; i<10;i++ )
		{
			try
			{
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
				driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			catch(NullPointerException e)
			{
				i++;
				System.out.println("in catch");
			}
			
			
		}
		

		System.out.println("Successful!!");

	}
	
	void next500(ChromeOptions chrome, WebDriver driv, String[] stockslist)
	{
		driv.get("https://kite.zerodha.com/");
		
		
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		for(int i=0; i<10;i++ )
		{
			try
			{
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
				driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			catch(NullPointerException e)
			{
				i++;
				System.out.println("in catch next 50");
			}
	}

	}
	//fno gainer
	void fnogainer(ChromeOptions chrome, WebDriver driv, String[] stockslist)
	{
		driv.get("https://kite.zerodha.com/");
		
		
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		for(int i=0; i<10;i++ )
		{
			try
			{
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
				driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			catch(NullPointerException e)
			{
				i++;
				System.out.println("in catch next 50");
			}
	}

	}
	//looser 50 entry in zerodha
	void gain50(ChromeOptions chrome, WebDriver driv, String[] stockslist)
	{
		driv.get("https://kite.zerodha.com/");
		driv.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/ul/li[2]")).click();
		
		
		driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		for(int i=0; i<10;i++ )
		{
			try
			{
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
				driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
				driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
			catch(NullPointerException e)
			{
				i++;
				System.out.println("in gain 50");
			}
	}

	}
	
	//looser next 50 entry in zerodha
		void gainNext50(ChromeOptions chrome, WebDriver driv, String[] stockslist)
		{
			driv.get("https://kite.zerodha.com/");
			driv.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/ul/li[2]")).click();
			
			
			driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			for(int i=0; i<10;i++ )
			{
				try
				{
					driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
					driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
					driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				catch(NullPointerException e)
				{
					i++;
					System.out.println("in gain 50");
				}
		}
			System.out.println("gainer next 50 completed");

		}
	//looser fno	
		void fnoLooser(ChromeOptions chrome, WebDriver driv, String[] stockslist)
		{
			driv.get("https://kite.zerodha.com/");
			driv.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div[1]/div/ul/li[2]")).click();
			
			
			driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			for(int i=0; i<10;i++ )
			{
				try
				{
					driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(stockslist[i].toString());
					driv.findElement(By.xpath("//*[@id=\"search-input\"]")).sendKeys(Keys.ENTER);
					driv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				}
				catch(NullPointerException e)
				{
					i++;
					System.out.println("fno looser");
				}
		}
			System.out.println("fno looser completed");

		}
}
