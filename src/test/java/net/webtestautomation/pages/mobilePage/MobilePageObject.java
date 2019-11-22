package net.webtestautomation.pages.mobilePage;

import com.google.common.base.Predicate;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobilePageObject extends PageObject {

	private WebElement dashboardActiveStatusforDevice;
	private WebElement dashboardInActiveStatusforDevice;
	private static final int count = 1;
	private Dimension screenSize;
	String dbActiveStatusforDevice = "//android.widget.TextView[contains(@text,\"deviceName\")]";
	String dbInactiveStatusforDevice = "//android.widget.TextView[contains(@text,\"deviceName\")]";

	private WebElement settingsIcon;
	//Added this to use drive in this base class
	private final WebDriver driver = ((WebDriverFacade) getDriver()).getProxiedDriver();


	WebDriverWait webDriverwait = new WebDriverWait(driver, 10);

	public MobilePageObject(WebDriver driver) {
		super(driver, new Predicate<PageObject>() {
			@Override
			public boolean apply(PageObject page) {

				PageFactory
						.initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver()), page);
				return true;
			}

		});

	}

}
