Feature: Search Positions With Valid Description Data

  Scenario Outline: Verify the position returned using the valid description data
    Given call job link with parameter description and value <ValidDescriptionData>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | ValidDescriptionData  |
      | ruby |
      | java |
      | data |
      | ai |
      | analist |
      | oracle |
      | amazon |
      | rest |
      
 