@smoke
Feature: Search Positions With MarkDown Param

  Scenario Outline: Verify the position returned using the markdown parameter
    Given call id job link with parameter markdown and value <MarkdownParam>
    When execute job github api
    Then validate the response 200 is returned
    And validate the response data is not null

    Examples: 
      |MarkdownParam|
      |true |
      |false |
