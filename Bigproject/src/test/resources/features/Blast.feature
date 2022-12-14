Feature: Cicle Test
  User Otomation test on Staging Cicle's on Blast feature

@BPN-7
  Scenario: User Create Blast on Blast Future without Story
    Given User Click Menu Blast
    When User Click Button Create Blast
    And User Set title "Blast Without History"
    Then User Click Button Publish
    And User Get PopUp Create Post Sucsessfully

@BPN-8
  Scenario: User Create Blast on Blast Future without title
    Given User Click Menu Blast
    When User Click Button Create Blast
    Then User Type History "Blast Without Title"
    And User Click Button Publish
    And User Get PopUp Field parameter not complete.

@BPN-9
  Scenario:User Create Blast on Blast Future
    Given User Click Menu Blast
    When User Click Button Create Blast
    And User Set title "Blast Baru"
    Then User Type History "ini Blast nya aku"
    And User Click Button Publish
    And User Get PopUp Create Post Sucsessfully

@BPN-10
  Scenario: User Set due date on Blast
    Given User Click Menu Blast
    And User Click Button Create Blast
    And User Set title "Set Due Date"
    When User click due date
    And User Choose Manual set due date
    And User Set date
    Then User Click Next on Calender
    And User Choose Date
    And User Click Button Publish
    And User Get PopUp Create Post Sucsessfully

@BPN-11
Scenario: User Edit Blast to Private
    Given User Click Menu Blast
    And User Click Blast
    When User Click Option on Blast
    And User Click Edit
    And User switch to Private
    Then User Click Button Save Changes
    And User Get PopUp Update post successful


