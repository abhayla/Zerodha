package com.marketmojo.nse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZerodhaMain {

	public ZerodhaMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] stockslistLooser50;
		String[] stockslistLooserNext50;
		String[] fno;
		String[] gainer_50;
		String[] gainer_next50;
		String[] fnoLooser;
		// TODO Auto-generated method stub
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driv = new ChromeDriver(chrome);
//		WebDriver driv = new ChromeDriver();
		NseUpDown nse = new NseUpDown();
		stockslistLooser50 = (String[])nse.marketLooser50(chrome, driv);
		for(int i =0; i<10;i++)
		{
			System.out.println("In main"+stockslistLooser50[i]);
		}
		
		stockslistLooserNext50 = (String[])nse.marketLooserNext50(chrome, driv);
		for(int i =0; i<10;i++)
		{
			System.out.println("Next 50 "+i+" "+stockslistLooserNext50[i]);
		}
		ZerodhaTrigger zt = new ZerodhaTrigger();
		zt.gainer(chrome, driv, stockslistLooser50);
		stockslistLooserNext50 = (String[])nse.marketLooserNext50(chrome, driv);
		for(int i =0; i<10;i++)
		{
			System.out.println("next 50"+i+stockslistLooserNext50[i]);
		}
		zt.next500(chrome, driv, stockslistLooserNext50);
		
		fno = (String[])nse.FnoActivity(chrome, driv);
		zt.fnogainer(chrome, driv, fno);
		System.out.println("fno completed");
		
		gainer_50= (String[])nse.gainer50(chrome, driv);
		zt.gain50(chrome, driv, gainer_50);
		System.out.println("gainer_50 completed");
		
		gainer_next50 = (String[])nse.gainernext50(chrome, driv);
		zt.gainNext50(chrome, driv, gainer_next50);
		
		fnoLooser = (String[])nse.gainerfno(chrome, driv);
		zt.fnoLooser(chrome, driv, fnoLooser);
		
	}

}
