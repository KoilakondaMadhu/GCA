-- find all the herovired session is equal to python
-- SELECT * FROM herovired WHERE SESSION = "python";
-- SELECT sid,name,college,session from herovired where session = "python";
 -- select * from herovired;
 -- SELECT* FROM herovired WHERE SESSION = "C++" and ADDRESS = "near nh 40 nandyal 518501"
 -- select * FROM herovired where name
 
 -- QUERY TO SERCH THE NAME WITH FIRST LETTER
  -- select *  FROM HEROVIRED WHERE NAME LIKE "K%";
-- SELECT * FROM herovired WHERE college IN ('srec','rgm');

-- SELECT * FROM herovired WHERE college = 'srec' OR college = 'rgm';
 CREATE TABLE STUDENT(
 STUDENT_ID INT PRIMARY KEY NOT NULL,
 STUDENT_NAME VARCHAR(30) NOT NULL,
 STUDENT_MARKS INT  NOT NULL,
 );
 
 
 -- select * from student;
-- insert into student values(1,'ram',99),(2,'sam',98),(3,'tom',97),(4,'sunny',98),(5,'bunny',94),(6,'tommy',95),(10,'ben',95);
-- select * from student where STUDENT_MARKS between 97 and 99 order by STUDENT_MARKS DESC;
-- SELECT COUNT(ADDRESS),ADDRESS FROM herovired GROUP BY ADDRESS;
 -- CREATE TABLE SCALESMAN(
--  SALESMAN_ID INT PRIMARY KEY NOT NULL,
-- -NAME VARCHAR(30) NOT NULL,
--  CITY VARCHAR(30) NOT NULL,
--  COMMISSION float
--  );
-- SELECT * FROM SALESMAN
drop scalesman


-- update rgm set name ="tom" where  contact =987650 
 -- update existing value
 -- select * from rgm;
 
  -- update rgm set name ="tom" where  contact =987650 
 -- update existing value
 -- select * from STUDENTstudent_contact;
-- CREATE TABLE STUDENT(
--  STUDENT_ID INT PRIMARY KEY NOT NULL,
--  STUDENT_NAME VARCHAR(30) NOT NULL,
--   STUDENT_CONTACT INT  NOT NULL,
--  STUDENT_DEPT INT  NOT NULL,
-- );
-- CREATE TABLE TEST(
--  STUDENT_ID INT PRIMARY KEY NOT NULL,
--  STUDENT_NAME VARCHAR(30) NOT NULL,
--   STUDENT_CONTACT INT  NOT NULL,
--  STUDENT_DEPT INT  NOT NULL
-- );
-- select * from student;
--  INSERT INTO TEST SELECT * FROM student;
-- SELECT * FROM TEST; 
-- CREATE TABLE TEST(
--    STUDENT_ID INT PRIMARY KEY NOT NULL,
--   STUDENT_NAME VARCHAR(30) NOT NULL,
--  STUDENT_CONTACT INT  NOT NULL,
--    STUDENT_DEPT varchar(30)  NOT NULL
--  );

 -- INSERT INTO TEST SELECT * FROM student;



-- alter table student rename column student_name to name;
 select * from student;

 TO CHANGE THE COLUMN NAME 


-- create database exercise;
-- CREATE TABLE customer(
--  ID INT PRIMARY KEY NOT NULL,
--  NAME VARCHAR(30) NOT NULL,
--  CITY VARCHAR(30) NOT NULL,
--  SCALESMAN_ID INT  NOT NULL
--  );
 insert into CUSTOMER values
  (1,"SUNNY","KURNOOL",124),
  (4,"BUNNY","KURNOOL",125),
 (5,"RUMMY","KURNOOL",124),
 (6,"VISKY","KURNOOL",125),
 (7,"VISKY","KURNOOL",125)
 ;
SELECT * FROM CUSTOMER;
