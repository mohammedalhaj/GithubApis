Feature: Search Positions With Location ZipCode And CityName

  Scenario Outline: Verify the position returned using valid location cityname
    Given call job link with parameter location and value <LocationCityName>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | LocationCityName |
      | bali           |
      | baco       |
      | lv            |

  Scenario Outline: Verify the position is returned using  location zipcode
    Given call job link with parameter location and value <LocationZipCode>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | LocationZipCode |
      | 112            |
      | 45225              |
      | 1241               |
