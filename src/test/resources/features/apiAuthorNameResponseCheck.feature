Feature: OpenLibrary API Verification

  @apitest
  Scenario: Verify author details by Open Library ID
    Given access the OpenLibrary author API with ID "OL1A"
    Then the author personal_name should be "Sachi Rautroy"
    And the author's one of the alternate_name should be "Yugashrashta Sachi Routray"