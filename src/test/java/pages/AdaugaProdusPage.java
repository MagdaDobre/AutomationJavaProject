package pages;

import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//div[@class='item-title']/a[@data-id='39135495']")
    private WebElement carteAutonomieElement;
    @FindBy(xpath = "//a[@href='/cart/products.jsp?pr_id=39135495&cant=1']")
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
        elementMethods.waitVisibleElement(noutatiElement);
        elementMethods.clickJSElement(noutatiElement);
        LoggerUtility.infoLog("The user clicks on the Noutati button.");
    }

    public void clickCarte() {
        elementMethods.waitVisibleElement(carteAutonomieElement);
        elementMethods.clickElement(carteAutonomieElement);
        LoggerUtility.infoLog("The user clicks on the book.");
    }

    public void adaugaInCos(){
//        elementMethods.waitVisibleElement(adaugaInCos);
        Actions action = new Actions(driver);
        action.moveToElement(adaugaInCos).perform();
        elementMethods.clickJSElement(adaugaInCos);
        LoggerUtility.infoLog("The user clicks on the adauga in cos.");
    }

}
