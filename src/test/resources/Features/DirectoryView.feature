Feature: Viewing the Employees

@testcaseDirector
Scenario:As an admin user, I should be able to see all employees under the directory view

When user enters valid email and password
And click on login button
When “Page” navigates to Directory
Then User should able to see all employees