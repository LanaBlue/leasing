package tests.Automall;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.automallPage.AutomallPage;
import pages.mainPage.MainPage;
import pages.searchPage.SearchPage;

import static com.codeborne.selenide.Selenide.open;

public class SelectionAutoByParameters extends SearchPage {

    /**
     * Цель теста: Проверка правильного подбора автомобиля по фильтру
     *
     * @author Frolova SI
     * 17/05/2022
     */
    @Test(description = "Подбор автомобиля по параметрам ")
    public void selectionAutoByParameters() {
        open(getSearchUrl());
        searchSberLeasing();
        gotoSberleasingSite();
        MainPage mp = new MainPage();
        mp.clickSelectByOptionButton();
        AutomallPage ap = new AutomallPage();
        ap.setCityDropDown(ap.getCity());
        ap.setBrandDropDown(ap.getBrand());
        ap.setModelDropDown(ap.getModel());
        ap.setDriveUnitCheckbox(ap.getFrontWheelDrive());
        ap.setTransmissionCheckbox(ap.getAutoTransmission());
        ap.clickCloseCookieMessageButton();
        ap.setTypeCarBodyCheckbox(ap.getCarBody());
        ap.setFuelTypeCheckbox(ap.getBenzin());
        ap.setColorDropDown(ap.getColor());
        ap.clickShowAllSuggestionsButton();
        String brandCommonList = ap.getBrandAutoFromCommonList();
        ap.clickSeeOfferButton();
        Assert.assertEquals(brandCommonList, ap.getBrandAutoList());
    }
}
