@smoke
Feature: User switch between currencies US-Euro

  Scenario: switch between US Dollar and Euro
    Given Open browser, and website
      When click on currency drop-list and choose Euro
    Then  click on currency drop-list and choose US Dollar
