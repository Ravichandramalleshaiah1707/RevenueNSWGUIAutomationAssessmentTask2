package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.WebElementReader;

public class RevenueNSWCalculatorPage {
    private WebDriver driver;
    private WebElementReader locators;
    private String enteredAmount;
    private String selectedOption;

    public RevenueNSWCalculatorPage(WebDriver driver)
    {
        this.driver = driver;
        this.locators = new WebElementReader("motorVehicleRegoStamp.properties");
    }

    public void selectYesCheckBox(String option)
    {
        if(option.equalsIgnoreCase("Yes")) {
            WebElement yesCheckBox = driver.findElement((By.xpath(locators.get("selectYesCheckBox"))));
            yesCheckBox.click();
        }
        selectedOption = option;
    }

    public void enterPurchasePrice(String amount)
    {
        WebElement enterPrice = driver.findElement((By.xpath(locators.get("purchasePriceValue"))));
        enterPrice.sendKeys(amount);

        enteredAmount = amount;
    }

    public void clickCalculateButton()
    {
        WebElement clickCalculate = driver.findElement((By.xpath(locators.get("calculateButton"))));
        clickCalculate.click();
    }

    public String getPopupText()
    {
        try {
            Thread.sleep(2000); // simple wait for popup
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.findElement(By.xpath(locators.get("popUpContent"))).getText();
    }

    public void closeButton()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement closeButton = driver.findElement((By.xpath(locators.get("closeButton"))));
        closeButton.click();
    }
    public String getEnteredAmount() {
        return enteredAmount;
    }

    public String getSelectedOption() {
        return selectedOption;
    }
}
