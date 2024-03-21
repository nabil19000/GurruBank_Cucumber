Feature:  customer

  Background:
    Given user launch firefox browser
    When user open URL "https://www.demo.guru99.com/V4/"
    When user enter userId as "mngr552708"
    When user enter password as "EsYmemu"
    And user click on login
    Then page title should be "Guru99 Bank Manager HomePage"



  Scenario: successful add new customer
    Given user is on the home page
    When user click on new customer button
    Then page title should be "Guru99 Bank New Customer Entry Page"
    When user enter the new customer infos
    When user click on submit button
    Then page title should be "Guru99 Bank Customer Registration Page"
    And Customer ID should be created
    @InvalidCustomerInfos
    Scenario: invalid customer info
      Given user is on the home page
      When user click on new customer button
      Then page title should be "Guru99 Bank New Customer Entry Page"
      When user click on submit button
      Then user Should get allert message as "please fill all fields" and accepte the allert
      Then close browser
     @EmptyCustomerInfo
     Scenario: empty customer info
       Given user is on the home page
       When user click on new customer button
       Then page title should be "Guru99 Bank New Customer Entry Page"
       When user enter the new customer as emptyinfo
       When user click on submit button
       Then user Should get allert message as "please fill all fields" and accepte the allert
       Then user get errors msg for each empty field
       Then close browser
