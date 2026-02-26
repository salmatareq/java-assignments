# Assignment: Banking System (OOP)

## What I built

I implemented a simple banking system using Java OOP principles.
The system supports multiple account types (Savings, Checking, and Business accounts), transaction history tracking, transfers between accounts, and a bank class that manages accounts and calculates total assets.

## Design decisions

I used inheritance to model different account types extending an abstract BankAccount class.
Polymorphism was applied to override withdraw behavior depending on account rules (overdraft limits and savings restrictions).

Key principles used:

- Encapsulation (protected balance and controlled operations)
- Inheritance (account hierarchy)
- Polymorphism (different withdraw logic)
- Single Responsibility Principle (Bank manages accounts, Account manages money)
