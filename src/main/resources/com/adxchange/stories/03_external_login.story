!-- ------------------------ External Login Story -----------------------------------
!-- ------------------------ Facebook donald@theadxchange.com @Rahul123 -----------------------
!-- At first registration by Facebook please fill in the name input as Donald,Frantum
Scenario: Login to site by Facebook as donald@theadxchange.com,@Rahul123
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I click "Facebook" button
Then I verify "Welcome back" as Donald,Frantum
And I click "LOG OUT" button
And I verify that label "LOG OUT" changed to "SIGNUP"


!-- ------------------------ Twitter adxchange123@gmail.com 741852963qazwsx -----------------------
!-- At first registration by Twitter please fill in the name input as Donald,Frantum
Scenario: Login to site by Twitter as adxchange123@gmail.com,741852963qazwsx
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
And I click "Twitter" button
And I click "Authorize" button
Then I verify "Welcome back" as Donald,Frantum
And I click "LOG OUT" button
And I verify that label "LOG OUT" changed to "SIGNUP"

!-- ------------------------ Google+ adxchange92@gmail.com 741852963qazwsx111 -----------------------
Scenario: Login to site by Google+ as adxchange92@gmail.com,741852963qazwsx111
Given I navigate to testsystem
And I click "SIGNUP" button
And I logout from site if user was register by social web
And I verify that I logged out from social web
!-- And I click "Google+" button