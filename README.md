# CronExpressionParser

A simple cron expression parser which parses the given string and return all possibles trigger time for Cron.

Prerequisite
- Maven : Latest version 
- Java : Java 18 or later

Steps to run:
- Simply download the code from repository.
- From repository's root location where pom.xml file is present run the below command
  - mvn clean compile exec:java -Dexec.args="* * * * * /cmd/find"

# Sample input for args:

*/15 0 1,15 * 1-5 /cmd/find

# Sample output:
minute 0 15 30 45 60

hour 0

day of month 1 15

month 1 2 3 4 5 6 7 8 9 10 11 12

day of week 1 2 3 4 5

comand /cmd/find
