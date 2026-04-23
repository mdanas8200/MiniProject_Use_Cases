# FinSafe  (Java)

A simple console Java application that simulates basic banking operations like deposit, withdrawal, and mini statement generation with proper exception handling.

---

## Project Overview

It is a banking system that allows users to:

* Create an account
* Deposit money
* Withdraw money
* View last 5 transactions

The system ensures safe transactions using custom exception handling for insufficient funds and invalid inputs.

---

## Features

* Account creation with initial balance
* Deposit money with validation and Withdraw money with balance check
* Mini statement for last 5 transactions
* Custom exception for insufficient funds

---

## Project Structure

```id="b2k7dm"
finsafe/
│
├── src/
│   ├── exception/
│   │   └── InSufficientFundsException.java
│   │
│   ├── model/
│   │   ├── Account.java
│   │   ├── Transaction.java
│   │   └── TransactionType.java
│   │
│   ├── service/
│   │   └── TransactionService.java
│   │
│   └── Main.java
│
├── out/
├── .gitignore

```

---

## How It Works

1. User enters username and initial balance
2. Account object is created
3. Menu options are displayed
4. User performs operations:

    * Deposit adds money
    * Withdraw deducts money with validation
    * Mini Statement shows last 5 transactions

---

## Validation Rules

* Deposit amount must be greater than 0
* Withdraw amount must be:

    * Greater than 0
    * Less than or equal to account balance

---

## Exception Handling

Custom Exception
InSufficientFundsException

* Thrown when withdrawal exceeds available balance

Built-in Exception
IllegalArgumentException

* Thrown for invalid input such as negative or zero amount

---

## Outputs


---

## How to Run

### Method 1: Using IntelliJ IDEA

1. Open the project in IntelliJ
2. Navigate to Main.java
3. Right-click and select Run Main

---

### Method 2: Using Command Line

1. Navigate to src folder:

```id="y8z9kh"
cd src
```

2. Compile all packages:

```id="qoz7iy"
javac exception/*.java model/*.java service/*.java Main.java
```

3. Run the program:

```id="c3t0fg"
java Main
```

---

## Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* Exception Handling
* ArrayList
* Enum
* Loops and Switch Case

---

## Author

Mohammed Anas

---