Scenario: Login to site as Username,Password by "POST YOUR AD" click and verify "Welcome back" as Aditya,Choudhuri
Given I navigate to testsystem
When I change Username,Password by "POST YOUR AD" clicking to ac@juventustech.com,juventus
Then I verify "Welcome back" as Aditya,Choudhuri

Scenario: Login to site as Username,Password by "SIGNUP" click and verify "Welcome back" as Aditya,Choudhuri
Given I navigate to testsystem
When I change Username,Password by "SIGNUP" clicking to ac@juventustech.com,juventus
Then I verify "Welcome back" as Aditya,Choudhuri