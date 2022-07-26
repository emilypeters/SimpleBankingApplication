# SimpleBankingApplication

A basic application that retrieves account information from a json
file and converts it to an internal AccountDto object. Thymeleaf is used
to iterate through AccountDto objects and display account holder information.
***
What does what:

GsonAssembler : convert from json to AccountDto

controller : navigate between /index and /accounts

AccountDto: internal account object
* properties
   * name (string)
   * email (string)
   * accountNumber (integer)
   * currentBalance (double)
***

# Sample Data in Json File

| Name           | Email                | Account Number | Current Balance |
|----------------|----------------------|----------------|-----------------|
| Eddie Harrison | eharrison3@gmail.com | 4356972        | 235.6           |
| Manny Roe      | mroe45@gmail.com     | 3759067        | 457.2           |
| Lisa McGuire   | mguire12@gmail.com   | 1262399        | 2378.4          |
| Monica James   | mjames@gmail.com     | 4462198        | 124.9           |

The account information displayed in the table is fictitious. 
No identification with actual persons or bank records is intended or 
should be inferred.

***

# Expected Output

![accounts](accounts.png)
