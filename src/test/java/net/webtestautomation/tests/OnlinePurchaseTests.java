package net.webtestautomation.tests;

import net.webtestautomation.pages.OnlinePurchasePage;

public class OnlinePurchaseTests {

    private OnlinePurchasePage onlinePurchasePage;
    

    public void gotoSite() {
        onlinePurchasePage.gotoSiteOnBrowser();
    }

    public void addDressesToCart(String dressType) {
        onlinePurchasePage.addDressesToCart(dressType);
    }

    public void pressButton(String buttonType) {
        onlinePurchasePage.pressButton(buttonType);
    }

    public void verifyPage(String pageType) {
        onlinePurchasePage.verifyPageUI(pageType);
    }

}
