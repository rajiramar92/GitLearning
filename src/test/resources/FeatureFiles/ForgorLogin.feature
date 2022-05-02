
@forgotpass
Feature:
To validate forgotten functionality in fb page

@Sanity @Smoke
Scenario:
To validate forgotten password with wrong mobile number

Given User have to enter fb login page
And User have to click forgot password
When User have to click invalid mobile number
And User have to click login page
Then  user have to be retry page
