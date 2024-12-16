package pages;

import loggerUtility.LoggerUtility;
import modelObject.CosModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CosPage extends BasePage {
    public CosPage(WebDriver driver) {
        super(driver);}

    @FindBy(xpath = "//a[text()='Accept toate']")
    private WebElement acceptCookiesElement;
    @FindBy(xpath = "//a[@aria-label='Close']")
    private WebElement closeNewsletterElement;

    @FindBy(xpath = "//div[@class='item-title']/a[@data-id='35462042']")
    private WebElement carteElement;
    @FindBy(xpath = "//a[@href='/cart/products.jsp?pr_id=35462042&cant=1']")
    private WebElement adaugaInCos;

    @FindBy(xpath = "//h1/img[@src='https://cdn4.libris.ro/images/svg/header/logo-libris-desk.svg']")
    private WebElement homepageElement;

    @FindBy(xpath = "//a/img[@src='https://cdn4.libris.ro/images/svg/header/card-icon.svg']")
    private WebElement cosElement;
    @FindBy(xpath = "//a[@href='/cart/checkout.jsp']")
    private WebElement pasUrmator1Element;

    @FindBy(id = "cust_nume")
    private WebElement numePrenumeElement;
    @FindBy(id = "cust_tel")
    private WebElement telefonElement;
    @FindBy(id = "cust_email")
    private WebElement emailElement;
    @FindBy(id = "radioDeliveryCourierOption")
    private WebElement livrareCurierElement;

    @FindBy(id = "cos-p2-livrare-curieri-details-oras-select")
    private WebElement selectatiJudetulElement;
    @FindBy(xpath = "//*[@id='cos-p2-livrare-curieri-details-localitate-select']/option[@value='4585']")
    private WebElement localitateElement;
    @FindBy(id = "cust_adresa")
    private WebElement adresaElement;
    @FindBy(id = "invoiceTypeIndividual")
    private WebElement persoanaFizicaElement;
    @FindBy(xpath = "//p[text()='Plata ramburs la primirea coletului']")
    private WebElement plataRambursElement;
    @FindBy(xpath = "//button[@name='checkout']")
    private WebElement pasUrmator2Element;

    @FindBy(className = "cos-p3-termeni-si-conditii")
    private WebElement termeniConditiiElement;
    @FindBy(xpath = "//button[@class='cos-p3-pasul-urmator-btn finalizeaza-comanda-btn adauga-in-cos-roz-AB adauga-in-cos-roz']")
    private WebElement trimiteComandaElement;

    public void clickAcceptCookiesButton() {
        elementMethods.clickJSElement(acceptCookiesElement);
        LoggerUtility.infoLog("The user clicks on the accept cookies button.");
    }

    public void clickCloseNewsletter() {
        elementMethods.waitVisibleElement(closeNewsletterElement);
        elementMethods.clickJSElement(closeNewsletterElement);
        LoggerUtility.infoLog("The user clicks on the close newsletter button.");
    }

    public void clickCarte() {
        Actions action = new Actions(driver);
        action.moveToElement(carteElement).perform();
        elementMethods.clickJSElement(carteElement);
        LoggerUtility.infoLog("The user clicks on the book.");
    }

    public void adaugaInCos() {
        Actions action = new Actions(driver);
        action.moveToElement(adaugaInCos).perform();
        elementMethods.clickJSElement(adaugaInCos);
        LoggerUtility.infoLog("The user clicks on the adauga in cos.");
    }

    public void fillEntireForm(CosModel testData) {
        elementMethods.clickJSElement(homepageElement);
        elementMethods.clickJSElement(cosElement);
        elementMethods.clickJSElement(pasUrmator1Element);

        elementMethods.fillElement(numePrenumeElement, testData.getNumePrenume());
        elementMethods.fillElement(telefonElement, testData.getTelefon());
        elementMethods.fillElement(emailElement, testData.getEmail());
        elementMethods.clickElement(livrareCurierElement);
        elementMethods.clickElement(selectatiJudetulElement);
        elementMethods.selectDropDownElement(selectatiJudetulElement, testData.getSelectatiJudet());
        elementMethods.clickElement(localitateElement);
        elementMethods.fillElement(adresaElement, testData.getAdresa());
        elementMethods.clickElement(persoanaFizicaElement);
        elementMethods.clickElement(plataRambursElement);
        elementMethods.clickElement(pasUrmator2Element);

        elementMethods.clickElement(termeniConditiiElement);
        elementMethods.clickJSElement(trimiteComandaElement);
    }
}
