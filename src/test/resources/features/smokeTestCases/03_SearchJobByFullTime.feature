@smoke
Feature: Search Positions With FullName Param

  Scenario Outline: Verify the position returned using the full time parameter
    Given call id job link with parameter full_time and value <FulltimeValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | FulltimeValue |
      | true     |
      | false    |
