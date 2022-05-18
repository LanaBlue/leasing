package pages.automallPage;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import pages.mainPage.MainPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class AutomallPage extends MainPage {
    //автомол
    String city = "Москва";
    String brand = "Audi";
    String model = "A3 Sedan";
    String autoTransmission = "автомат";
    String manualTransmission = "механика";

    //при большем количестве однотипных данных или в массив или в отдельный файл с данными
    String frontWheelDrive = "передний";
    String rearDrive = "задний";
    String fourWheelDrive = "полный";

    String carBody = "седан";

    String benzin = "бензин";
    String color = "черный";

    String cityDropDown = "//label[@aria-label='Город']/input";
    String brandDropDown = "//label[@aria-label='Марка']/input";
    String modelDropDown = "//label[@aria-label='Модель']/input";

    //можно реализовать в одном методе с подстановкой наименований чекбоксов
    String frontWheelDriveCheckbox = "//label[contains(text(),'передний')]"; //чекбокс передний привод
    String fourWheelDriveCheckbox = "//label[contains(text(),'полный')]"; //чекбокс полный привод
    String rearDriveCheckbox = "//label[contains(text(),'задний')]"; //чекбокс задний привод
    String autoTransmissionCheckbox = "//label[contains(text(),'автомат')]";
    String manualTransmissionCheckbox = "//label[contains(text(),'механика')]";

    String colorDropDown = "//label[@aria-label='Цвет']/input";

    String showAllSuggestionsButton = "//*[contains(text(),'Показать все предложения')]";
    String seeOfferButton = "//*[contains(text(),'Смотреть предложения')]";

    String closeCookieMessageButton = "//*[@id='cookie-warning']/div/div/button";

    String brandFromCommonList = "/html/body/div[1]/div[3]/div/main/div[3]/div[1]/div[1]/div[1]/a/div/div";
    String brandAutoList = "/html/body/div[1]/div[3]/div[1]/h1";

    /**
     * Нажатие на кнопку Закрыть в сообщении об использовании куки
     */
    public void clickCloseCookieMessageButton() {
        $(By.xpath(closeCookieMessageButton)).click();
    }

    /**
     * Выбор города
     *
     * @param city
     */
    public void setCityDropDown(String city) {
        $(By.xpath(cityDropDown)).should(exist).click();
        $(By.xpath(cityDropDown)).setValue(city);
        String xpath = "//label[contains(text(),'" + city + "')]";
        $(By.xpath(xpath)).click();
    }

    /**
     * Выбор марки
     *
     * @param brand
     */
    public void setBrandDropDown(String brand) {
        $(By.xpath(brandDropDown)).should(exist).click();
        $(By.xpath(brandDropDown)).setValue(brand);
        String xpath = "//label[contains(text(),'" + brand + "')]";
        $(By.xpath(xpath)).click();
    }

    /**
     * Выбор модели
     *
     * @param model
     */
    public void setModelDropDown(String model) {
        $(By.xpath(modelDropDown)).should(exist).click();
        $(By.xpath(modelDropDown)).setValue(model);
        String xpath = "//label[contains(text(),'" + model + "')]";
        $(By.xpath(xpath)).click();
    }

    /**
     * Выбор привода
     *
     * @param driveUnit передний, задний, полный
     */
    public void setDriveUnitCheckbox(String driveUnit) {
        if (driveUnit == this.frontWheelDrive) {
            $(By.xpath(frontWheelDriveCheckbox)).should(exist).click();
        } else if (driveUnit == this.rearDrive) {
            $(By.xpath(rearDriveCheckbox)).should(exist).click();
        } else {
            $(By.xpath(fourWheelDriveCheckbox)).should(exist).click();
        }
    }

    /**
     * Выбор коробки передачи
     *
     * @param transmission автомат, мехника
     */
    public void setTransmissionCheckbox(String transmission) {
        if (transmission == this.autoTransmission) {
            $(By.xpath(autoTransmissionCheckbox)).should(exist).click();
        } else if (transmission == this.manualTransmission) {
            $(By.xpath(manualTransmissionCheckbox)).should(exist).click();
        }
    }

    /**
     * Выбор типа кузова
     *
     * @param carBody
     */
    public void setTypeCarBodyCheckbox(String carBody) {
        String xpath = "//*[@title='" + carBody + "']";
        $(By.xpath(xpath)).should(exist).click();
    }

    /**
     * Выбор типа топлива
     *
     * @return fuelType
     */
    public void setFuelTypeCheckbox(String fuelType) {
        String xpath = "//label[contains(text(),'" + fuelType + "')]";
        $(By.xpath(xpath)).should(exist).click();
    }

    /**
     * Выбор цвета
     *
     * @param color
     */
    public void setColorDropDown(String color) {
        $(By.xpath(colorDropDown)).should(exist).click();
        $(By.xpath(colorDropDown)).setValue(color);
        String xpath = "//label[contains(text(),'" + color + "')]";
        $(By.xpath(xpath)).click();
    }

    /**
     * Нажатие на кнопку Показать все предложения
     */
    public void clickShowAllSuggestionsButton() {
        $(By.xpath(showAllSuggestionsButton)).should(exist).click();
    }

    /**
     * Нажатие на кнопку Смотреть предложения
     */
    public void clickSeeOfferButton() {
        $(By.xpath(seeOfferButton)).should(exist).click();
    }

    /**
     * Получение марки авто из общего списка
     */
    public String getBrandAutoFromCommonList() {
        String brandAutoFromCommonList = $(By.xpath(brandFromCommonList)).getOwnText();
        return brandAutoFromCommonList;
    }

    /**
     * Получение марки авто из списка предложенных вариантов
     */
    public String getBrandAutoList() {
        String brandList = $(By.xpath(brandAutoList)).getOwnText();
        return brandList.trim();
    }

    public String getCarBody() {
        return carBody;
    }

    public String getAutoTransmission() {
        return autoTransmission;
    }

    public String getManualTransmission() {
        return manualTransmission;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFrontWheelDrive() {
        return frontWheelDrive;
    }

    public String getRearDrive() {
        return rearDrive;
    }

    public String getFourWheelDrive() {
        return fourWheelDrive;
    }

    public String getBenzin() {
        return benzin;
    }

    public String getColor() {
        return color;
    }
}
