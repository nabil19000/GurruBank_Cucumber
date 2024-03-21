 Feature: Login

   Scenario: Successful login with valid credentials
     Given user launch firefox browser
     When user open URL "https://www.demo.guru99.com/V4/"
     When user enter userId as "mngr552708"
     When user enter password as "EsYmemu"
     And user click on login
     Then page title should be "Guru99 Bank Manager HomePage"
     When user click on log out link
     Then page title should be "Guru99 Bank Home Page"
     Then close browser
    @InvalidCredentials

   Scenario Outline: Login Data Driven
     Given user launch firefox browser
     When user open URL "https://www.demo.guru99.com/V4/"
     When user enter userId as "<user_id>"
     When user enter password as "<password>"
     And user click on login
     Then user should get login errors message as "User or Password is not valid"
     Then close browser
     Examples:
       | user_id    | password  |
       |            |           |
       | hygjfuth   | EsYmemu   |
       | mngr552708 | rtyygfh   |
       | ghytrdsex  | huiijnbvg |

         @ValidateManagerId
      Scenario: validate manager id
           Given user launch firefox browser
           When user open URL "https://www.demo.guru99.com/V4/"
           When user enter userId as "mngr552708"
           When user enter password as "EsYmemu"
           And user click on login
           Then page title should be "Guru99 Bank Manager HomePage"
           Then  user Should see a welcome message and the Manager id
           Then close browser