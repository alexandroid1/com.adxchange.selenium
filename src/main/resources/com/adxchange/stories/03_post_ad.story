!-- ------------------------ Post_AD Story -----------------------------------
Scenario: Login to site as Username,Password by "SIGNUP" click and verify "Welcome back" as Aditya,Choudhuri
Given I navigate to testsystem
And I change Username,Password by "POST YOUR AD" clicking to ac@juventustech.com,juventus
And I verify "Welcome back" as Aditya,Choudhuri
And I click "POST YOUR AD" button


