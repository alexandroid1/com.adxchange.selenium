!-- ------------------------ Post_AD Story -----------------------------------
Scenario: Create new post in category Real Estate, Left
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
And I verify "Welcome back" as Aditya,Choudhuri
And I click "POST YOUR AD" button
And I choose category as Real Estate
And I click "Next" button
And I choose layout as Left

Scenario: Create new post in category Real Estate, Panoramic
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
And I verify "Welcome back" as Aditya,Choudhuri
And I click "POST YOUR AD" button
And I choose category as Real Estate
And I click "Next" button

Scenario: Create new post in category Real Estate, Right
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password to ac@juventustech.com,juventus
And I click "Login" button
And I verify "Welcome back" as Aditya,Choudhuri
And I click "POST YOUR AD" button
And I choose category as Real Estate
And I click "Next" button



