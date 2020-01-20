Feature: Search Positions With Description, FullTime, Lat, Long And Page

  Scenario Outline: Verify the position returned using valid parameters
    Given call job link using five parameters description with value <DescriptionValue> and full_time with value <FullTimeValue> and lat with value <LatValue> and long with value <LongValue> and page with value <PageValue>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | DescriptionValue|FullTimeValue|LatValue|LongValue|PageValue|
      | ruby            |true         |52.520008 |13.404954 |     0   | 
      | java            |true         |36.188549|-94.541382 |     1   |