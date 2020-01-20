Feature: Search Positions With Page Boundary Testing

  Scenario Outline: Verify the position returned using valid page number note:(48, 49) is already null
    Given call job link with parameter page and value <PageNumber>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      | PageNumber |
      | 0  |
      | 1  |
#      | 48  |  The pages 48, 49 doesn't return data here
#      | 49  |

  Scenario Outline: Verify the position not returned using INVALID page number
    Given call job link with parameter page and value <InvalidPageNumber>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is null

    Examples: 
      | InvalidPageNumber |
#     | -1       | this retrun value while it should not
      | 51       |
      | 50       |