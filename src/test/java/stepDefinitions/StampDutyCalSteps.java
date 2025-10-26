package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageObjects.RevenueNSWCalculatorPage;
import pageObjects.ServiceNSWHomePage;
import utilities.Browser;
import utilities.WebElementReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class StampDutyCalSteps extends Browser {

    private WebDriver driver;
    private WebElementReader locators;
    private ServiceNSWHomePage serviceNSWHomePage;
    private RevenueNSWCalculatorPage revenueNSWCalculatorPage;


    @Given ("launch the Service NSW Motor Vehicle Stamp Duty page")
    public void launchServiceNSWPage()
    {
        serviceNSWHomePage = new ServiceNSWHomePage(Browser.getDriver());
        driver = Browser.getDriver();
        driver.get("https://www.service.nsw.gov.au/transaction/check-motor-vehicle-stamp-duty");
        System.out.println("User is on Service NSW Home page - Check Motor vehicle stamp duty page");

    }

    @When("click on \"Check online\" button")
    public void clickCheckOnlineButton()
    {
       serviceNSWHomePage.clickCheckOnlineButton();
       System.out.println("User clicked on Check online button");
       revenueNSWCalculatorPage = new RevenueNSWCalculatorPage(driver);
    }

    @Then("user navigated to Revenue NSW Calculator page")
    public void userNavigatedToRevenueNSWCalculator()
    {
        System.out.println("user navigated to Revenue NSW Calculator Page");
    }

    @When("select {string} checkbox for the passenger vehicle option")
    public void clickYesCheckBox(String option)
    {
       revenueNSWCalculatorPage.selectYesCheckBox(option);
       System.out.println("Selected Yes option");
    }

    @And("enter the purchase price as {string}")
    public void enterPurchasePrice(String amount)
    {
        revenueNSWCalculatorPage.enterPurchasePrice(amount);
        System.out.println("Entered the Purchase price of the vehicle");
    }

    @And("click on \"Calculate\" button")
    public void clickOnCalculateButton()
    {
        revenueNSWCalculatorPage.clickCalculateButton();
        System.out.println("User clicked on Calculate button");
    }

    @Then("user should see the popup along with the correct details")
    public void verifyDetailsInThePopup()
    {
        //Fetching popup window text
        String popupText = revenueNSWCalculatorPage.getPopupText();

        //Entered amount and checkbox value from the RevenueNSW class(Page object)
        String enteredAmount = revenueNSWCalculatorPage.getEnteredAmount();
        String selectedOption = revenueNSWCalculatorPage.getSelectedOption();

        Assert.assertTrue(popupText.contains(selectedOption), "Popup contains the selected option:" + selectedOption);

        Assert.assertTrue(popupText.contains(enteredAmount),"Popup contains the entered amount:" + enteredAmount);

        Assert.assertTrue(popupText.contains("Duty payable"),"Popup contains the Duty payable field with the value");

        System.out.println("Popup verification successful: Option selected is '"
                + selectedOption + "' and Amount entered is '" + enteredAmount + "' and along with the duty payable amount are correct.");
        System.out.flush();
    }

    //closing popup and as well as browser
    @And("click on \"Close\" button")
    public void clickCloseButton()
    {
        revenueNSWCalculatorPage.closeButton();
        Browser.closeDriver();
    }
}
