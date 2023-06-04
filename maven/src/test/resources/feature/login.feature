Feature: As a user, I want to login to "http://xthb.huce.edu.vn/"
  # data
  # user_name
  # pass_word
  Scenario: LI_01 Check cannot login without password
    Given The login page is shown
    When User attempt to login with account is "kien@gmail.com" and password is "1"
    Then The message "Vui lòng nhập vào mật khẩu" is shown
    Then Close Brower
