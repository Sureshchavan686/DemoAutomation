Feature: User Registers to Automation Demo Site 



Scenario Outline: User Registers Automation Demo Site with valid data	
When User is on Automation Demo Site
Then User enters Firstname "<Firstname>" Last Name "<Lastname>" and Adress "<Address>"
Then User enters Email "<Email>" Phone "<Phone>" and Hobbies


Examples: 
|Firstname	|Lastname	|Address|Email		 |Phone|
|Alex		|Chacon		|USA	|emai@123.com|8545856562|
