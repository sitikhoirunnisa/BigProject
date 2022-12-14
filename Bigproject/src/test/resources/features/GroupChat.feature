Feature: Cicle Test
  User Otomation test on Staging Cicle's on Group Chat feature

@BPN-12
  Scenario: User Send message
   Given User Click Group Chat
   When User Type Message "selamat malam malam"
   Then User Click Button Send
   And Message Is Send

@BPN-13
  Scenario: User attach file
    Given User Click Group Chat
    When User Choose File
    Then User Click Button Send
    And Message Is Send

@BPN-14
  Scenario: User Mantion member
   Given User Click Group Chat
    When User Type Message "@"
    And User Click Member
    Then User Click Button Send
    And Message Is Send
