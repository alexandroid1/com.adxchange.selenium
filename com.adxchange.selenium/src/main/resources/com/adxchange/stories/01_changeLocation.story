Scenario: Change location to AA, Fro and verify result
Given I navigate to testsystem
When I change location to AA Fpo
Then I verify location as AA Fpo

Scenario: Change location zip 85614 and verify result
Given I navigate to testsystem
When I change location to ZIP 85614
Then I verify location as AA Fpo