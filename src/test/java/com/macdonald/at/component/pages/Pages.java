package com.macdonald.at.component.pages;

import com.codeborne.selenide.WebDriverRunner;
import com.macdonald.at.component.element.AlertElement;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.title;
import static junit.framework.TestCase.assertTrue;

public class Pages
{

    private String basePath;

    public Pages(WebDriver webDriver, String basePath)
    {
        this.basePath = basePath;
        WebDriverRunner.setWebDriver(webDriver);
    }

    public LoginPage loginPage()
    {
        return new LoginPage(this.basePath);
    }

    public HomePage homePage()
    {
        return new HomePage(this.basePath);
    }

    public AlertElement alertComponent()
    {
        return new AlertElement();
    }

    public void assertPageTitleIs(String pageTitle)
    {
        assertTrue(title().toLowerCase().contains(pageTitle));
    }

}
