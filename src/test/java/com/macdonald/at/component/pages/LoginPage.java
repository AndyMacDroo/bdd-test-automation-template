package com.macdonald.at.component.pages;

import com.macdonald.at.component.element.LoginFormElement;
import com.macdonald.at.component.element.LogoElement;
import com.macdonald.at.component.pages.base.AbstractPage;

import java.net.URI;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends AbstractPage
{

    private static final String PAGE_NAME = "login";

    LoginPage(String basePath)
    {
        super(basePath);
    }

    @Override
    public String getPageName()
    {
        return PAGE_NAME;
    }

    @Override
    public void go()
    {
        URI loginUri = URI.create(basePath).resolve(getPageName());
        open(loginUri.toString());
    }

    public LogoElement logo()
    {
        return new LogoElement();
    }

    public LoginFormElement loginForm()
    {
        return new LoginFormElement();
    }
}
