@smoke
Feature: Search Positions With Description Param

  Scenario Outline: Verify the position returned using the description parameter
    Given call id job link with parameter description and value <DescriptionValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | DescriptionValue |
      | automation  |
      | qa          |
      | manuall     |
