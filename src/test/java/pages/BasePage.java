package pages;

import helpMethods.ElementMethods;
import helpMethods.TabMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;
    protected ElementMethods elementMethods;
    protected TabMethods tabMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(this.driver);
        tabMethods = new TabMethods(this.driver);
        PageFactory.initElements(this.driver,this);
    }
}
