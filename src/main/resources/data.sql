insert into patient (firstname, lastname, email, tel, taj, password, role)
  values ('Bela', 'Kis', 'belakis@example.com', '06203334444', '111222333', 'bela123', 'PATIENT');

insert into patient (firstname, lastname, email, tel, taj, password, role)
  values ('Ernő', 'Nagy', 'ernobig@example.com', '06205657788', '444555666', 'erno123', 'PATIENT');

insert into patient (firstname, lastname, email, tel, taj, password, role)
  values ('Attila', 'Hun', 'hunatti@example.com', '06302129932', '777888999', 'ati123', 'PATIENT');


insert into surgery (name, address, email, tel, opening, info, map)
  values ('Szent Barnabás Kardiológiai Klinika','1345 Budapest, Rendelő u. 13.','szentbarnabas@magan.hu','06405566778',
          'H-P: 8-16','A főváros legjobb kardiológiai klinikája','https://tinyurl.com/yacynn3l');

insert into surgery (name, address, email, tel, opening, info, map)
  values ('Metsző András Sebészeti Magánrendelő','1345 Budapest, Rendelő u. 15.','metszo@magan.hu','06407323783',
          'H,SZE: 8-17, K,CS: 8-15','Budapest szívében, azonnali ellátással','https://tinyurl.com/yacynn3l');

insert into surgery (name, address, email, tel, opening, info, map)
  values ('Vak Elemér Szemészeti Magánklinika','1345 Budapest, Rendelő u. 22.','vakszemeszet@magan.hu','06408937389',
          'H-P: 9-14','Éles látás, boldog élet... A Vak Elemérben valóra válik.','https://tinyurl.com/yacynn3l');



insert into doctor (firstname, lastname, email, tel, category, surgery_id, password, role)
  values ('Gabor','Barta','bartag@magan.hu','06402189155','sebészet',2,'barta123','DOCTOR');

insert into doctor (firstname, lastname, email, tel, category, surgery_id, password, role)
  values ('Jolán','Kovács','kovacsj@magan.hu','06402189222','sebészet',2,'kovacs123','DOCTOR');

insert into doctor (firstname, lastname, email, tel, category, surgery_id, password, role)
  values ('Kálmán','Könyves','konyvesk@magan.hu','06402189777','kardiológia',1,'konyves123','DOCTOR');

insert into doctor (firstname, lastname, email, tel, category, surgery_id, password, role)
  values ('Károly','Róbert','robertk@magan.hu','06402189999','szemészet',3,'robert123','DOCTOR');

insert into doctor (firstname, lastname, email, tel, category, surgery_id, password, role)
  values ('Marcsi','Sasszem','sasmarcsi@magan.hu','06402189321','szemészet',3,'sas123','DOCTOR');




insert into appointment (patient_id, doctor_id, date)
  values (1,3,'2020-04-26 13:15:00');

insert into appointment (patient_id, doctor_id, date)
  values (2,1,'2020-04-20 09:45:00');