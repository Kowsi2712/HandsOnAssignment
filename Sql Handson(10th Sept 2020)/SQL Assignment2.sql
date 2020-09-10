create table WorldCity
(
  City varchar(30),
  Country varchar(30),
  Continent varchar(30),
  Latitude float,
  NorthSouth char(5),
  Longitude float,
  EastWest char(5)
  );

  insert into WorldCity values('Athens','Greece','Europe',37.59,'N',23.44,'E');
  insert into WorldCity values('Atlanta','United States','North America',33.45,'N',84.23,'W');
  insert into WorldCity values('Dallas','United States','North America',32.47,'N',96.47,'W');
  insert into WorldCity values('Nashville','United States','North America',36.09,'N',86.46,'W');
  insert into WorldCity values('Victoria','Canada','North America',48.25,'N',123.21,'W');
  insert into WorldCity values('Peterborough','Canada','North America',44.18,'N',79.18,'W');
  insert into WorldCity values('Vancouver','Canada','North America',49.18,'N',123.04,'W');
  insert into WorldCity values('Toledo','United States','North America',41.39,'N',83.82,'W');
  insert into WorldCity values('Warsaw','Poland','Europe',52.15,'N',21.00,'E');
  insert into WorldCity values('Lima','Peru','South America',12.03,'S',77.03,'W');
  insert into WorldCity values('Rio De Janeiro','Brazil','South America',22.43,'S',43.13,'W');
  insert into WorldCity values('Santiago','Chile','South America',33.27,'S',70.40,'W');
  insert into WorldCity values('Bogota','Colombia','South America',04.36,'N',74.05,'W');
  insert into WorldCity values('Buenos Aires','Argentina','South America',34.36,'S',58.28,'W');
  insert into WorldCity values('Quito','Ecuador','South America',00.13,'S',78.30,'W');
  insert into WorldCity values('Caracas','Venezuela','South America',10.30,'N',66.56,'W');
  insert into WorldCity values('Madras','India','Asia',28.36,'N',77.12,'E');
  insert into WorldCity values('Bombay','India','Asia',18.58,'N',72.50,'E');
  insert into WorldCity(City,Country,Continent,Latitude,NorthSouth,Longitude) values('Manchestor','England','Europe',51.30,'N',0.0);
  insert into WorldCity values('Moscow','Russia','Europe',55.45,'N',37.35,'E');
  insert into WorldCity values('Paris','France','Europe',48.52,'N',2.20,'E');
  insert into WorldCity values('Shenyang','China','Asia',41.48,'N',123.27,'E');
  insert into WorldCity values('Cairo','Egypt','Africa',30.03,'N',31.15,'E');
  insert into WorldCity values('Tripoli','Lybia','Africa',32.54,'N',13.11,'E');
  insert into WorldCity values('Beijing','China','Asia',39.56,'N',116.24,'E');
  insert into WorldCity values('Rome','Italy','Europe',41.54,'N',12.29,'E');
  insert into WorldCity values('Tokyo','Japan','Asia',35.42,'N',139.46,'E');
  insert into WorldCity values('Sydney','Australia','Australia',33.52,'S',151.13,'E');
  insert into WorldCity values('Sparta','Greece','Europe',37.05,'N',22.27,'E');
  insert into WorldCity values('Madrid','Spain','Europe',40.24,'N',3.41,'W');
  select * from WorldCity;


i)   SELECT distinct(Country),Continent FROM WorldCity;
ii)  SELECT City,Country FROM WorldCity where City Like 'R%';
iii) SELECT City,Country from WorldCity where City Like '%A';
iv) SELECT City,Country from WorldCity where City Like 'M___%';
v)  SELECT City,Country from WorldCity where City Like '_A%';

-------

(Customer,Supplier,Orders,Items)

i)SELECT MAX(Price) FROM Items;
ii)SELECT MIN(Price) FROM Orders ord,Items ite where ord.Itemid=ite.Itemid;
iii)SELECT count(distinct(city))FROM customer GROUP BY city;



  
  



     
























