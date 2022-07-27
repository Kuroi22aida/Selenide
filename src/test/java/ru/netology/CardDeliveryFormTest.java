package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CardDeliveryFormTest {

    @BeforeEach
    public void setup() {
        Configuration.holdBrowserOpen = true;
        open("http://localhost:9999/");

    }

    @Test
    void shouldOrderCardDelivery() {


        SelenideElement form = $(".form");
        $("[data-test-id=city] input").setValue("Саратов");
//        $("[data-test-id=date] input").setValue();
        $("[data-test-id=name] input").setValue("Маркс Карл");
        $("[data-test-id=phone] input").setValue("+70000000000");
        $("[data-test-id=agreement]").click();
        $("button.button").click();
        $("span.spin").shouldBe(Condition.visible);
        $("[data-test-id=notification]").shouldBe(Condition.visible, Duration.ofSeconds(15));

    }
}
