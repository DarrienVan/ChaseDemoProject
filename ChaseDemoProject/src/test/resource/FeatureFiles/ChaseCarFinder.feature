Feature: Chase Car Finder

  Scenario Outline: Chase Car Finder
   Given open Chase website
    And click on auto
    And click shop for car 
    And click finance
    And click Chase dealer network 
    And type in "<Carzipcode>"  
    Then verify by "<Carzipcode>" results
    

    Examples: 
      |Carzipcode|Result|
      |11418  |Continue as guest|
      |11     |Please enter a valid ZIP.|
      |00003  |We're sorry. This service is not yet available in your area. More dealers will be added soon.|