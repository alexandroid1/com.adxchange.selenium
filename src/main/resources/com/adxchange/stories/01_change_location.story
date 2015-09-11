!-- ------------------------ Change Location Story -----------------------------------

Scenario: Change location to State,City AK,Adak and verify result
Given I navigate to testsystem
When I change location by State,City to AK,Adak
Then I verify location by State,City as AK,Adak

Scenario: Change location by zip 85614 and verify result
Given I navigate to testsystem
When I change location by ZIP to ZIP 85614
Then I verify location by State,City as AZ,Green Valley

Scenario: Fake location State,City by user.js file and verify Address New York,Center Drive New York
Given I navigate to testsystem
Then I verify location by State,City as New York,Center Drive New York
