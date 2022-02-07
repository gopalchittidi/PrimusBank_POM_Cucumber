
Feature: Branch creation

  @tag1
  Scenario: Branch creation
    Given Enter the URL
    When user enter the username And password
    #And password for the Admin Login
   # When  user clicks Login button
    Then Login Sucess
    When user clicks the branches 
    When user clicks the new branchcreation 
    When user enter the branchname And add1 And add2 And Add3 And Area And zipcode And  user Select the country And Select the state And Select the city 
  When user click the Submit button
   Then  New branch Creation Sucessfull And Logout of the application

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
  #  Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
  #    | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
