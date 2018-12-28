package com.macdonald.at.steps;

import cucumber.api.java.en.Then;

public class PageStepDefinition extends BaseStepDefinition
{

    @Then("^I see a \"([^\"]*)\" page$")
    public void iSeeAPage(String pageName)
    {
        pages.assertPageTitleIs(pageName);
    }


}
