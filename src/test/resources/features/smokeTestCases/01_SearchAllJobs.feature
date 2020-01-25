Feature: Search All Positions

  Scenario: Verify searching all positions.
    Given call job link without param
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null
