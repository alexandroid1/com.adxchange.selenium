Scenario: Login to site by Facebook as donald@theadxchange.com,@Rahul123
Given I navigate to testsystem
When I login to site by Facebook as donald@theadxchange.com,@Rahul123
Then I verify "Welcome back" as Donald,Frantum

Scenario: External logout from site if user was register by social web
Given I navigate to testsystem
When I logout from site if user was register by social web
Then I verify that I logged out from social web

Scenario: Login to site by Twitter as adxchange123@gmail.com,741852963qazwsx
Given I navigate to testsystem
When I login to site by Twitter as adxchange123@gmail.com,741852963qazwsx
Then I verify "Welcome back" as Donald,Frantum