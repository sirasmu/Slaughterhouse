/*drop table trayAnimal purge
;
drop table trayProductPackage purge
;

drop table productPackage purge
;
drop table tray purge
;
drop table animal purge
;


drop sequence sqProdPackage
;
drop sequence sqAnimal
;
drop sequence sqTray
;
*/
Create table animal(
    AnimalID varchar(50),
    DateArrived Date,
    FarmId varchar(50),
    Weight number(5,2),
    PRIMARY KEY (AnimalID)
     );
     
  
Create table tray(
trayID varchar(50),
TypeOfParts char(20),
Primary key(trayID)
);


Create table productPackage(
productPackageID varchar(50),
productPackageDate date,
productPackageType char(15),
primary key (productPackageID)
);

create table trayAnimal(
     animalID varchar(50) references animal(animalID),
     trayID varchar(50) references tray(trayID),
     constraint trayAnimalID Primary key (animalID,trayID)
     );
     
 create table trayProductPackage(
 trayID varchar(50) references tray(trayID),
 productPackageID varchar(50) references productPackage(productPackageID),
constraint trayPackage primary key (trayID,productPackageID)
 );    
 
 /*
 insert into animal
 values (123,DATE '2015-12-17',987,101.5);
 
  insert into animal
 values (124,DATE '2015-12-17',987,102.5);
 
 insert into TRAY 
 values( 1,'ham');
 insert into TRAY
 values( 2,'leg');
 insert into TRAY
 values( 3,'leg');
 insert into TRAY
 values( 4,'leg');
 
 insert into PRODUCTPACKAGE
 values(12345,DATE '2015-12-17','leg');
 
 insert into PRODUCTPACKAGE
 values(12346,DATE '2015-12-17','leg');
 
 insert into PRODUCTPACKAGE
 values(12347,DATE '2015-12-17','ham');
 
 
 insert into PRODUCTPACKAGE
 values(12348,DATE '2015-12-17','ham');
 
 insert into TRAYANIMAL
 values( 123,1);
 insert into TRAYANIMAL
 values( 124,1);
 insert into TRAYANIMAL
 values( 123,2);
 insert into TRAYANIMAL
 values( 124,2);
 
 
 insert into TRAYPRODUCTPACKAGE
 values(2,12345);
 insert into TRAYPRODUCTPACKAGE
 values(2,12348);
 insert into TRAYPRODUCTPACKAGE
 values(2,12346);
  insert into TRAYPRODUCTPACKAGE
 values(1,12347);*/
 
 
 /*select productPackageTrayID from ProductPackage where
 PRODUCTPACKAGEID=12346;*/
 
 /*select animalId from tray
 where trayId=2;*/
 
 /*select trayid from TRAYANIMAL
 where animalId='124';
  
  select productpackageId from TRAYPRODUCTPACKAGE
  where TRAYID='2';*/
  
/*select p.productpackageID,t.TRAYID,a.AnimalID
from PRODUCTPACKAGE p
inner join TRAY t
on p.PRODUCTPACKAGEID=t.TRAYID
inner join ANIMAL a
on t.trayID= a.animalId
and p.PRODUCTPACKAGEID=t.TRAYID
where p.productpackageID=12346;*/


/*track-back badpackage by packageID
select tp.productpackageID,tp.TRAYID,ta.AnimalID
from  TRAYANIMAL ta
inner join TRAYPRODUCTPACKAGE tp
on ta.TRAYID=tp.TRAYID
where tp.PRODUCTPACKAGEID=12345
order by tp.PRODUCTPACKAGEID;

/*track-back badpackage by animalID*//*
select ta.AnimalID,tp.TRAYID,tp.productpackageID
from  TRAYANIMAL ta
inner join TRAYPRODUCTPACKAGE tp
on ta.TRAYID=tp.TRAYID
where ta.ANIMALID=123
order by tp.PRODUCTPACKAGEID;*/
 