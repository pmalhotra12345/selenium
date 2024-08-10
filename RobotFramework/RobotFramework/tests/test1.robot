*** Settings ***
Library           SeleniumLibrary

*** Variables ***
${BROWSER}        Chrome
${URL}            https://www.techlearning.ca


*** Test Cases ***
Open Browser To Example

    Open Browser    ${URL}    ${BROWSER}
    Maximize Browser Window
    Sleep    2
    Close Browser