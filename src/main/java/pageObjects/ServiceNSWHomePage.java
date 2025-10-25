package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.WebElementReader;

import java.time.Duration;

public class ServiceNSWHomePage {
    private WebDriver driver;
    private WebElementReader locators;
    private WebDriverWait wait;

    public ServiceNSWHomePage(WebDriver driver) {
        this.driver = driver;
        locators = new WebElementReader("motorVehicleRegoStamp.properties");
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickCheckOnlineButton()
    {
        WebElement checkOnlinebutton = driver.findElement((By.xpath(locators.get("checkOnlineButton"))));
        checkOnlinebutton.click();

        wait.until(ExpectedConditions.urlContains("apps09.revenue.nsw.gov.au"));
        System.out.println("Navigated to new page: " + driver.getCurrentUrl());

        }
    }

