Feature: Checking Mortgage Payment Calculator

  Background: 
    Given I am on Mortgage Payment Calculator page

  @smoke
  Scenario Outline: Checking Advanced Mortgage Payment Calculator
    Given I am on Advanced Mortgage Payment Calculator
    When I entered  Mortgage Amount "<Mortgage Amount>" in text box
    And Select the Amortization Period Years "<AM_Years>" and Months "<AM_Months>"
    And Select the Payment Frequency "<Payment Frequency>"
    And Enter the Interest Rate "<Interest Rate>" in text box
    And Select the Interest Type "<Interest Type>"
		And Select the Interest Term Years "<IT_Years>" and Months "<IT_Months>"
		And Click the Advance calculate button
    Then Advanced Calculated Value should be visible
    
    Examples: 
      | Mortgage Amount | AM_Years | AM_Months | Payment Frequency | Interest Rate | Interest Type | IT_Years | IT_Months |
      |            2000 | 2 Years  | 2 Months  | Semi-Monthly      |             2 | Fixed         | 2 Years  | 2 Months  |
      |            3000 | 3 Years  | 3 Months  | Monthly           |             3 | Fixed         | 3 Years  | 3 Months  |
