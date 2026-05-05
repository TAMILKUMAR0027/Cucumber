Feature: Tamil Kumar_04_05_2026_categoriesFeature

  @Mobilecategories
  Scenario: Choose the categories of mobile
    Given the user is on the the Homepage after login
    When the user click the "mobile" opiton in the categories list
    Then the webiste should list the only the mobile product list

  @Laptopcategories
  Scenario: Choose the categories of laptop
    Given the user is on the the Homepage after login
    When the user click the "laptop" opiton in the categories list
    Then the webiste should list the only the laptop product list

  @Monitorcategories
  Scenario: Choose the categories of monitor
    Given the user is on the the Homepage after login
    When the user click the "monitor" opiton in the categories list
    Then the webisteshould list the only the monitor product list
