a.)
create database if not exists sql1;
use sql1;
CREATE TABLE Programmer
( EmpNo numeric(5) not null,
  ProjId varchar(5),
  LastName varchar(30), 
  FirstName varchar(30),
  HireDate varchar(10),
  Lang varchar(15),
  TaskNo numeric(2),
  Priviledge varchar(25),
  CONSTRAINT Employee_pkey PRIMARY KEY (EmpNo)
);

b)
insert into Programmer VALUES(201,"NPR","Gupta","Saurav","1995-01-01","VB",52,"Secret");
insert into Programmer VALUES(390,"KCW","Ghosh","Pinky","1993-05-01","Java",11,"Top Secret");
insert into Programmer VALUES(789,"Rnc","Agarwal","Praveen","1998-08-31","VB",11,"Secret");
insert into Programmer  VALUES(134,"TIPPS","Chaudhary","Supriyo","1995-07-15","C++",52,"Secret");
insert into Programmer VALUES(896,"KCW","Jha","Ranjit","1997-06-15","Java",10,"Top Secret");
insert into Programmer(EmpNo,ProjId,LastName,FirstName,HireDate,Lang,TaskNo)VALUES(345,"TIPPS","John","Peter","1999-11-15","Java",52);
insert into Programmer VALUES(563,"NITTS","Anderson","Andy","1994-08-15","C++",89,"confidential");

c)
create table Weather
(
  City varchar(25),
  State varchar(20),
  High int,
  Low int
);

insert into Weather values("Calcutta","West Bengal",105,90);
insert into Weather values("Trivandrum","Kerala",101,92);
insert into Weather values("Mumbai","Maharashtra",88,69);
insert into Weather values("Banglore","Karnataka",70,60);
insert into Weather(City,High,Low) values("New Delhi",88,69);
select * from Weather;

d)
create table Book
(
  Bookid numeric(5) not null,
  Title varchar(5),
  Topicid varchar(10),
  Publishername varchar(30),
  Placeofpublication varchar(15),
  Price numeric(4),
  Purchasedate varchar(10),
  Shelfno varchar(5),
   CONSTRAINT BookID_pkey PRIMARY KEY (Bookid)
  );
  
insert into Book values(8293,"DBMS","DB1","Prentice Hall","Mumbai",225,"1995-01-01","S11");
insert into Book values(5645,"DBMS","DB1","Peason Education","Mumbai",655,"1995-05-01","S12"),(6565,"C","C1","TMH","Mumbai",840,"1998-08-31","S66"),
(6567,"C++","Cplus1","ABC Publishers","Delhi",300,"1995-07-15","S77"),
(4576,"JAVA","JAVA1","Guru Govind Publications","Delhi",500,"1997-06-15","S87"),
(3433,"OOPS","OOPS1","Dave Publishers","Pune",600,"1999-11-15","S56"),
(4655,"SAD","SAD1","Sajan Publications","Cochin",700,"1994-08-15","S76");

e)
i)update Programmer set ProjId="NITTS",Lang="C++" where LastName='Gupta';

ii)update Book set Shelfno="S10" where Title="DBMS";

iii)delete from Programmer where FirstName='Supriyo';

iv)alter table Weather ADD rainy int;
alter table Weather ADD cloudy int;
alter table Weather ADD sunny int;
alter table Weather ADD snow int;
insert into Weather (rainy,cloudy,sunny,snow)values(12,45,67,89),(45,32,65,78),(88,77,66,54),(92,57,17,10),(84,36,82,11);

v)Delete from Weather;

