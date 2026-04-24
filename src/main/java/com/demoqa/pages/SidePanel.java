package com.demoqa.pages;

import com.demoqa.core.BasePage;
import com.demoqa.pages.alertsFrameWindows.AlertsPage;
import com.demoqa.pages.alertsFrameWindows.IframesPage;
import com.demoqa.pages.alertsFrameWindows.WindowsPage;
import com.demoqa.pages.bookStore.LoginPage;
import com.demoqa.pages.elements.BrokenLinksImagesPages;
import com.demoqa.pages.forms.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {
    public SidePanel(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath = "//span[.='Login']")
    WebElement login;

    public LoginPage getLogin() {
        clickWithJS(login);
        return new LoginPage(driver);
    }

@FindBy(xpath = "//span[.='Alerts']")
WebElement alerts;
    public AlertsPage getAlerts() {
        clickWithJS(alerts);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;
    public WindowsPage getBrowserWindows() {
        clickWithJS(browserWindows);
        return new WindowsPage(driver);
    }
    @FindBy(xpath = "//span[.='Frames']")
    WebElement frames;

    public IframesPage getFrames() {
        clickWithJS(frames);
        return new IframesPage(driver);
    }
    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage getPracticeForm() {
        clickWithJS(practiceForm);
        return new PracticeFormPage(driver);
    }
    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;
    public BrokenLinksImagesPages getBrokenLinksImages() {
        clickWithJS(brokenLinksImages);
        return new BrokenLinksImagesPages(driver);
    }
}
