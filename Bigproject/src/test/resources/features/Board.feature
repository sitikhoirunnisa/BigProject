Feature: Cicle Test
  Otomation test on Staging Cicle's on Board feature

##  @BPN-1
  Scenario: User Add List on Board feature
    Given User Click Board
    When User Click Button Add List
    And User Set Name "Kamu Nanyak ?"
    Then User Click Button Creat
    And User get PopUp Creating list is success

##  @BPN-2
  Scenario: User Add Card on List Bar
    Given User Click Board
    When User Click add Card on List
    And User Set Name Card "Serius!"
    Then User Click Button AddCard
    And User Sucsesfully Create Card

##  @BPN-3
  Scenario: User Move Card on Other List
    Given User Click Board
    When User Click Option On Card
    And User Clik Move Card
    And User Click List Name
    Then User Choose Name
    And User Click Move
    And User Get PopUp Sucsess

#  @BPN-4
  Scenario: User Add Card Without Title on Board feature
    Given User Click Board
    When User Click add Card on List
    Then User Click add
    And User get PopUp Card name cannot be empty

#@BPN-5
  Scenario: User send cheeres on card without field
    Given User Click Board
    When User Click Card
    And User Click Cheers
    Then User Click Check
    And User Get popup Cheer cannot be empty


