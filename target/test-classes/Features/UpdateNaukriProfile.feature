Feature: Automatic update of Naukri Profile 

Scenario Outline: Update Naukri.com Profile 	
When User is on Naukri Site
Then User enters Username "<Username>" password "<Password>" 
Then User updates profile by making changes


Examples: 
|Username				|Password	|
|sureshrc06@gmail.com	|7676945707	|