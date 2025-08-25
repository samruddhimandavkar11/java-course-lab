CREATE DATABASE  EmployeeDB;
use EmployeeDB;
show tables;
 CREATE TABLE Employee (
    EmpId INT PRIMARY KEY,
    EmpName VARCHAR(50),
    Address VARCHAR(100),
    Phone VARCHAR(15),
    Designation VARCHAR(50),
    Depart VARCHAR(50),
    Salary DECIMAL(10,2),
    DOJ DATE,
    EMailId VARCHAR(100)
);

INSERT INTO Employee(EmpId, EmpName, Address, Phone, Designation, Depart, Salary, DOJ, EMailId) VALUES
(101, 'Sam', 'Mumbai', '1234567891', 'Manager', 'HR', 65000, '2020-01-15', 'sam@example.com'),
(102, 'Khushi', 'Pune', '3428739465', 'Developer', 'IT', 55000, '2021-03-20', 'khushi@example.com'),
(103, 'Rahul', 'Pune', '9387490432', 'Analyst', 'Finance', 48000, '2019-07-10', 'rahul@example.com'),
(104, 'Sneha', 'Bangalore', '9876564723', 'Designer', 'UI/UX', 42000, '2022-05-05', 'sneha@example.com'),
(105, 'Bhoomi', 'Hyderabad', '9876534567', 'Team Lead', 'IT', 72000, '2018-11-12', 'bhoomi@example.com'),
(106, 'Anjali', 'Chennai', '9876545678', 'HR Executive', 'HR', 40000, '2021-08-01', 'anjali@example.com'),
(107, 'Karan', 'Mumbai', '5638492034', 'Accountant', 'Finance', 46000, '2019-02-18', 'karan@example.com'),
(108, 'Khushal', 'Satara', '9568903422', 'Data Scientist', 'IT', 85000, '2020-10-10', 'khushal@example.com'),
(109, 'Aman', 'Rajasthan', '9452731955', 'Marketing Head', 'Marketing', 70000, '2017-09-25', 'aman@example.com'),
(110, 'Sakshi', 'Ahmedabad', '9876589012', 'Sales Executive', 'Sales', 38000, '2022-12-01', 'sakshi@example.com');

SELECT * FROM Employee;

CREATE TABLE Department (
    DeptId INT PRIMARY KEY,
    DeptName VARCHAR(50) UNIQUE,
    DeptHead VARCHAR(50)
);

INSERT INTO Department (DeptId, DeptName, DeptHead) VALUES
(001, 'HR', 'Sam'),
(002, 'IT', 'Bhoomi'),
(003, 'Finance', 'Rahul'),
(004, 'UI/UX', 'Sneha'),
(005, 'Marketing', 'Aman'),
(006, 'Sales', 'Sakshi');

SELECT * FROM Department;

alter table Employee add DeptId int;

ALTER TABLE Employee add FOREIGN KEY (DeptId) REFERENCES Department(DeptId);

SET SQL_SAFE_UPDATES = 0;

update Employee set  DeptId = 001 where Depart ='Hr';
update Employee set  DeptId = 002 where Depart ='IT';
update Employee set  DeptId = 003 where Depart ='Finance';
update Employee set  DeptId = 004 where Depart ='UI/UX';
update Employee set  DeptId = 005 where Depart ='Marketing';
update Employee set  DeptId = 006 where Depart ='Sales';