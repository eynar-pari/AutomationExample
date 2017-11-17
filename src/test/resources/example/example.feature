Feature: Find a school match using Location and Major

  @Test
  Scenario: As normal user
            I want to find a school using Location
            and Major options
            So that i am able to find an specific value as a 100% match

  Given I have connection on http://www.collegeview.com/
    When I click on Start Searching button in Main page
    And I click on Location button in College Search page
    And I select the Ohio option in Location picklist
    And I click on Majors button in College Search page
    And I select the Bachelors radio button
    And I set the MajorSearch field with the value: Computer Software Engineering
    And I select the Computer Software Engineering option in Major picklist
    Then I get the result in the ListResult
    And I verify the Miami University-Oxford is listed
    And I verify the Miami University-Oxford is matched as 100%

