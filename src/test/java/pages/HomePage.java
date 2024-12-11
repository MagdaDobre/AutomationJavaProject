package pages;

import helpMethods.ElementMethods;
import loggerUtility.LoggerUtility;
import modelObject.UserModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='Accept toate']")
    private WebElement acceptCookiesElement;
    @FindBy(xpath = "//a[@aria-label='Close']")
    private WebElement closeNewsletterElement;
    @FindBy(xpath = "//img[@alt='User']")
    private WebElement userIconElement;
    @FindBy(xpath = "//li/a[text()='Creeaza un cont nou']")
    private WebElement creeazaContElement;

    @FindBy(id = "date-inregistrare-nume")
    private WebElement numePrenumeElement;
    @FindBy(id = "date-inregistrare-user")
    private WebElement nicknameElement;
    @FindBy(id = "date-inregistrare-email")
    private WebElement emailElement;
    @FindBy(id = "date-inregistrare-telefon")
    private WebElement telefonElement;
    @FindBy(id = "onSelectCounty")
    private WebElement judetElement;
    @FindBy(id = "onSelectZone")
    private WebElement localitateElement;
    @FindBy(id = "adresa")
    private WebElement adresaElement;
    @FindBy(id = "password1")
    private WebElement parolaElement;
    @FindBy(id = "password2")
    private WebElement repetaParolaElement;
    @FindBy(xpath = "//button[text()='Inregistrare']")
    private WebElement inregistrareElement;

    public void clickAcceptCookiesButton() {
        elementMethods.clickElement(acceptCookiesElement);
        LoggerUtility.infoLog("The user clicks on the accept cookies button.");
    }

    public void clickCloseNewsletter() {
        elementMethods.clickJSElement(closeNewsletterElement);
        LoggerUtility.infoLog("The user clicks on the close newsletter button.");
    }

    public void clickCreeazaCont() {
        Actions action = new Actions(driver);
        action.moveToElement(userIconElement).perform();
//        elementMethods.waitVisibleElement(creeazaContElement);
        elementMethods.clickElement(creeazaContElement);
        LoggerUtility.infoLog("The user clicks on the Creeaza Cont.");
    }

    public void fillEntireForm(UserModel testData) {
        elementMethods.fillElement(numePrenumeElement, testData.getNumePrenume());
        elementMethods.fillElement(nicknameElement, testData.getNickname());
        elementMethods.fillElement(emailElement, testData.getEmail());
        elementMethods.fillElement(telefonElement, testData.getTelefon());
        elementMethods.clickElement(judetElement);
        elementMethods.fillElement(judetElement, testData.getJudet());
        elementMethods.clickElement(localitateElement);
        elementMethods.fillElement(localitateElement, testData.getLocalitate());
        elementMethods.fillElement(adresaElement, testData.getAdresa());
        elementMethods.fillElement(parolaElement, testData.getParola());
        elementMethods.fillElement(repetaParolaElement, testData.getRepetaParola());
    }
}
