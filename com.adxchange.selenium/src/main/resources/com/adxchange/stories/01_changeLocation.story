Scenario: Change location to State,City and verify result
Given I navigate to testsystem
When I change location1 to AK,Adak
Then I verify location1 as AK,Adak

Scenario: Change location zip 85614 and verify result
Given I navigate to testsystem
When I change location2 to ZIP 85614
Then I verify location2 as: AZ,Green Valley