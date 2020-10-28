Feature: Add user

  @add
  Scenario:Add user
    Given user is on the login page
    And user logs in
    And user select Users module
    And user select  Add User  button
    When user adds new user information
      | Full Name | Tester    |
      | Password  | Test      |
      | E-mail    | test@test1 |
    And user clicks on save changes button


