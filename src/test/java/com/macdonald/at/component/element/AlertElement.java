package com.macdonald.at.component.element;

import com.macdonald.at.component.element.base.AbstractElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static junit.framework.TestCase.assertTrue;

public class AlertElement extends AbstractElement<AlertElement>
{

    @Override
    public AlertElement isVisible()
    {
        $("#alert").shouldBe(visible);
        return this;
    }

    public void hasMessage(String message)
    {
        assertTrue($("#alert").text().contains(message));
    }

}
