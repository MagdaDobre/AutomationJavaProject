package tests;

import configFiles.DataConfig;
import modelObject.CosModel;
import modelObject.UserModel;
import org.testng.annotations.Test;
import pages.AdaugaProdusPage;
import pages.CosPage;
import pages.HomePage;
import sharedData.Hooks;

public class CosTest extends Hooks {

    @Test
    public void metodaTest() {
        CosModel testData = new CosModel(DataConfig.COS_DATA);

        CosPage cosPage = new CosPage(getDriver());

        cosPage.clickAcceptCookiesButton();
        cosPage.clickCloseNewsletter();

        cosPage.clickCarte();
        cosPage.adaugaInCos();

        cosPage.fillEntireForm(testData);
    }
}
