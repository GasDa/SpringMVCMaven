# SpringMVCMaven
CREATE TABLE `person` (  
  `id` int(8) NOT NULL AUTO_INCREMENT,  
  `name` varchar(25) NOT NULL,  
  `age` int NOT NULL,
  `isAdmin` bit,  
  createDate timestamp,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

INSERT INTO `person`
(`name`, `age`, `isAdmin`) VALUES
('Alex', 12, 0),
('Pasha', 33, 0),
('Dasha', 100, 1);
