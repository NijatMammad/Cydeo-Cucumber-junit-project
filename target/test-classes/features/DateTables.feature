Feature: Cucumber date Tables implementation practices
  @dataTable
  Scenario: list of fruits and vegetables I like
    Then user should see below list
    |orange|
    |apple|
    |kiwi|
    |strawberry|
    |tomato|
    |pear|
    |eggplant|