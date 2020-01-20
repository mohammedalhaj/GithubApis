Feature: Search Positions With Lat And Long And Fulltime

  Scenario Outline: Verify the position returned using the lat And long And full_time parameters
    Given call job link using three parameters lat with value <LatValue> and long with value <InvalidLongValue> and full_time with value <FulltimeValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is null

    Examples: 
      | LatValue  | InvalidLongValue  | FulltimeValue |
      | 48.707455 |   xyz | true          |
      | 520.309269 |   data | true          |
      | 42.360081 | invalid | true          |

      
  Scenario Outline: Verify the position not returned using INVALID lat And long And full_time parameters
    Given call job link using three parameters lat with value <InvalidLatValue> and long with value <LongValue> and full_time with value <FulltimeValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is null

    Examples: 
      | InvalidLatValue  | LongValue  | FulltimeValue |
      | y |   9.004405 | true          |
      | 78u |   4.760830 | true          |
      | iio | -71.058884 | true          |
      
 