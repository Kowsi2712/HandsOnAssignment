

i)select Fname,city,country from customer where city='Chennai' OR (city='Salem' OR city='Madurai');
ii)select custId,Fname,Lname,DateFirstPurchased,Itemname,Price from Items,customer c inner join Orders o ON c.custId = o.CId where Items.ItemId = o.ItemId;
iii)select * from Orders where OrderId =(select ItemId from Items where Itemname='Dove soap');


Select Itemname,Price*Minqty,Price*Maxqty from Orders,Items where Orders.ItemId = Items.ItemId and Maxqty > 190;



