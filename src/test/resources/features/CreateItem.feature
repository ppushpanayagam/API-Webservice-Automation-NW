Feature: Verify Create Item scenarios

  Scenario Outline: Successfully Create items with valid details
    Given the Create Item POST request set with valid "<itemName>" "<year>" "<price>" "<cpuModel>" "<hardDiskSize>"
    When the POST request to add the item is called
    Then the response code for create item should be 200
      And the item "<itemName>" is created successfully
    Examples:
      | itemName | year | price | cpuModel | hardDiskSize |
      | Apple    | 2025 | 10000 | 2025     | 500          |
      | Samsung  | 2025 | 10000 | 2025     | 500          |
      | Google   | 2025 | 20000 | 2025     | 1000         |
