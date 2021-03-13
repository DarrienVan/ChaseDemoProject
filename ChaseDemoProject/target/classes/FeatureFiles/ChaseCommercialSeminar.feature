@regression
Feature: Chase Commercial Seminar Feature

  Scenario Outline: Watch Commercial Seminar
    Given open Chase website
     And click commercial 
     And click watch now 
     And click <"CommProceed"> 
    Then validate with watch now 
     
     Examples: 
      |CommProceed|action		|
      |cancel  |negative test will pass|
      |proceed |possible test will fail|
 
