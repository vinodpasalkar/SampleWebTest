package net.webtestautomation.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.webdriver.WebDriverFacade;
import net.webtestautomation.pages.mobilePage.MobilePageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OnlinePurchasePage extends MobilePageObject {


    @FindBy(xpath="//input[@data-testid = \"screen.login.input.username\"]")
    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"screen.login.input.username\"]")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"screen.login.input.username\"]")
    private WebElement userNameTextBox;


    @FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressesMenu;

    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    private WebElement addToCartButton;

    @FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath="//span[contains(text(),'Sign in')]")
    private WebElement signInPage;

    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
    private WebElement firstDress;

    private WebElement  dressCategory;

    private  String platform = System.getProperty("platform");
    String dressString = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a";
    private final WebDriver driver;

    public OnlinePurchasePage(WebDriver driver) {
        super(driver);
        WebDriver facade = getDriver();
        this.driver = ((WebDriverFacade) facade).getProxiedDriver();
    }

    public void gotoSiteOnBrowser() {
        if(platform.equalsIgnoreCase("Web")){
            System.out.println("Launching the site in browser");
            driver.get("http://automationpractice.com/index.php");
            //openAt("http://automationpractice.com/index.php");
            //driver.manage().window().maximize();
        }
    }

    public void addDressesToCart(String dressType) {
        clickOnMenu();
        clickOnDressCategory(dressType);
        addDressesToCart();


    }

    private void addDressesToCart() {
        Actions actions = new Actions(driver);
        actions.moveToElement(firstDress).perform();
        addToCartButton.click();
    }

    private void clickOnDressCategory(String dressType) {
        dressString = dressString.replace("dressType",dressType);
        dressCategory = driver.findElement(By.xpath(dressString));
        System.out.println("Clicked on Summer Dresses category");
    }


    private void clickOnMenu() {
        dressesMenu.click();
        System.out.println("Clicked on Dresses menu");
    }

    public void pressButton(String buttonType) {
        proceedToCheckoutButton.click();
    }

    public void verifyPageUI(String pageType) {
        if(signInPage.isDisplayed()){
            System.out.println(pageType + "page is shown successfully");
        }
        else{
            Assert.fail(pageType + "page is not shown");
        }
    }
}
