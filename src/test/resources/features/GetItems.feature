Feature: Verify Get Created Items scenarios

  Background:
    Given the Create Item POST request set with valid "Apple" "2025" "1500" "M3" "500"
    When the POST request to add the item is called

  Scenario: Successfully GET an item with valid id
    Given the Get item request set with valid Id
    When the GET request for get item called
    Then the response code for create item should be 200
#BUG
#  Scenario: Failed to GET an item with invalid id
#    Given the Get item request set with invalid Id
#    When the GET request for get item called
#    Then the response code for create item should be 404