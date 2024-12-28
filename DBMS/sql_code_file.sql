use aaryadb;
-- Creating table called students
CREATE TABLE Authors (
    AuthorID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Country VARCHAR(50)
);

CREATE TABLE Books (
    BookID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(200) NOT NULL,
    AuthorID INT,
    Genre VARCHAR(50),
    Price DECIMAL(10, 2),
    FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID)
);

CREATE TABLE Members (
    MemberID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    MembershipDate DATE
);

CREATE TABLE BorrowingRecords (
    RecordID INT AUTO_INCREMENT PRIMARY KEY,
    MemberID INT,
    BookID INT,
    BorrowDate DATE,
    ReturnDate DATE,
    FOREIGN KEY (MemberID) REFERENCES Members(MemberID),
    FOREIGN KEY (BookID) REFERENCES Books(BookID)
);
-- Insert commands
INSERT INTO Authors (Name, Country)
VALUES 
('J.K. Rowling', 'UK'),
('George R.R. Martin', 'USA'),
('J.R.R. Tolkien', 'UK');

INSERT INTO Books (Title, AuthorID, Genre, Price)
VALUES 
('Harry Potter', 1, 'Fantasy', 20.99),
('Game of Thrones', 2, 'Fantasy', 25.99),
('The Hobbit', 3, 'Adventure', 15.99);

INSERT INTO Members (Name, MembershipDate)
VALUES
('Alice', '2023-01-01'),
('Bob', '2023-02-15');

INSERT INTO BorrowingRecords (MemberID, BookID, BorrowDate, ReturnDate)
VALUES
(1, 1, '2023-03-01', '2023-03-10'),
(2, 2, '2023-03-05', NULL);

-- select command
SELECT * FROM Books;

-- distinct 
SELECT DISTINCT Genre FROM Books;

-- where
SELECT * FROM Books WHERE Price > 20;

-- AND, OR
SELECT * FROM Books WHERE Genre = 'Fantasy' AND Price < 25;
SELECT * FROM Books WHERE Genre = 'Fantasy' OR Price < 25;

-- order by
SELECT * FROM Books ORDER BY Price DESC;

-- like
SELECT * FROM Books WHERE Title LIKE '%Harry%';

-- inner join
SELECT Members.Name AS MemberName, Books.Title AS BookTitle, BorrowingRecords.BorrowDate
FROM BorrowingRecords
INNER JOIN Members ON BorrowingRecords.MemberID = Members.MemberID
INNER JOIN Books ON BorrowingRecords.BookID = Books.BookID;

-- left join
SELECT Members.Name, BorrowingRecords.RecordID
FROM Members
LEFT JOIN BorrowingRecords ON Members.MemberID = BorrowingRecords.MemberID;

-- right join
SELECT Books.Title, BorrowingRecords.RecordID
FROM Books
RIGHT JOIN BorrowingRecords ON Books.BookID = BorrowingRecords.BookID;

-- group by
SELECT Genre, COUNT(*) AS BookCount FROM Books GROUP BY Genre;

-- having 
SELECT Genre, AVG(Price) AS AvgPrice FROM Books GROUP BY Genre HAVING AVG(Price) > 20;

-- union
SELECT Name FROM Members
UNION
SELECT Name FROM Authors;

-- alter
ALTER TABLE Members ADD Email VARCHAR(100);
select * from members;

-- stored procedure
DELIMITER //
CREATE PROCEDURE GetBooksByAuthor(IN author_name VARCHAR(100))
BEGIN
    SELECT Books.Title, Books.Genre
    FROM Books
    INNER JOIN Authors ON Books.AuthorID = Authors.AuthorID
    WHERE Authors.Name = author_name;
END //
DELIMITER ;
CALL GetBooksByAuthor('J.K. Rowling');

-- prepared statement
PREPARE stmt FROM 'SELECT * FROM Members WHERE Name = ?';
SET @name = 'Alice';
EXECUTE stmt USING @name;
DEALLOCATE PREPARE stmt;

-- callable statement
-- Callable statement to add a new member
DELIMITER //
CREATE PROCEDURE AddMember(IN member_name VARCHAR(100), IN join_date DATE)
BEGIN
    INSERT INTO Members (Name, MembershipDate) VALUES (member_name, join_date);
END //
DELIMITER ;

CALL AddMember('Charlie', '2023-05-01');
select * from Members;