Feature: Checking Mortgage Payment Calculator

  Background: 
    Given I am on Mortgage Payment Calculator

  @smoke
  Scenario Outline: Checking Simple Mortgage Payment Calculator
    When I entered Mortgage Amount "<Simple Mortgage Amount>" in text box
    And Click the calculate button
    Then Calculated Value should be visible

    Examples: 
      | Simple Mortgage Amount |
      |                   5000 |
      |                   6000 |
      
