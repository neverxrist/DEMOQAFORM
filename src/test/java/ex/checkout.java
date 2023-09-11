package ex;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class checkout extends testui{
    @Test
    final void check() {
        $(".modal-dialog").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(
                text(FIRST_NAME),
                text(SECOND_NAME),
                text(USER_EMAIL),
                text(USER_NUMBER),
                text(SUBJECTS),
                text(CURRENT_ADDRESS),
                text("with_day_of_day.jpg"),
                text("Uttar Pradesh"),
                text("Lucknow"),
                text("Male"),
                text("Music")
        );
    }
}
