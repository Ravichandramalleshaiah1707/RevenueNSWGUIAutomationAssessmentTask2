Feature: Verify Motor Vehicle Stamp Duty Calculation in Service NSW site

  Scenario:check online stamp duty calculation
    Given launch the Service NSW Motor Vehicle Stamp Duty page
    When click on "Check online" button
    Then user navigated to Revenue NSW Calculator page
    When select "Yes" checkbox for the passenger vehicle option
    And enter the purchase price as "$30,000"
    And click on "Calculate" button
    Then user should see the popup along with the correct details
    And click on "Close" button
