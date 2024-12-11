package tests;

import org.testng.annotations.Test;
import pages.AdaugaProdusPage;
import sharedData.Hooks;

public class AdaugaProdusTest extends Hooks {
    @Test
    public void metodaTest(){
        AdaugaProdusPage adaugaProdus = new AdaugaProdusPage(getDriver());

        adaugaProdus.clickAcceptCookiesButton();
        adaugaProdus.clickCloseNewsletter();
        adaugaProdus.clickNoutati();
        adaugaProdus.clickCarte();
        adaugaProdus.adaugaInCos();
    }
}
