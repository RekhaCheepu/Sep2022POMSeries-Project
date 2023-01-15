package com.qa.opencart.factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariOptions;

public class OptionsManager {
	
	private Properties prop;
	private ChromeOptions co;
	private FirefoxOptions fo;
	//private SafariOptions sf;
	private EdgeOptions eg;
	public SafariOptions getSafariOptions;
	public OptionsManager(Properties prop) {
		this.prop=prop;
	}
	
	public ChromeOptions getChromeOptions() {
		co= new ChromeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println("Running the test in HeadlessMode");
			co.setHeadless(true);
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			System.out.println("Running the test in incognitomode");
			co.addArguments("--incognito");
		}
		return co;
	}
	
	public FirefoxOptions getFirefoxOptions() {
		fo= new FirefoxOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println("Running the test in HeadlessMode");
			fo.setHeadless(true);
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			System.out.println("Running the test in incognitomode");
			fo.addArguments("--incognito");
		}
		return fo;
	}
//	public SafariOptions getSafariOptions() {
//		sf= new SafariOptions();
//		if(Boolean.parseBoolean(prop.getProperty("headless"))) {
//			sf.setHeadless(true);
//		}
//		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
//			sf.addArguments("--incognito");
//		}
//		return sf;
//	}
	public EdgeOptions getEdgeOptions() {
		eg= new EdgeOptions();
		if(Boolean.parseBoolean(prop.getProperty("headless"))) {
			eg.setHeadless(true);
		}
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) {
			eg.addArguments("--incognito");
		}
		return eg;
	}
	

}
