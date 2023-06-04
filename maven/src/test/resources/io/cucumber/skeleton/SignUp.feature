Feature: Sign Up
  Scenario Outline: SU_1 check text box first name with valid data
    Given The Sign up page is shown
    When User enter a valid first name "<first_name>"
    And User submit the form
    Then User see a massage "Nhap thanh cong"
    Examples:
      | first_name                      |
      | B Cd                            |
      | B c                             |
      | oaeịdsaokcnlkcaeljilkjcadlckấds |