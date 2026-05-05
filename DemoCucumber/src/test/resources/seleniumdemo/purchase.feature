Feature: Tamil kumar_04_05_2026_Purchase Feature

  @purchaseProduct
  Scenario: User purchase a product
    Given user on the cart page
    And there should be atleast one product
    When the user click the "Place order" button
    And enters name as "Tamil"
    And enters country as "India"
    And enter user address as "salem"
    And enters user credit number as "908472828220"
    And enters month as "10"
    And enters year as "2026" and click purchase button
    Then user should show a alert message product purchased successfully

  @InvalidPurchase
  Scenario: Checking product is purchased which not in the cart
     Given user on the cart page
     When the user click the "Place order" button
     And enters name as "Tamil"