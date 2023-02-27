@wiki
Feature:  Agile story: As a user, when I am on the Wikipedia search page
  I should be able to search Steve Jobs

  Scenario: Search page default title verification
Given User is on Wikipedia home page
 When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button
 Then User sees "Steve Jobs" is in the wiki title

  Scenario:  Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario:  Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header






