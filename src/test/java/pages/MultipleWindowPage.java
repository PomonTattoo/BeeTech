package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class MultipleWindowPage {

    public MultipleWindowPage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }
    @FindBy(xpath = "//a[text()='Multiple-window']")
    public WebElement multipleWindowBtn;

    @FindBy(className = "btn btn-lg btn-outline-success mr-3")
    public WebElement launchTla;

    @FindBy(xpath = "//a[text()='Launch Google']")
    public WebElement launchGoogle;

    @FindBy(xpath = "//a[text()='Launch Facebook']")
    public WebElement launchFacebook;

}
