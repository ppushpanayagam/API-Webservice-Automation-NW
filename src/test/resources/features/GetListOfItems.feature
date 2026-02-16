@regression
Feature: Verify Get List of Items Scenarios

  Scenario: Successfully GET list of Items
    When the GET request to get all the items called
    Then the response code to get list of all item should be 200
      And the response should contain item with name "Apple iPhone 12 Pro Max"
