Feature: To search the flight for given source and destination. 
@Demo
Scenario Outline: To search the flight for given source and destination 
	Given User launches the application
	When User logins with valid credentails
		|UserName|Password|
		|<UserName>|<Password>|
	Then User books the flight 
	Examples: 
		|UserName|Password|
		|Admin   |admin123|