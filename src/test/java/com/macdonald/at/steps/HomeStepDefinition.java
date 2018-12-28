package com.macdonald.at.steps;

import com.macdonald.at.component.element.MenuBarElement;

import java.util.HashSet;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static junit.framework.TestCase.assertEquals;

public class HomeStepDefinition extends BaseStepDefinition
{
    private MenuBarElement menuBarElement = pages.homePage().menuBar();

    @And("^I see a menu bar$")
    public void iSeeAMenuBarOnTheHomePage()
    {
        menuBarElement.isVisible();
    }

    @Then("^the menu bar has options$")
    public void theMenuBarHasOptions(DataTable options)
    {
        assertEquals(new HashSet<>(options.asList(String.class)), new HashSet<>(menuBarElement.getMenuOptions()));
    }
}
