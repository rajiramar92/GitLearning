


@Login
Feature:
To Validate Login Funtionality in fb app

Background:
Given User have to enter fb login page

@Sanity @Regression
Scenario:

To Validate login Funtionality with valid email and invalid password

When User have to enter vAlid email and invalid password


|username|password|
|ishu|ishu%123|
|visha|qwery|

And User have to click login button
Then User have to be in invalid credentials page

@Smoke
Scenario:
To Validate login Funtionality with invalid email and invalid password

When User have to enter invalid email and invalid password
And User have to click login button
Then User have to be in invalid credentials page

@Regression
Scenario:
To Validate login Funtionality with invalid email and valid password

When User have to enter invalid email and valid password
And User have to click login button
Then User have to be in invalid credentials page


