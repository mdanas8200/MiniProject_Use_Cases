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

<img width="783" height="160" alt="image" src="https://github.com/user-attachments/assets/025c59c8-9e54-42fe-bee4-3e6707df80c0" />

---
<img width="765" height="171" alt="image" src="https://github.com/user-attachments/assets/6aae8cb6-ea1c-476a-9f4d-7018b4dd635c" />

---
<img width="770" height="201" alt="image" src="https://github.com/user-attachments/assets/107c6d96-eae5-4bbb-8bd3-3b0c8c888eb6" />

---
<img width="733" height="123" alt="image" src="https://github.com/user-attachments/assets/e11385f5-a0dc-460b-937b-1e43b75efb90" />

---
<img width="375" height="113" alt="image" src="https://github.com/user-attachments/assets/02f1e642-818d-4c70-af53-1a216ac4ac4d" />

---
<img width="700" height="167" alt="image" src="https://github.com/user-attachments/assets/d9865747-f4d0-4685-a218-782362d7068f" />

---

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
