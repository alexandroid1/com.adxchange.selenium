Scenario: Login to site by Facebook as donald@theadxchange.com,@Rahul123
Given I navigate to testsystem
When I login to site by Facebook as donald@theadxchange.com,@Rahul123
Then I verify "Welcome back" as Donald,Frantum