package com.macdonald.at.component.element;

import com.macdonald.at.component.element.base.AbstractElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LogoElement extends AbstractElement<LogoElement>
{
    @Override
    public LogoElement isVisible()
    {
        $("#logo").shouldBe(visible);
        return this;
    }
}
