package com.macdonald.at.component.element;

import com.macdonald.at.component.element.base.AbstractElement;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MenuBarElement extends AbstractElement<MenuBarElement>
{
    @Override
    public MenuBarElement isVisible()
    {
        $("#menu-bar").shouldBe(visible);
        return this;
    }

    public List<String> getMenuOptions()
    {
        return $$("#menu-bar").texts();
    }
}
