package ru.netology;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryFormTest {
    @Test
    void shouldSubmitRequest() {

        open("http://localhost:9999/");
    }
}
