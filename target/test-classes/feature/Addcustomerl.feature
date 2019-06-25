
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given telecom home page
    And clicks Add customer button
    
    When filling all detils
    |lav|sath|lavs@gmail.com|trichy|6565668|
    
    And clicks submit button
    Then see customer id

 