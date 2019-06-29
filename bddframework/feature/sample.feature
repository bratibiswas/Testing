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
Feature: Test arithmetic functionality

	Background:
	  Given variables a and b are assigned proper values
		And a and b have positive values
		But a and b are not "0"

  @tag1
  Scenario: Test addition scenario
    Given Open firefox and start application
    When I enter valid username and password
    And I click the Login button
    Then Home page should be displayed
  
  @tag2
  Scenario Outline: eating
  Given there are <start> cucumbers
  When I eat <eat> cucumbers
  Then I should have <left> cucumbers

  Examples:
    | start | eat | left |
    |    12 |   5 |    7 |
    |    20 |   5 |   15 |
    
  @tag3
  Scenario: usage of doc strings
  Given a paragraph with body
  """
  Hi my name is Alex Karev. I am a pediatric surgeon.
  I live in seattle, washington.
  Warm Regards
  ============
  """
  Then pass 1
  
