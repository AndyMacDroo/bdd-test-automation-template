package com.macdonald.at.component.pages;

import com.macdonald.at.component.element.MenuBarElement;
import com.macdonald.at.component.pages.base.AbstractPage;

import java.net.URI;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends AbstractPage
{

    private static final String PAGE_NAME = "";

    HomePage(String basePath)
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
        URI homeUri = URI.create(basePath);
        open(homeUri.toString());
    }

    public MenuBarElement menuBar()
    {
        return null;
    }
}
