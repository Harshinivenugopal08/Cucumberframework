#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Page
  I want to use this template for my feature file

  Background:
    Given User is on the login page

  @tag2
  Scenario Outline: Login with valid credentials
    When User enters "<username>" as username
    And User enters "<password>" as password
    And User accepts terms and conditions
    And User clicks the sign-in button
    Then User should be logged in successfully

    Examples:
      | username           | password |
      | rahulshettyacademy | learning |
