

DROP TABLE IF EXISTS recipe;
CREATE TABLE `recipe` (`id` bigint NOT NULL AUTO_INCREMENT,`name` varchar(255) DEFAULT NULL,`quantity` bigint(20) DEFAULT NULL,`flavor` varchar(255) DEFAULT NULL, PRIMARY KEY (`id`))ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `recipe` (`id`, `name`, `quantity`, `flavor`) VALUES (1, 'Suprême vanille', 23, 'vanille'),(2, 'Full chocolate', 14, 'chocolate'),(3, 'Sweet Strawberry', 3, 'fraise'),(4, 'Oreo Forever', 14, 'oreo');

--
DROP TABLE IF EXISTS seller;

CREATE TABLE `seller` (`id` bigint NOT NULL AUTO_INCREMENT,`name` varchar(255) DEFAULT NULL,`age` INTEGER DEFAULT NULL, PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `seller` (`id`, `name`, `age`) VALUES (1, 'Elodie', 36),(2, 'David', 27);
