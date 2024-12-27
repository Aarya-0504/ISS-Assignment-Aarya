-- Creating table called students
CREATE TABLE Students (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL,
    Age INT CHECK (Age > 0),
    City VARCHAR(50) DEFAULT 'Unknown'
);

