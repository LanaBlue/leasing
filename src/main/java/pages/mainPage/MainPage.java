package pages.mainPage;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    //Главная страница

    String selectByOptionButton = "//*[text()='Подобрать по параметрам']";
    String learnMoreButton = "//a[contains(text(),'Узнать больше')][1]";

    /**
     * Клик по кнопке Подобрать по параметрам
     */
    public void clickSelectByOptionButton() {
        $(By.xpath(learnMoreButton)).should(exist).scrollIntoView(true); //частичная прокрутка главной страницы
        $(By.xpath(selectByOptionButton)).should(exist).click();
    }
}
