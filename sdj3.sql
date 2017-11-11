drop table trayAnimal purge
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

Create table animal(
    AnimalID numeric not null,
    DateArrived Date,
    FarmId numeric not null,
    Weight number(4,1),
    PRIMARY KEY (AnimalID)
     );
     
create sequence sqAnimal
  start with 1
  increment by 1
  noMaxValue
  cache 100
  ;
  
Create table tray(
trayID numeric not null,
trayDate date,
TypeOfParts char(20),
TrayTotalWeight number(4,1),
MaxWeight number(4,1),
AnimalID numeric not null,
Primary key(trayID),
Foreign key(AnimalID)REFERENCES animal(animalID)
);

create sequence sqTray
  start with 1
  increment by 1
  noMaxValue
  cache 100
  ;

Create table productPackage(
productPackageID numeric not null,
productPackageDate date,
productPackageType char(15),
productPackageTrayID numeric,
primary key (productPackageID),
foreign key (productPackageTrayID)references tray(trayID)
);

create sequence sqProdPackage
  start with 1
  increment by 1
  noMaxValue
  cache 100
  ;

create table trayAnimal(
     animalID numeric references animal(animalID),
     trayID numeric references tray(trayID),
     constraint trayAnimalID Primary key (animalID,trayID)
     );
     
 create table trayProductPackage(
 trayID numeric references tray(trayID),
 productPackageID numeric references productPackage(productPackageID),
constraint trayPackage primary key (trayID,productPackageID)
 );    
 
 
 