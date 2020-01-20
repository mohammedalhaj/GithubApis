@smoke
Feature: Search Positions With Location Param

  Scenario Outline: Verify the position returned using the location parameter
    Given call id job link with parameter location and value <LocationValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | LocationValue |
      | amman    |
      | dubai    |
      | egypt    |
      | 12345 |
      | Berlin   |
