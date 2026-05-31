# Library Management System (SQL)

A simple SQL project for managing books, students, and book issue records using MySQL.

## Features

* Manage books and students
* Issue books to students
* Track overdue books (more than 14 days)
* Analyze book category popularity
* Remove inactive borrowing records

## Database Structure

### Books

* bookingid (PK)
* title
* author
* category

### Students

* studentid (PK)
* studentName
* email
* joinDate

### IssuedBooks

* issuedid (PK)
* bookingid (FK)
* studentid (FK)
* issuedDate
* returnDate

## Queries Implemented

### Overdue Books

Displays students who have not returned books within 14 days.

### Category Popularity

Shows the number of books issued in each category.

### Data Cleanup

Removes issue records of students who have not borrowed books in the last 3 years.

## Output

## SQL Concepts Used

* Database & Table Creation
* Primary and Foreign Keys
* INSERT, SELECT, DELETE
* JOINs
* GROUP BY & ORDER BY
* Aggregate Functions
* Date Functions
* Subqueries

## How to Run

1. Create and select the database:

```sql
CREATE DATABASE librarydb;
USE librarydb;
```

2. Execute table creation scripts.

3. Insert sample data.

4. Run the queries to view results.

## Author

Mohammed Anas
