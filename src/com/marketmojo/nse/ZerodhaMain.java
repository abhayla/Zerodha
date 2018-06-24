package com.marketmojo.nse;

import java.util.ArrayList;

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
		ArrayList<String> highOpen;
		ArrayList<String> lowOpen;
		ArrayList<String> highOpen50;
		ArrayList<String> lowOpen50;
		ArrayList<String> openHighMid;
		ArrayList<String> openLowMid;
		
		// TODO Auto-generated method stub
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sushil.Gupta\\Documents\\Jars\\Selenium\\chromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driv = new ChromeDriver(chrome);
//		WebDriver driv = new ChromeDriver();
		NseUpDown nse = new NseUpDown();
		ZerodhaTrigger zt = new ZerodhaTrigger();
		stockslistLooser50 = (String[])nse.marketLooser50(chrome, driv);
		stockslistLooserNext50 = (String[])nse.marketLooserNext50(chrome, driv);		
		stockslistLooserNext50 = (String[])nse.marketLooserNext50(chrome, driv);
		fno = (String[])nse.FnoActivity(chrome, driv);
		gainer_50= (String[])nse.gainer50(chrome, driv);
		gainer_next50 = (String[])nse.gainernext50(chrome, driv);
		fnoLooser = (String[])nse.gainerfno(chrome, driv);
		highOpen = nse.openHigh(chrome, driv);
		lowOpen = nse.openLow(chrome, driv);
		lowOpen = nse.openLow(chrome, driv);
		highOpen50 = nse.openHigh50(chrome, driv);
		lowOpen50 = nse.openLowNext50(chrome, driv);
		openHighMid = nse.openHighMidcap(chrome, driv);
		openLowMid =  nse.openLowMidcap(chrome, driv);
		
		zt.gainer(chrome, driv, stockslistLooser50);
//		stockslistLooserNext50 = (String[])nse.marketLooserNext50(chrome, driv);
	
		zt.next500(chrome, driv, stockslistLooserNext50);
		
//		fno = (String[])nse.FnoActivity(chrome, driv);
		zt.fnogainer(chrome, driv, fno);
		System.out.println("fno completed");
		
//		gainer_50= (String[])nse.gainer50(chrome, driv);
		zt.gain50(chrome, driv, gainer_50);
		System.out.println("gainer_50 completed");
		
//		gainer_next50 = (String[])nse.gainernext50(chrome, driv);
		zt.gainNext50(chrome, driv, gainer_next50);
		
//		fnoLooser = (String[])nse.gainerfno(chrome, driv);
		zt.fnoLooser(chrome, driv, fnoLooser);
		
//		highOpen = nse.openHigh(chrome, driv);
		zt.openHighTrigger(chrome, driv, highOpen);
		
//		lowOpen = nse.openLow(chrome, driv);
		zt.openLowTrigger(chrome, driv, lowOpen);
		
//		highOpen50 = nse.openHigh50(chrome, driv);
		zt.openHighNext50Trigger(chrome, driv, highOpen50);
		
//		lowOpen50 = nse.openLowNext50(chrome, driv);
		System.out.println("In main after lowOpen50");
		zt.openLowNext50Trigger(chrome, driv, lowOpen50);
		
//		openHighMid = nse.openHighMidcap(chrome, driv);
		zt.openHighMidcapTrigger(chrome, driv, openHighMid);		
		
//		openLowMid =  nse.openLowMidcap(chrome, driv);
		zt.openLowMidcapTrigger(chrome, driv, openLowMid);
	}

}
