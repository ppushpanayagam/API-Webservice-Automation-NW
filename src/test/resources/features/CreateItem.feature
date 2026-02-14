Feature: Verify Create Item scenarios

  Scenario Outline: Successfully Create items with valid details
    Given the POST request set with valid "<name>" "<year>" "<price>" "<cpuModel>" "<hardDiskSize>"
    Examples:
      | name    | year | price | cpuModel | hardDiskSize |
      | Apple   | 2025 | 10000 | 2025     | 500          |
      | Samsung | 2025 | 10000 | 2025     | 500          |
      | Google  | 2025 | 20000 | 2025     | 1000         |
