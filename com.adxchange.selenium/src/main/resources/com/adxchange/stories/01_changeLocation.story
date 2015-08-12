Scenario: Change location to State,City and verify result
Given I navigate to testsystem
When I change location by State,City to AK,Adak
Then I verify location by State,City as AK,Adak

Scenario: Change location zip 85614 and verify result
Given I navigate to testsystem
When I change location by ZIP to ZIP 85614
Then I verify location by ZIP as: AZ,Green Valley

Scenario: Fake location State,City and verify Address (optional)
Given I change location to fake location
