package com.qa.opencart.factory;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {

	private Properties prop;
	private ChromeOptions co;
	private FirefoxOptions fo;
	private EdgeOptions eo;

	public OptionsManager(Properties prop) {
		this.prop = prop;
	}

	public ChromeOptions getChromeOptions() {
		co = new ChromeOptions();

		if(Boolean.parseBoolean(prop.getProperty("remote"))) {
			co.setCapability("enableVNC", true);
			co.setPlatformName("linux");
			co.setBrowserVersion(prop.getProperty("browserversion"));
		}


		if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println(".....Running the test in Headless mode.......");
			co.setHeadless(true);
		}
		return co;
	}

	public FirefoxOptions getFirefoxOptions() {
		fo = new FirefoxOptions();

		if(Boolean.parseBoolean(prop.getProperty("remote"))) {
			fo.setCapability("enableVNC", true);
			fo.setPlatformName("linux");
			fo.setBrowserVersion(prop.getProperty("browservrsion"));
		}

		if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println(".....Running the test in Headless mode.......");
			fo.setHeadless(true);
	
		}
		return fo;
	}


	public EdgeOptions getEdgeOptions() {
		eo = new EdgeOptions();

		if(Boolean.parseBoolean(prop.getProperty("remote"))) {
			eo.setCapability("enableVNC", true);
			eo.setPlatformName("linux");
		//	eo.setBrowserVersion(prop.getProperty("browservrsion"));   not using edge so need to write
		}

		if (Boolean.parseBoolean(prop.getProperty("headless"))) {
			System.out.println(".....Running the test in Headless mode.......");
			eo.setHeadless(true);
		}
		if (Boolean.parseBoolean(prop.getProperty("incognito"))) {
			System.out.println(".....Running the test in Incognito mode.......");
			eo.addArguments("--incognito");
		}
		return eo;
	}

}

