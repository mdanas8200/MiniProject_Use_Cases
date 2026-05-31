create database librarydb;
use librarydb;

CREATE TABLE books (bookingid INT PRIMARY KEY auto_increment,
					title varchar(100),
                    author varchar(30),
                    category varchar(20));

CREATE TABLE students (studentid INT PRIMARY KEY auto_increment,
					studentName varchar(50),
                    email varchar(50),
                    joinDate DATE);

CREATE TABLE issuedBooks (issuedid INT PRIMARY KEY auto_increment,
					bookingid INT,
                    studentid INT,
                    issuedDate DATE,
                    returnDate DATE,
					foreign key (bookingid) references books(bookingid),
                    foreign key (studentid) references students(studentid));
                    
INSERT INTO Books(title, author, category) VALUES
('One Peice', 'Echiro Oda', 'Adventure'),
('Bleach', 'Kubo', 'Fiction'),
('Harry Potter', 'J.K. Rowling', 'Fiction');

INSERT INTO Students (studentName, email, joinDate) VALUES
('Anas', 'anas@gmail.com', CURRENT_DATE - INTERVAL 2 YEAR),
('abhinay', 'abhi@gmail.com', CURRENT_DATE - INTERVAL 4 YEAR),
('bala', 'bk@gmail.com', CURRENT_DATE - INTERVAL 1 YEAR),
('nethra', 'net@gmail.com', CURRENT_DATE - INTERVAL 5 YEAR);

INSERT INTO IssuedBooks (bookingid, studentid, issuedDate, returnDate) VALUES
(1, 1, CURRENT_DATE - INTERVAL 20 DAY, NULL),  
(2, 2, CURRENT_DATE - INTERVAL 10 DAY, NULL),  
(3, 3, CURRENT_DATE - INTERVAL 30 DAY, CURRENT_DATE - INTERVAL 5 DAY),
(1, 1, CURRENT_DATE - INTERVAL 5 DAY, NULL),   
(2, 4, CURRENT_DATE - INTERVAL 50 DAY, NULL); 

-- Overdue Books more than 14 days
SELECT 
    s.studentid,
    s.studentName,
    b.title,
    i.issuedDate,
    DATEDIFF(CURRENT_DATE, i.issuedDate) AS overdue
FROM IssuedBooks i
JOIN Students s ON i.studentid = s.studentid
JOIN Books b ON i.bookingid = b.bookingid
WHERE i.returnDate IS NULL
AND i.issuedDate < CURRENT_DATE - INTERVAL 14 DAY;

-- Most Borrowed Books
SELECT 
    b.category,
    COUNT(i.issuedid) AS totalBooks
FROM IssuedBooks i
JOIN Books b ON i.bookingid = b.bookingid
GROUP BY b.category
ORDER BY totalBooks DESC;

DELETE FROM IssuedBooks WHERE issuedid = 5;
INSERT INTO IssuedBooks (bookingid, studentid, issuedDate, returnDate) VALUES
(2, 4, CURRENT_DATE - INTERVAL 4 YEAR, NULL);


-- CLeanup Not Borrowed last 3 years
SET SQL_SAFE_UPDATES = 0;

DELETE FROM IssuedBooks
WHERE studentid NOT IN (
    SELECT studentid
    FROM (
        SELECT DISTINCT studentid
        FROM IssuedBooks
        WHERE issuedDate >= CURRENT_DATE - INTERVAL 3 YEAR
    ) recent
);

