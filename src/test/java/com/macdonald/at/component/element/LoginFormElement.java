package com.macdonald.at.component.element;

import com.macdonald.at.component.element.base.AbstractElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginFormElement extends AbstractElement<LoginFormElement>
{
    private static final String INPUT_USERNAME = "#username";
    private static final String INPUT_PASSWORD = "#password";
    private static final String SUBMIT = "#login_submit";

    @Override
    public LoginFormElement isVisible()
    {
        $(INPUT_USERNAME).shouldBe(visible);
        $(INPUT_PASSWORD).shouldBe(visible);
        $(SUBMIT).shouldBe(visible);
        return this;
    }

    public void login(String username, String password)
    {
        $(INPUT_USERNAME).setValue(username);
        $(INPUT_PASSWORD).setValue(password);
        $(SUBMIT).click();
    }
}
