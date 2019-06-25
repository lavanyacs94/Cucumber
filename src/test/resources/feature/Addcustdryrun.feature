@tag
Feature: Title of your feature
  I want to use this template for my feature file

Background:
Given telecom home page
 And clicks Add customer button
 
 
  @tag1
  Scenario: Title of your scenario
     When filling all details
    |lav|sath|lavs@gmail.com|trichy|6565668|
    
    And clicks submit button
    Then see customer id

 
 