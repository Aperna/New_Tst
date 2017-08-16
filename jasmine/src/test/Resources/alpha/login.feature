Feature: Login functionality for Amazon
Scenario: user logs in amazon

 Given  user is on Amazonhomepage
 And  user click Sign-In
 When  user enters Username and password
 Then user clicks on Login button
 And user  logged in successfully



