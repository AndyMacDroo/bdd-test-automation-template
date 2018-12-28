package com.macdonald.at.steps;

import com.macdonald.at.component.element.AlertElement;
import com.macdonald.at.component.element.LoginFormElement;
import com.macdonald.at.component.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition extends BaseStepDefinition
{

    private LoginPage loginPage = pages.loginPage();
    private AlertElement alertElement = pages.alertComponent();
    private LoginFormElement loginFormElement = loginPage.loginForm();

    @Given("^I browse to the web app and I am not logged in$")
    public void iBrowseToTheWebAppAndIAmNotLoggedIn()
    {
        loginPage.go();
    }


    @And("^the login page has a login form$")
    public void theLoginPageHasALoginForm()
    {
        loginPage.loginForm().isVisible();
    }

    @When("^I login with an invalid user$")
    public void iLoginWithAnInvalidUser()
    {
        loginFormElement.login("invalid", "invalid");
    }

    @Then("^I see a \"([^\"]*)\" error message$")
    public void iSeeAErrorMessage(String errorMessage)
    {
        alertElement.isVisible().hasMessage(errorMessage);
    }

    @When("^I login with a valid user$")
    public void iLoginWithAValidUser()
    {
        loginFormElement.login("valid", "valid");
    }

    @And("^there is a logo on the login page$")
    public void thereIsALogoOnTheFrontPage()
    {
        loginPage.logo().isVisible();
    }
}
