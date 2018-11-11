Feature: To test user access management 
@Demo 
Scenario Outline: To search the user to the HRM portal 
	Given User launches the application 
	When User logins with valid credentails 
		|UserName|Password|
		|<UserName>|<Password>|
	And User navigates to the Admin portal 
	And Search for the user 
		| SearchUserName | UserRole |
		|<SearchUserName>|<UserRole>|
	Then Validates if user exists in HRM portal 
		| SearchUserName | UserRole |
		|<SearchUserName>|<UserRole>|
		
	Examples: 
		|UserName|Password|SearchUserName| UserRole |
		|Admin   |admin123|Admin         | Admin    |