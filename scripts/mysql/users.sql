drop table if exists Users;

CREATE TABLE `Users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userName` varchar(200) NOT NULL,
   password varchar(200) NOT NULL,
   dateCreated timestamp,
   dateUpdated timestamp,
   PRIMARY KEY (`id`)
);