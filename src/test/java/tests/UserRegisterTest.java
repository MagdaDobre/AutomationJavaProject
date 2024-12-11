package tests;

import configFiles.DataConfig;
import modelObject.UserModel;
import org.testng.annotations.Test;
import pages.HomePage;
import sharedData.Hooks;

public class UserRegisterTest extends Hooks {

    @Test
    public void metodaTest(){
        UserModel testData = new UserModel(DataConfig.USER_DATA);

        HomePage homePage = new HomePage(getDriver());

        homePage.clickAcceptCookiesButton();
        homePage.clickCloseNewsletter();

        homePage.clickCreeazaCont();

        homePage.fillEntireForm(testData);
    }
}
