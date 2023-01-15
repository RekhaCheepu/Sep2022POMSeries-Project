package com.qa.opencart.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.AppConstants;
import com.qa.opencart.utils.ExcelUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
@Epic("Epic -400:Design Registation Page for open cart shopping application")
@Story("UserStory -401 :Registration Page functionality for Registation Page Page")
public class RegPageTest extends BaseTest{

	@BeforeClass
	public void regPageSetup() {
		regPage=loginPage.navigateToRegisterPage();
	}
	public String getRandomEmail() {
		Random random=new Random();
	String email="septautomation"+random.nextInt(5000)+"@gmail.com";
	return email;
	}
	
	@DataProvider
	public Object[][] getRegTestData() {
		Object regData[][]=ExcelUtil.getTestData(AppConstants.REGISTER_SHEET_NAME );
		
		return regData;
	}
	@Description("register User Test")
	@Severity(SeverityLevel.BLOCKER)
	@Test(dataProvider="getRegTestData")
	public void registerUserTest(String firstName,String lastName,String telephone,
			String password,String subscribe) {
	
		boolean flag=regPage.registerUser( firstName, lastName, getRandomEmail(), telephone,
				 password, subscribe);
	Assert.assertTrue(flag);
	}
}

