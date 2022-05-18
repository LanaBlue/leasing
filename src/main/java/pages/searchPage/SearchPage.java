package pages.searchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
//страница гугл

    public String getSberLeasing() {
        return sberLeasing;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    //Данные
    String sberLeasing = "СберЛизинг";
    String searchUrl = "https://www.google.com/";

    String searchField = "//*[@name='q']"; // строка поиска для гугл

    // String offCite = "//h3[contains(text(),'СберЛизинг — официальный сайт')]";
    String offCite = "//cite[contains(text(),'https://www.sberleasing.ru')]";

    /**
     * Поиск в гугл оф сайта сберлизинга
     */
    public void searchSberLeasing() {
        $(By.xpath(searchField)).should(exist).setValue(getSberLeasing());
        $(By.xpath(searchField)).sendKeys(Keys.ENTER);

    }

    /**
     * Переход на оф сайт сберлизинга
     */
    public void gotoSberleasingSite() {
        $(By.xpath(offCite)).should(exist).click();
    }
}
