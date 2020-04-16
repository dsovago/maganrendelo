insert into patient (firstname, lastname, email, tel, taj)
  values ('Bela', 'Kis', 'belakis@example.com', '06203334444', '111222333');

insert into patient (firstname, lastname, email, tel, taj)
  values ('Ernő', 'Nagy', 'ernobig@example.com', '06205657788', '444555666');

insert into patient (firstname, lastname, email, tel, taj)
  values ('Attila', 'Hun', 'hunatti@example.com', '06302129932', '777888999');


insert into doctor (firstname, lastname, email, tel, category)
  values ('Gabor','Barta','bartag@magan.hu','06402189155','háziorvos');

insert into doctor (firstname, lastname, email, tel, category)
  values ('Jolán','Kovács','kovacsj@magan.hu','06402189222','sebészet');

insert into doctor (firstname, lastname, email, tel, category)
  values ('Kálmán','Könyves','konyvesk@magan.hu','06402189777','kardiológia');


insert into surgery (name, address, email, tel, opening, info)
  values ('Szent Barnabás Kardiológiai Klinika','1345 Budapest, Rendelő u. 13.','szentbarnabas@magan.hu','06405566778',
          'H-P: 8-16','A főváros legjobb kardiológiai klinikája');

insert into surgery (name, address, email, tel, opening, info)
  values ('Metsző András Sebészeti Magánrendelő','1345 Budapest, Rendelő u. 15.','metszo@magan.hu','06407323783',
          'H,SZE: 8-17, K,CS: 8-15','Budapest szívében, azonnali ellátással');

insert into surgery (name, address, email, tel, opening, info)
  values ('Vak Elemér Szemészeti Magánklinika','1345 Budapest, Rendelő u. 22.','vakszemeszet@magan.hu','06408937389',
          'H-P: 9-14','Éles látás, boldog élet... A Vak Elemérben valóra válik.');

insert into appointment (patient_id, doctor_id, date)
  values (1,3,'2020-04-26 13:15:00');

insert into appointment (patient_id, doctor_id, date)
  values (2,1,'2020-04-20 09:45:00');


insert into users (email, pass, role)
  values ('admin@magan.hu','abc123','ADMIN');