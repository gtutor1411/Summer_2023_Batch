Feature: Tag Features

@Run
Scenario: Verify Registration 
Given This is a reg test

@Regression
Scenario: Verify Login 
Given This is a login test

@Regression @Critical
Scenario: Verify Make payment 
Given This is a payment test

@Sanity @Regression
Scenario: Verify Product search 
Given This is a  search test

@Critical
Scenario: Verify LogOut 
Given This is a logout test

