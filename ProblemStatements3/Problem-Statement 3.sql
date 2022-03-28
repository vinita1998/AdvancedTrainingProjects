CREATE DATABASE bookstore ;
use bookstore ;
CREATE TABLE `books` (
  `Book_id` varchar(10) NOT NULL,
  `Book_name` varchar(50) NOT NULL,
  `Author` varchar(60) NOT NULL,
  `Price` double NOT NULL, 
  constraint pk1 primary key (Book_id) 
);

CREATE TABLE `order_details` (
  `Order_Id` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `mobileno` int(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `Order_Date` date NOT NULL,
  `Quantity` int(11) NOT NULL,
   constraint pk1 primary key (Order_Id) 
   );

CREATE TABLE `Users` (
  `first_name` varchar(10) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `registration_date` date NOT NULL
);
 
 insert into books  values ( ' 1 ', 'Let Us C' , 'Yashavant P. Kanetkar ' , 200.00 ) ;
 insert into books  values ( ' 2 ', 'Thinking in Java' , 'Thinking in Java'  , 300.00 ) ;
 insert into books  values ( ' 3 ', 'Computer Networking' , 'James F. Kurose' , 250.00 ) ;
 insert into books  values ( ' 4 ', 'Head First C#' , 'Andrew Stellman ' , 400.00 ) ;
 insert into books  values ( ' 5', 'What is HTML5 ?' , 'Brett Mclaughlin ' , 300.00 ) ;
 insert into books  values ( ' 6 ', 'HTML in Action' , 'Joe Lennon ' , 569.00 ) ;
 insert into books  values ( ' 7 ', 'OOP with C++' , 'Balagurusamy ' , 308.00 ) ;
 insert into books  values ( ' 8 ', 'C++ : The Complete Reference' , 'Herbert Schildt ' , 532.00 ) ;
 insert into books  values ( ' 9 ', 'Head First SQl' , 'Lynn Beighley ' , 450.00 ) ;
 insert into books  values ( ' 10 ', 'SQL : The Complete References' , ' James Groff ' , 667.00 ) ;
 
 
 insert into  Users values ('Amit ' , 'Wagholi ' , 'amit.mishra369@gmail.com' ,'9673960407 ', 'mona9Dutta ' , '2016-11-08 ' ) ;
 insert into  Users values ('Hari' , 'Chandan Nagar ' , 'hari39@rediffmail.com' ,'7845127421' , 'Adam99@ ' , '2016-11-08 ' ) ;
 insert into  Users values ('Monalisa ' , 'Rakshak Nagar ' , 'mona9@gmail.com' ,'9878454503' , 'pinaki9@ ' , '2016-11-08 ' ) ;
 insert into  Users values ('Narendra ' , 'Rajpath ' , 'narendra17@pmo.nic.in' , '8877990011 ', '	Delhi9% ' , '2016-11-08 ' ) ;
 insert into  Users values ('Kavita ' , 'Rakshak Nagar Gold ' , 'kavi23@gmail.com' , '98978521402' , 'Alia8& ' , '2016-11-08 ' ) ;


 insert into order_details  values ( '1' ,  ' Radhika Vihar ' , '9673960407' , 'Amit ' ,'2016-11-08 ' , '3' );
 insert into order_details  values ( '2' ,  ' Rakshak Nagar ' , '875451395 ' , ' Mona ' , '2016-11-08 ' , '3' );
 insert into order_details  values ( '3' ,  ' Rakshak Nagar Gold' , '7845127845' , ' Kavi ' , '2016-11-08 ' , '2' );
 insert into order_details  values ( '4' ,  ' Bangalore ' , '784512788' ,  'Monalisa' , '2016-11-08 ' , '3' );
 insert into order_details  values ( '5' ,  ' Wadganosheri ' , '784578215' , ' Amol ' , '2016-11-08 ' , '3' );
 insert into order_details  values ( '6' ,  ' Bangalore ' , '78521868' , 'Amit ' , '2016-11-08 ' , '2' ); 
 