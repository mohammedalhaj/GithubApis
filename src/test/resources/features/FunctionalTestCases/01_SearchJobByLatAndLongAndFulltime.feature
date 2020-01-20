Feature: Search Positions With Lat And Long And Fulltime

  Scenario Outline: Verify the position returned using the lat And long And full_time parameters
    Given call job link using three parameters lat with value <LatValue> and long with value <LongValue> and full_time with value <FulltimeValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | LatValue  | LongValue  | FulltimeValue |
      | 48.707455 |   9.004405 | true          |
      | 52.309269 |   4.760830 | true          |
      | 42.360081 | -71.058884 | true          |
      
 