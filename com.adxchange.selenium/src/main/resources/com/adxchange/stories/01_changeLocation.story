Scenario: Change location to AA, Fro and verify result
Given I navigate to testsystem
When I change location to Khmel'nyts'koho Avenue Melitopol',Zaporiz'ka oblast
Then I verify location as Khmel'nyts'koho Avenue Melitopol',Zaporiz'ka oblast

Scenario: Change location zip 85614 and verify result
Given I navigate to testsystem
When I change location to ZIP85614
Then I verify location as ZIP85614