# Banking Management System – Java 8

## Project Description

A simple Java application to manage banking transactions using Java 8 Lambda Expressions and Stream API.

## Technologies Used

Java 8

Lambda Expressions

Stream API

Functional Interfaces

Collections Framework

## Project Structure

BankingManagement/

├── Transaction.java

├── BankingService.java

└── Main.java

## Features

Display all transactions.

Find credit transactions.

Find debit transactions.

Filter transactions above ₹5,000.

Calculate total credit amount.

Calculate total debit amount.

Sort transactions by amount.

Find the highest transaction.

Java 8 Concepts Used

Lambda Expressions

Stream API

filter()

forEach()

mapToDouble()

Method References

Comparator

## Output

All Transactions:
Rahul : CREDIT : 10000.0

Priya : DEBIT : 3000.0

Arun : CREDIT : 7000.0

Sneha : DEBIT : 6000.0

Kiran : CREDIT : 15000.0

John : DEBIT : 2000.0


Credit Transactions:

Rahul : 10000.0

Arun : 7000.0

Kiran : 15000.0


Debit Transactions:

Priya : 3000.0

Sneha : 6000.0

John : 2000.0


Transactions Above 5000:

Rahul : 10000.0

Arun : 7000.0

Sneha : 6000.0

Kiran : 15000.0


Total Credit:

Total Credit: 32000.0


Total Debit:

Total Debit: 11000.0


Sorted Transactions:

John : 2000.0

Priya : 3000.0

Sneha : 6000.0

Arun : 7000.0

Rahul : 10000.0

Kiran : 15000.0

Highest Transaction:

Highest Transaction: Kiran : 15000.0

## Expected Result

The application displays transaction details, credit and debit transactions, total amounts, sorted transactions, and the highest transaction.

## Author
**Manoj S**
