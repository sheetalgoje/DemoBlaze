Feature: Demoblaze Login
  
    
    @tc_01_login
  Scenario Outline: To check the login process
    Given user launches the chrome browser
    And user enters the url and opens the Login link
    Then user gives his username "<uname>" and password "<pwd>"
    And clicks on the login button
    And user closes the browser
    
    Examples:
    |uname|pwd|
    |sheetal|sheetal|
     |cog |cog |
    
 @tc_02_phonesection
   Scenario: TO select user phone 
    Given open the browser to open website
    And user opens the demoblaze and click on login
    And user enter the username  and password  and get login
    Then user enters to mobile section
    Then user select the mobile and add the product to his/her cart 
    
    
    @tc_03_laptopsection
    Scenario: To select Laptop
    Given that user Launche and open the site
    When user Logins to website and enters usernm and paswrd
    Then clicks on laptop and select user desired laptop
    Then add it cart and displays in cart 
    
    @tc_04_register
    Scenario: To get register
    Given user opens the browser 
    When user want to buy products and tap on signup
    Then registeres by entering new user and password
       
    @tc_05_excellogin
    Scenario: To get login by excel
    Given launch the chrome browser
    When demoblaze opens 
    Then  ENters the email and password
    Then click on login button
    And close the browser
       
    