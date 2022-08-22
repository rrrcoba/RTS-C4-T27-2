use heroku_c32affd8800ea8e;

DROP TABLE IF EXISTS `scientists`;
DROP TABLE IF EXISTS `projects`;
DROP TABLE IF EXISTS `assigned`;

CREATE TABLE `scientists` (
  `id` int NOT NULL auto_increment,
  `DNI` nvarchar(9) NOT NULL,
  `name_surname` nvarchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `projects` (
  `id` int NOT NULL auto_increment,
  `name` nvarchar(255) NOT NULL,
  `hours` int NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `assigned` (
  `id` int NOT NULL auto_increment,
  `id_scientist` int NOT NULL,
  `id_project` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `supplies_ibfk_1` FOREIGN KEY (`id_project`) REFERENCES `projects` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supplies_ibfk_2` FOREIGN KEY (`id_scientist`) REFERENCES `scientists` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

INSERT INTO `scientists` (`DNI`,`name_surname`) VALUES ('11111111A', 'Pepito magico'),('22222222B','Pepito normal'),('33333333C','Pepito medio');
INSERT INTO `projects` (`name`, `hours`) VALUES ('Alpha',10),('Beta',20),('Omega','30');
INSERT INTO `assigned` (`id_scientist`, `id_project`) VALUES ('1','1'),('11','11'),('21','21');

commit;