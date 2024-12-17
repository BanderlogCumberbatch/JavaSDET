package org.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * Класс страницы SDET.
 */
public class SDETPage {

    /**
     * Кнопка "Запись на консультацию".
     */
    @FindBy(xpath = "//a[@class='order-service']")
    private SelenideElement consultationButton;

    /**
     * Проверяет, что страница SDET открылась.
     * @return текущий экземпляр класса
     */
    @Step("Проверить, что страница SDET открылась")
    public SDETPage SDETPageIsOpen() {
        $(By.xpath("//h1"))
                .shouldHave(text("SDET"))
                .shouldBe(visible);
        return this;
    }

    /**
     * Проверяет, что кнопка "Запись на консультацию" присутствует и кликабельна.
     * @return текущий экземпляр класса
     */
    @Step("Проверить, что кнопка 'Запись на консультацию' присутствует и кликабельна")
    public FeedbackModal consultationButtonCheck() {
        consultationButton
                .should(exist)
                .shouldBe(visible)
                .shouldHave(text("Запись на консультацию"))
                .click();
        return page(FeedbackModal.class);
    }
}
