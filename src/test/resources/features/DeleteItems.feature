@regression
Feature: Verify DELETE item scenarios

  Background:
    Given the Create Item POST request set with valid "Apple001" "2025" "1500" "M3" "500"
    When the POST request to add the item is called

  Scenario: Successfully DELETE an item with valid id
    Given the Delete item request set with valid Id
    When the DELETE request to delete item called
    Then the response code for create item should be 200
      And the response message for deletion should be as expected
      And the Get item request set with valid Id
    When the GET request for get item called
    Then the response message for deletion should be as expected

  Scenario: Failed to DELETE an item with invalid id
    Given the Delete item request set with invalid "23222323"
    When the DELETE request to delete item called
    Then the response code for create item should be 200
      And the response message for deletion should be as expected
