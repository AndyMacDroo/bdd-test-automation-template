package com.macdonald.at.component.pages.base;

public abstract class AbstractPage
{

    protected final String basePath;

    public AbstractPage(String basePath)
    {
        this.basePath = basePath;
    }

    public abstract String getPageName();

    public abstract void go();
}
