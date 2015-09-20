!-- ------------------------ External Login Story -----------------------------------
!-- ------------------------ Facebook donald@theadxchange.com -----------------------

!--Scenario: Login to site by Facebook as donald@theadxchange.com,@Rahul123
!--Given I navigate to testsystem

!--  ----------------------------------------
!--And I click "SIGNUP" button
!--And I logout from site if user was register by social web
!--And I verify that I logged out from social web
!--And I click "Facebook" button
!--And I change Email to new Email
!--  -------------------------------------------

!--When I login to site by Facebook as donald@theadxchange.com,@Rahul123
!--Then I verify "Welcome back" as Donald,Frantum

!--Scenario: Logout from site by "LOG OUT" click
!--Given I navigate to testsystem
!--When I click "LOG OUT" button
!--Then I verify that label "LOG OUT" changed to "SIGNUP"

!--Scenario: External logout from site if user was register by social web
!--Given I navigate to testsystem
!--When I logout from site if user was register by social web
!--Then I verify that I logged out from social web

!-- ------------------------ Facebook adxchange123@gmail.com -----------------------

!--Scenario: Login to site by Facebook as adxchange123@gmail.com,741852963qazwsx
!--Given I navigate to testsystem
!--When I login to site by Facebook as adxchange123@gmail.com,741852963qazwsx
!--Then I verify "Welcome back" as Donald,Frantum

!--Scenario: Logout from site by "LOG OUT" click
!--Given I navigate to testsystem
!--When I click "LOG OUT" button
!--Then I verify that label "LOG OUT" changed to "SIGNUP"

!--Scenario: External logout from site if user was register by social web
!--Given I navigate to testsystem
!--When I logout from site if user was register by social web
!--Then I verify that I logged out from social web

!-- ------------------------ Twitter adxchange123@gmail.com -----------------------

!--Scenario: Login to site by Twitter as adxchange123@gmail.com,741852963qazwsx
!--   META:
!--   -pending
!--Given I navigate to testsystem
!--When I login to site by Twitter as adxchange123@gmail.com,741852963qazwsx
!--Then I verify "Welcome back" as adxchangeDonald,Frantum