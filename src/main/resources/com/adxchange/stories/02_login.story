!-- ------------------------ Login Story -----------------------------------

Scenario: External logout from site if user was register by social web
Given I navigate to testsystem
And I click "SIGNUP" button
When I logout from site if user was register by social web
Then I verify that I logged out from social web

Scenario: Logout from site by "LOG OUT" click
Given I navigate to testsystem
And I click "POST YOUR AD" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
When I click "LOG OUT" button
Then I verify that label "LOG OUT" changed to "SIGNUP"

Scenario: Login to site as Username,Password by "SIGNUP" click and verify "Welcome back" as Aditya,Choudhuri
Given I navigate to testsystem
When I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
Then I verify "Welcome back" as Aditya,Choudhuri
And I click "LOG OUT" button
And I verify that label "LOG OUT" changed to "SIGNUP"

Scenario: Login to site as Username,Password by "POST YOUR AD" click and verify "Welcome back" as Aditya,Choudhuri
Given I navigate to testsystem
When I click "POST YOUR AD" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
Then I verify "Welcome back" as Aditya,Choudhuri
And I click "LOG OUT" button
And I verify that label "LOG OUT" changed to "SIGNUP"

Scenario: Login by cookie
Given I navigate to testsystem
And I click "POST YOUR AD" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
And I verify "Welcome back" as Aditya,Choudhuri
When I navigate to testsystem
Then I verify "Welcome back" as Aditya,Choudhuri
And I click "LOG OUT" button
And I verify that label "LOG OUT" changed to "SIGNUP"


