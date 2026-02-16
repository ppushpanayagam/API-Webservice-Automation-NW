Feature: Verify Get Created Items scenarios

  Background:
    Given the Create Item POST request set with valid "Apple Macbook Air" "2024" "1500" "M2" "500GB"
    When the POST request to add the item is called

  Scenario: Successfully GET an item with valid id
    Given the Get item request set with valid Id
    When the GET request for get item called
    Then the response code for get item should be 200
      And the response for the get item should be as expected

  Scenario: Failed to GET an item with invalid id
    Given the Get item request set with invalid Id "23223232"
    When the GET request for get item called
    Then the response code for get item should be 404
