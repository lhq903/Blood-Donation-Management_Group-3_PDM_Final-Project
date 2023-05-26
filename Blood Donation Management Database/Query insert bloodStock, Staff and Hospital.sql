Delete from BloodBank;
go
INSERT INTO BloodStock VALUES 
('BS1002', 'O-', '1000', '2022-05-14'

INSERT INTO BloodBank VALUES 

('B0001', 'Bangalore Rotary TTK Blood Bank Medical Service', '77 Corbett Rd, Underhill, VT 05489, United States', '9am to 8pm'),
('B0002', 'KIMS Blood Bank', '2434 W Back Mountain Rd, Belleville, PA 17004,  United States', '24/7');
('B0003', 'HKES Blood Bank Organisation', '12m Chancery Hill Rd, Singapore',  '24/7'),
('B0004', 'Bangalore Rotary TTK Blood Bank Medical Service', '77 Corbett Rd, Underhill, VT 05489, United States', '9am to 8pm'),
('B0005', 'KIMS Blood Bank', '2434 W Back Mountain Rd, Belleville, PA 17004,  United States', '24/7'),
('B0006', 'J.S.S. Blood Bank', '10506 Standing Stone Rd, Huntingdon, PA 16652,  United States', '24/7'),
('B0007', 'Indian Medical Association Blood Bank', '3046 Piney Creek Rd, Williamsburg, PA 16693,  United States', '24/7'),
('B0008', 'Bangalore Baptist Blood Bank', '90 Collar Ct, Hartsel, CO 80449,  United States', '24/7'),
('B0009', 'Sanjaya Gandhi Accident Hospital', '38122 US-24, Lake George, CO 80827,  United States', '24/7'),
('B0010', 'The Superintendent, Victoria Hospital Blood Bank', '4500 S Lancaster Rd, Dallas, TX 75216,  United States', '24/7'),
('B0011', 'K.R.Hospital Blood Bank', '1801 Flying Fortress, Frederick, OK 73542,  United States', '9am to 8pm'),
('B0012', 'K.L.E.Society Hospital and Medical Research Centre', '14 Tuas Ave 1, Singapore ', '9am to 8pm'),
('B0013', 'Fr.Mullers Charitable Institutions', '127-149 Pasir Ris Grove, Singapore', '24/7'),
('B0014', 'M.S. Ramaiah Medical Teaching Hospital', '11 Neo Tiew Lane 2, Singapore', '24/7'),
('B0015', 'St. Marthas Hospital', '50 Jurong West Street 93, Singapore', '24/7'),
('B0016', 'Seogyung Meditec Co., Ltd', '173-25 Samrak-ri, Cheongcheon-myeon, Goesan-gun, Chungcheongbuk-do, South Korea', 'Monday to Sunday'),
('B0017', 'R.L. Jalappa Medical College Hospital', 'H74H+J5 Yeongi, Chungcheong Nam, South Korea', '24/7'),
('B0018', 'Kidwai Memorial Institute of Oncology Blood Bank', '839C+75 Gongju, Chungcheong Nam, South Korea', '24/7'),
('B0019', 'Transfusion Medicine Blood Center', '62-4 Waryong-ri, Yongji-myeon, Gimje, Jeollabuk-do, South Korea', '24/7'),
('B0020', 'Zh.Chenle Medical College Hospital', '49 Apgujeong-ro 79-gil, Cheongdam-dong, Gangnam-gu, Seoul, South Korea', '24/7');

SELECT * FROM BloodBank;

INSERT INTO Staff VALUES 
('S0001', 'B0001', 'Emily Darwin', 'Jurong East Street 21, Singapore 601287', 'EmilyDarwin@kwsh.org.sg', '0987964334', 'Diploma in Practical Nursing', 'Cardiology department'),
('S0002', 'B0002', 'Alice Smith', '39 Mount Sinai Rise #14-06, Singapore 276957', 'AliceSmith@kwsh.org.sg', '2225976642', 'Dental Assisting', 'INPATIENT WARDS'),
('S0003', 'B0001', 'Balthazar Jones', '8 Leedon Park, Singapore 267885', 'BalthazarJones@kwsh.org.sg', '5364316564', 'Physical Therapist Assistant', 'FINANCE DEPARTMENT'),
('S0004', 'B0002', 'Sara Bartholomew ', '6 L Park,Fontana, Singapore 267885', 'SaraBartholomew@kwsh.org.sg', '2114914544', 'Radiology Technology', 'ADMINISTRATION DEPARTMENT'),
('S0005', 'B0001', 'Christopher Sean Bean', 'Jurong Ave 1 Singapore 267885', 'ChristopherSeanBean@kwsh.org.sg', '1425006556', 'Health Information Management', 'PATHOLOGY DEPARTMENT'),
('S0006', 'B0002', 'Frank Allenson', 'Block 2878 #15-344, Singapore 601287', 'FrankAllenson@kwsh.org.sg', '5432646743', 'Diploma in Practical Nursing', 'ICU'),
('S0007', 'B0001', 'Daniel Beevers', 'Mayfair Street 21, Singapore 601675', 'DanielBeevers@kwsh.org.sg', '2546596675', 'Associate in Surgical Technology', 'PATHOLOGY DEPARTMENT'),
('S0008', 'B0002', 'James Chichester', '706 Clementi West Street 2, Block 706, Singapore 120706', 'JamesChichester@kwsh.org.sg', '6846979843', 'Health Information Management', 'ICU'),
('S0009', 'B0001', 'Mary Schooling', '196 West Coast Rd, Singapore 127375', 'MarySchooling@kwsh.org.sg', '5387493525', 'Physical Therapist Assistant', 'INPATIENT WARDS'),
('S0010', 'B0002', 'Johnny Suh', '11 Angsil-ro, Andong, Gyeongsangbuk-do, Korea', 'johnnysuh@sme.entown', '4573759112', 'Medical Assisting', 'Intensive care unit (ICU)'),
('S0011', 'B0001', 'Thea Sanchez', '266-1 Gogok-ri, Imha-myeon, Andong, Gyeongsangbuk-do, Korea', 'sanchezthea@email.com', '4598714673', 'Health Information Management', 'Laboratory Department'),
('S0012', 'B0002', 'Sherilyn Rogers', '126F Rifle Range Rd, Singapore', 'sherilynjr@blood.don.org', '4534527763', 'Occupational Therapy Assistant ', 'Pathology Department'),
('S0013', 'B0001', 'Tarini Bennet', '7 Binjai Park, Singapore', 'tarinibennet@hyp.corp', '4533367551', 'Medical Coding', 'Medical records'),
('S0014', 'B0002', 'Penelope Ruiz', '200 Turf Club Rd, #01 - 19, Singapore', 'ruiz.penelope@city.org', '4511334412', 'Health Information Management', 'Intensive care unit (ICU)'),
('S0015', 'B0001', 'Yvonne Foster', '190 Dunearn Rd, Singapore', 'yvonnefoster@pride.jane.ord', '4556657687', 'Physical Therapist Assistant', 'Outpatient departments'),
('S0016', 'B0002', 'Mark Lee', '1 Geylang Bahru Ln, Singapore', 'marklee@sme.entown', '4587811453', 'Diploma in Practical Nursing', 'Outpatient departments'),
('S0017', 'B0001', 'Leia Kim', 'No. #01-15/21, Primax, 22 New Industrial Rd, Singapore', 'leia.kim@singablood.ord', '7711123496', 'Associate of Science in Nursing', 'Medical records'),
('S0018', 'B0002', 'Lee Donghyuck', '585 Bedok Reservoir Rd, Singapore', 'donghyucklee@sme.entown', '7723388546', 'Occupational Therapy Assistant', 'Inpatient Wards'),
('S0019', 'B0001', 'Enzo Martin', '603 Iron St, Victoria, KS 67671, United States', 'enzomartin@man.org', '7733657732', 'Associate of Science in Nursing', 'Nursing administration'),
('S0020', 'B0002', 'Chwe Hansol', 'Jalan Laman Indah 16, 81110 Johor Bahru, Johor, Malaysia', 'hansolchwe@vernon.org', '7778564490', 'Health Information Management', 'Outpatient departments');

SELECT * FROM Staff;

INSERT INTO Hospital VALUES
('H0001','Adam Road Hospital','559 Bukit Timah Road 01-02, King Arcade,Singapore 269695.','nm@arh.com.sg','6466-7777','Dr. Davis','AdamRoad'),
('H0002','Woodbridge Hospital','10 Buangkok View Buangkok Green Medical Park Singapore 539747','enquiry@imh.com.sg','6389-2000','Richard Chamberlain','Woodbridge'),
('H0003','National University Hospital','11 Jalan Tan Tock Seng Singapore 308433','info@imc.jhmi.edu','6880-2222',' Victoria Halley','NationalUniversity'),
('H0004','Mount Elizabeth Hospital','3 Mount Elizabeth Singapore 228510','ppac@parkway.sg','6737-2666','CJ Billings','MountElizabeth'),
('H0005','National Cancer Centre Singapore Hospital','11 Hospital Drive Singapore 169610','cancerhelpline@nccs.com.sg','6436-8000','Robert Powers','NationalCancerCentreSingapore'),
('H0006','Singapore General Hospital ','5 Second Hospital Avenue Singapore 168938','appointment@ndc.com.sg','6324-8802','Emily Jackson',' SingaporeGeneral'),
('H0007','National Heart Centre Singapore Hospital','National Heart Centre 5 Hospital Drive Singapore 169609','nhcs@nhcs.com.sg','6704-8000','Nora Ingalls','NationalHeartCentreSingapore '),
('H0008','National Neuroscience Institute Hospital ','11 Jalan Tan Tock Seng Singapore 308433','nni_hr@nni.com.sg','6357-7153','Caroline Castle','NationalNeuroscienceInstitute '),
('H0009','National Skin Centre Hospital','1 Mandalay Road Singapore 308205','nscqa@nsc.gov.sg',' 6253-4455','Charles Pringle','NationalSkinCentre'),
('H0010','Singapore National Eye Centre Hospital ','11 Third Hospital Avenue Singapore 168751','appointments@snec.com.sg','6227-7255','Emma Ford','SingaporeNationalEyeCentre '),
('H0011','Thomson Medical Centre Hospital ','339 Thomson Rd Singapore 307677','ipc@thomsonmedical.com','6250-2222','Eric Arthur','ThomsonMedicalCentre'),
('H0012','Ang Mo Kio - Thye Hua Kwan Hospital','17 Ang Mo Kio Avenue 9 Singapore 569766','enquiry@amkh.org.sg','6453-8033','John Wayne','AngMoKioThyeHuaKwan'),
('H0013','Bright Vision Hospital','5 Lorong Napiri Singapore 547530','enquiries@bvh.org.sg','6248-5755','Elakshi Anne','BrightVision'),
('H0014','Ng Teng Fong General Hospital','1 Jurong East Street 21 Singapore 609606','enquiries@juronghealth.com.sg','6716-2000',' Virtuous Helen','NgTengFongGeneral'),
('H0015','Kwong Wai Shiu Hospital','705 Serangoon Rd Singapore 328127','enquiries@kwsh.org.sg','6299-3747','James Norah','KwongWaiShiu'),
('H0016','Ren Ci Long Term Care Hospital','Block 9, Level 110 Buangkok View Singapore 539747','renci@renci.org.sg','6385-0288','Ophelia Sarah','RenCiLongTermCare'),
('H0017','Ren Ci Community Hospital','71 Irrawaddy Road Singapore 329562',' renci@renci.org.sg','6385-0288','Celine Susan','RenCiCommunity'),
('H0018','Andrews Community Hospital ','1 Anchorvale Street Singapore 544835','andrewcom@adr.comunity.org','7544-2311','Daisy Mary','AndrewsCommunity'),
('H0019','Khoo Teck Puat Hospital','90 Yishun Central Singapore 768828','nquiry@alexandrahealth.com.sg','6555-8000','Darlene Elizabeth','KhooTeckPuat'),
('H0020','KK Womens And Childrens Hospital','100 Bukit Timah Road Singapore 229899','info@kkh.com.sg','2255-555','Karishma ','KKWomensAndChildrens ');

SELECT * FROM Hospital;
