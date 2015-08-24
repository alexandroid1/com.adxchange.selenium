Scenario: Login to site as Username,Password by "POST YOUR AD" and "Welcome back" as Aditya,Choudhuri
Meta:
@pending
Given I navigate to testsystem
When I change Username,Password by "POST YOUR AD" clicking to ac@juventustech.com,juventus
Then I verify "Welcome back" as Aditya,Choudhuri