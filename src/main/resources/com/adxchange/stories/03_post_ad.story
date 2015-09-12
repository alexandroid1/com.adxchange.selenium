!-- ------------------------ Post_AD Story -----------------------------------
Scenario: Login to site as Username,Password by "POST YOUR AD" click
and verify "Welcome back" as Aditya,Choudhuri
and create new post
in category Real Estate
Given I navigate to testsystem
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I change Username,Password by "POST YOUR AD" clicking to ac@juventustech.com,juventus
And I verify "Welcome back" as Aditya,Choudhuri
And I click "POST YOUR AD" button
And I choose category as Real Estate,2



