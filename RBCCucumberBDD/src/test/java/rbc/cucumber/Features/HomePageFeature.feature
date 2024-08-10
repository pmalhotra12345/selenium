Feature: Checking the Home PAge Functionality

  @smoke
  Scenario: Checking the title for home page
    Given I am on the RBC Home Page
    Then The page title should be displayed
    And Verify the title has "Personal Banking - RBC Royal Bank" value
	
	@smoke
  Scenario: Checking the Search box
    Given I am on the RBC Home Page
    When I enter the "What mortgages do you offer" in the Search box
    And I click the search button
    Then I should see the search results page
