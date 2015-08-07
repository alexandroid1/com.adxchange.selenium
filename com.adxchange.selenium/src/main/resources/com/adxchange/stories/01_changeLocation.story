Scenario: Change location to Apo,AA and verify result
Given I navigate to testsystem
When I change location to Apo,AA
Then I verify location as Apo,AA

Scenario: Change location zip 85614 and verify result
Given I navigate to testsystem
When I change location to ZIP 85614
Then I verify location as ZIP 85614