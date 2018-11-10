Feature: To search the flight for given source and destination. 

Scenario Outline: To search the flight for given source and destination 
	Given User launches the application
	When User searches the flight for source and destination 
		| Source| Destination |
		|<Source>|<Destination>|
	Then User books the flight 
	Examples: 
		|Source|Destination|
		|Delhi |Mumbai     |