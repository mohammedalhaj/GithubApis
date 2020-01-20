@smoke
Feature: Search Positions With Lat And Long Params

  Scenario Outline: Verify the position returned using the lat and long parameters
    Given call job link with two parameters lat with value <LatValue> and long with value <LongValue>
    When execute job github api
    Then validate the response 200 is returned
    Then validate the response data is not null

    Examples: 
      | LatValue     | LongValue   |
      | 37.3229978 | -122.0321823 |
      |  52.520008 |    13.404954 |
      |  40.712776 | -74.005974   |
