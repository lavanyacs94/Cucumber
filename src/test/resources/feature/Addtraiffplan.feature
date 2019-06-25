
@tag
Feature: Title of your feature
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Title of your scenario outline
   Given T_home page
    And C_add_customer_button
    When F_details "<MonthRent>","<Freeloc>","<FreeInt>","<FreeSms>","<Loccharges>","<Intcharges>","<SMScharges>"
    And C_submit
    Then S_success
    
    Examples: 
      | MonthRent |Freeloc| FreeInt |FreeSms|Loccharges|Intcharges|SMScharges|
      | 100       | 200   | 300     |400    | 500      |600       |700|
      | 101       | 201   | 301     |401    |501       |601       |701|
