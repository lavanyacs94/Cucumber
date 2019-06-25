
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given home
    And Addcust
    When filling
    |Fname|lea|
    |Lname|sathik|
    |email|leas@gmail.com|
    |addr|chennai|
    |phone|154786|
     
    And submiting
    Then  user see customer id
  