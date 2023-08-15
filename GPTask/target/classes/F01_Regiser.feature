@Smoke

Feature: User can register with his own data

    Scenario: User register to the website
      Given User click on Register button from the first page
      And   User Choose Gender
      And   user enter first name "automation"
      And   User Enter his Last Name "tester"
      And   user enter date of birth "15" "4" "1996"
      And   user enter email "test@example.com"
      And   user fills Password fields "P@ssw0rd"
      And   user fills confirmation Password fields "P@ssw0rd"
      When  User Click the Register Button
      Then  The user have been add his account successfully

