*** Settings ***
Documentation   To validate the Login form
Library     SeleniumLibrary
Test Teardown   Close Browser


*** Variables ***
${Error_Message_Login}      css:.alert-danger
${Shop_page_load}           css:.nav-link

*** Test Cases ***
Validate UnSuccesful Login
    open the browser with the Mortgage payment url
    Fill the login Form
    wait until it checks and display error message
    verify error message is correct




Validate Cards display in the Shopping Page
	open the browser with the Mortgage payment url
    Fill the login Form
    wait until Element is located in the page    ${Shop_page_load}
    Verify Card titles in the Shop page
   # Select the Card     Nokia Edge

*** Keywords ***
open the browser with the Mortgage payment url
 	 Open Browser    https://rahulshettyacademy.com/loginpagePractise/    Chrome    path=C:/path/to/chromedriver.exe
#    Create Webdriver    Chrome  executable_path=C:\DRIVERS\chromedriver.exe
#    Go To   https://rahulshettyacademy.com/loginpagePractise/

Fill the login Form
    Input Text          id:username     rahulshettyacademy
    Input Password      id:password     12345678
    Click Button        signInBtn

wait until it checks and display error message
    Wait Until Element Is Visible       ${Error_Message_Login}

verify error message is correct
   ${result}=   Get Text    ${Error_Message_Login}
   Should Be Equal As Strings     ${result}     Incorrect username/password.
   Element Text Should Be       ${Error_Message_Login}      Incorrect username/password.


wait until Element is located in the page
    [arguments]     ${element}
    Wait Until Element Is Visible       ${element}

Verify Card titles in the Shop page
   @{expectedList} =    Create List     iphone X    Samsung Note 8      Nokia Edge       Blackberry
   ${elements} =  Get WebElements     css:.card-title
   @{actualList} =   Create List
   FOR  ${element}  IN      @{elements}
      Log   ${element.text}
      Append To List    ${actualList}     ${element.text}
   END
   Lists Should Be Equal   ${expectedList}    ${actualList}














