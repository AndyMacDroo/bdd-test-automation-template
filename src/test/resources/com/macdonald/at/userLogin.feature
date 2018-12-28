Feature: Login page for web app

  Background:
    Given I browse to the web app and I am not logged in
    When I see a "login" page
    Then the login page has a login form
    And there is a logo on the login page

  Scenario: If I am unauthenticated I see a login page

  Scenario: I try to login with an invalid user
    When I login with an invalid user
    Then I see a "Username or password is incorrect" error message

  Scenario: I try to login with a valid user
    When I login with a valid user
    Then I see a "home" page