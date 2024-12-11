package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdaugaProdusPage extends BasePage {
    public AdaugaProdusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Accept toate']")
    private WebElement acceptCookiesElement;
    @FindBy(xpath = "//a[@aria-label='Close']")
    private WebElement closeNewsletterElement;
    @FindBy(xpath = "//a[text()='Noutati']")
    private WebElement noutatiElement;
    @FindBy(xpath = "//div[@class='item-title']/a[@data-id='39134921']")
    private WebElement carteYalomElement;
    @FindBy(xpath = "//a[@href='/cart/products.jsp?pr_id=39134921&cant=1']")
    private WebElement adaugaInCos;


    public void clickAcceptCookiesButton() {
        elementMethods.clickElement(acceptCookiesElement);
        LoggerUtility.infoLog("The user clicks on the accept cookies button.");
    }

    public void clickCloseNewsletter() {
        elementMethods.clickElement(closeNewsletterElement);
        LoggerUtility.infoLog("The user clicks on the close newsletter button.");
    }

    public void clickNoutati() {
//        elementMethods.waitVisibleElement(promotiileLuniiElement);
        elementMethods.clickElement(noutatiElement);
        LoggerUtility.infoLog("The user clicks on the Noutati button.");
    }

    public void clickCarte() {
        elementMethods.waitVisibleElement(carteYalomElement);
        elementMethods.clickElement(carteYalomElement);
        LoggerUtility.infoLog("The user clicks on the carte Mihai Morar.");
    }

    public void adaugaInCos(){
        elementMethods.waitVisibleElement(adaugaInCos);
        elementMethods.clickElement(adaugaInCos);
        LoggerUtility.infoLog("The user clicks on the adauga in cos.");
    }

}
