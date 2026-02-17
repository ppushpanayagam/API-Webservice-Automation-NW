@regression
Feature: Verify Get List of Items Scenarios

  Scenario: Successfully GET list of Items
    Given the GET request to get list of items with valid endpoint
    When the GET request to get all the items called
    Then the response code to get list of all item should be 200
      And the response should contain item with name "Apple Macbook Pro Max"

  Scenario: Failed to GET list of Items
    Given the Get request to get all the items with invalid endpoint
    When the GET request to get all the items called
    Then the response code to get list item should be 404