f)
CREATE TABLE Customer
(
cId int,
Fname char(30),
Lname char(30),
Address char(50),
phoneNo numeric(10) NOT NULL,
city char(20),
country char(20),
DateFirstPurchased date,
supplierid int,
constraint cust_pk PRIMARY KEY(cId),
constraint supplier_fk FOREIGN KEY(supplierid) REFERENCES Supplier(supplierid)
);
insert into Customer values(1001,'Das','Jeyaseelan','119,park Avenue,II street','9841093428','Coimbatore','India','2004-01-10',1);
insert into Customer values(2001,'Gopi','Govindraj','241,I floor,Kamaraj street,Madippakkam','9444124590','Chennai','India','2005-03-25',4);
insert into Customer values(1201,'Dilip','Kishore','43,II Avenue,Anna Nagar','9997234534','Bangalore','India','2004-08-20',2);
insert into Customer values(1300,'Aanand','Chowdhury','42/1 sector 1,II street','9841054348','Bangalore','India','2005-05-15',2);
insert into Customer values(1220,'Chandra','Nagarajan','83,lag bagh','9841067235','Bangalore','India','2006-02-12',4);
insert into Customer values(1221,'Abhishek','Kumar','13,kishori park','9444762390','Chennai','India','2004-05-15',1);
insert into Customer values(1320,'Nikhil','Pandit','218,alwaanya street','9444892309','Salem','India','2006-04-21',3);
insert into Customer values(1222,'Meenu','Monica','C11,chruch road','9841056342','Trichy','India','2004-08-30',1);
insert into Customer values(1225,'Pavan','Kumar','128/A,North street','9993478213','Madurai','India','2004-08-18',4);

---
CREATE TABLE Supplier
(
supplierid int,
Sname char(30),
Scity char(30),
Sphone numeric(10) NOT NULL,
Email char(50) UNIQUE,
constraint supplier_pk PRIMARY KEY(supplierId)
);

insert into Supplier values(1,'Dilip','Chennai','8999900000','dilip@abc.co.in');
insert into Supplier values(2,'Tarun','Madurai','8999911111','tarun@xyzl.com');
insert into Supplier values(3,'Naresh','Coimbatore','8999922222','g.naresh@xyzl.com');
insert into Supplier values(4,'Ganesh','Trichy','8999933333','Ganesh_83@ijk.com');
---
CREATE TABLE Orders
(
OrderId int,
OrderDate Date,
CId int,
Quantity int,
ItemId int,
Constraint pk_orderId PRIMARY KEY(OrderID),
Constraint chk_quantity CHECK(Quantity>0),
constraint fk_ItemId FOREIGN KEY(ItemId) REFERENCES Items(ItemId)
);

insert into Orders values(1,'2004-01-12',1001,30,25);
insert into Orders values(2,'2005-01-06',1202,38,24);
insert into Orders values(3,'2006-12-16',1220,10,22);
insert into Orders values(4,'2004-05-21',1233,12,21);
---
CREATE TABLE Items
(
ItemId int,
Itemname char(35) NOT NULL,
SupplierId int,
Minqty int NOT NULL,
Maxqty int NOT NULL,
Price numeric(5,2),
constraint pk_ItemId PRIMARY KEY(ItemId),
constraint fk1_supplier FOREIGN KEY(supplierId) REFERENCES Supplier(supplierId)
);

insert into Items values(20,'Pears Soap',4,7,20,30.00);
insert into Items values(21,'V.V.D. Coconut oil 200ml',2,8,15,79.00);
insert into Items values(22,'Ponds Powder 400g',3,6,25,106.00);
insert into Items values(23,'Reynolds pen-blue',1,10,30,15.00);
insert into Items values(24,'Reynolds pen-black',1,10,30,16.00);
insert into Items values(25,'Mysore sandal soap',4,7,25,25.00);
insert into Items values(26,'Fair&lovely cream 50g',3,5,15,55.00);
insert into Items values(27,'Rexono deo spray',2,5,20,100.00);
insert into Items values(28,'Dove soap',4,7,15,85.00);
---
iv.)Select * From Customer where city = 'Chennai';
v.) Select * from Customer where supplierid = 2;
vi)Select cId,Fname,Lname from Customer where DateFirstPurchased>='2005-01-01';
vii)Select * from Supplier where Scity = 'Coimbatore';
viii)Select * from Supplier where Sname like 'G%';
ix)Select * from Customer where Lname not like '%e%'; 
x)Select * from Customer where DateFirstPurchased BETWEEN '2006-01-01' AND '2006-12-31' ORDER BY DateFirstPurchased DESC;
xi)Select * FROM Orders where Quantity < 35;
xii)Select * from Items where SupplierId= 4;

  
  