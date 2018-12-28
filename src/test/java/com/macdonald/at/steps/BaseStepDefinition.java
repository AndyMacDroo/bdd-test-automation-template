package com.macdonald.at.steps;

import com.macdonald.at.component.pages.Pages;

import org.apache.commons.lang3.StringUtils;

import static com.macdonald.at.utils.WebDriverUtils.getWebDriverInstance;

class BaseStepDefinition
{
    private static final String DEFAULT_BASE_URL = "http://localhost:8080/";

    Pages pages = new Pages(getWebDriverInstance(), getBaseAppUrl());

    static String getBaseAppUrl()
    {
        String baseApp = System.getenv("BASE_WEB_APP");
        if(StringUtils.isNotBlank(baseApp))
        {
            return baseApp;
        }
        return DEFAULT_BASE_URL;
    }

}
