Feature: Cicle Test
  Otomation test on Staging Cicle's on Board feature

  Scenario: Add List on Board feature
    Given Click Board
    When Click Button Add List
    And Set Name
    Then Click Button Creat

#  Scenario: Add Card on Board feature
#    Given Click Board
#    When Click add Card
#    And Set Name Card
#    Then Click add Card
#
#  Scenario: Add Card Without Title on Board feature
#    Given Click Board
#    When Click add Card
#    Then Click add Card
#    And user get PopUp Card name cannot be empty

