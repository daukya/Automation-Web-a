Feature: Login
  I wan login

  Scenario: Login acc correct
    Given open browser to login
    When click login
    And enter email
      | lenguyenthanhtuyen97@gmail.com |  |
    And enter pass
      || tinhtuyen2501|
    And click login button

    Then redirect home page







