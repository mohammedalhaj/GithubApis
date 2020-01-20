Feature: Search Positions With Valid And Invalid Location Data

  Scenario Outline: Verify the position returned using valid location data
    Given call job link with parameter description and value <ValidLocationData>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | ValidLocationData |
      | chicago           |
      | la       |
      | Zurich            |

  Scenario Outline: Verify the position is not return using INVALID location data
    Given call job link with parameter description and value <InvalidLocationData>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is null

    Examples: 
      | InvalidLocationData |
      | northest            |
      | easter              |
      | balim               |
