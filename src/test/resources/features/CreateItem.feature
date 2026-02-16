@regression
Feature: Verify Create Item scenarios

  Scenario Outline: Successfully Create items with valid details
    Given the Create Item POST request set with valid "<itemName>" "<year>" "<price>" "<cpuModel>" "<hardDiskSize>"
    When the POST request to add the item is called
    Then the response code for create item should be 200
      And the item "<itemName>" is created successfully
    Examples:
      | itemName              | year | price | cpuModel | hardDiskSize |
      | Apple Macbook Pro Max | 2024 | 3000  | Max      | 1TB          |
      | Samsung               | 2025 | 2000  | Intel i9 | 2TB          |
      | Google Chromebook     | 2025 | 1500  | Intel i5 | 500GB        |
