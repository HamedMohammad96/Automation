@Smoke

  Feature: create a new account by filling in all the registration data.

    Scenario: User Sign in to the website
      Given User click on Account button
      And   User Click on Sign In Button
      And   User fills email "hamed.mohammad@gmail.com"
      And   User click on continue button
      And   User fills password "Hamed@12345"
      And   User fills confirmation password "Hamed@12345"
      And   User click on another continue button
      And   User fills First Name "Hamed"
      And   User fills Last Name "Mohammad"
      And   User fill Phone Number "01148813222"
      And   User click on the continue button
      And   User Choose Gender "Male"
      And   User Choose date of birth
      When  User click on check box of terms
      Then  User Click the last continue button