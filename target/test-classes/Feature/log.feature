Feature: To validate login functionality of fb app

  Background: 
    Given Open Browser and Maxmize screen

  Scenario Outline: Enter Invaild Emails and Passwords
    When to Check vailed email"<email>" and Invaild passwords"<pass>"
    Then To print error message "<email>"and close browser

    Examples: 
      | email                  | pass          |
      | kumari@gmail.com       | 8989896977    |
      | marthu@gmail.com       | soniya        |
      | malika@gmail.com       | malikaaa895   |
      | mariyappan@gmail.com   | 8956557@hema  |
      | maruthamuthu@yahoo.com | mari@89556    |
      | jeeva@gmail.com        | Jeeva@984     |
      | pavithra568@gmail.com  | pavithram@895 |
      | Abcde@gmail.com        | jakii@8995    |
