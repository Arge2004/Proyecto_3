-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         11.3.0-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.3.0.6589
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para facturacion_veterinaria
CREATE DATABASE IF NOT EXISTS `facturacion_veterinaria` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci */;
USE `facturacion_veterinaria`;

-- Volcando estructura para tabla facturacion_veterinaria.clients_legal
CREATE TABLE IF NOT EXISTS `clients_legal` (
  `id` varchar(50) NOT NULL,
  `socialReason` varchar(50) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `emailAddress` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `ID` (`id`) USING BTREE,
  UNIQUE KEY `emailAddress` (`emailAddress`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci ROW_FORMAT=DYNAMIC;

-- Volcando datos para la tabla facturacion_veterinaria.clients_legal: ~5 rows (aproximadamente)
INSERT INTO `clients_legal` (`id`, `socialReason`, `phoneNumber`, `emailAddress`, `address`) VALUES
	('12214124', 'Gamers Colombia', '126541211', 'gamerscolombia@gmail.com', 'Antioquia Poblado Medellin 124141'),
	('12345678', 'Presidencia de Colombia', '726174652', 'presco@gov.co', 'Antioquia Medellin Medellin 12345'),
	('1321312', 'Dian', '121415122', 'dian@gov.co', 'Antioquia Medellin Medellin 21122'),
	('4124124', 'Universidad de Antioquia', '1241421', 'udea@udea.edu.co', 'Antioquia Medellin Medellin 213412'),
	('412421', 'ExpoIngenieria', '123131252', 'expoingenieria@minedu.co', 'Antioquia Medellin Medellin 214124');

-- Volcando estructura para tabla facturacion_veterinaria.clients_natural
CREATE TABLE IF NOT EXISTS `clients_natural` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `lastName` varchar(50) NOT NULL,
  `phoneNumber` varchar(50) NOT NULL,
  `emailAddress` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ID` (`id`),
  UNIQUE KEY `emailAddress` (`emailAddress`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla facturacion_veterinaria.clients_natural: ~6 rows (aproximadamente)
INSERT INTO `clients_natural` (`id`, `name`, `lastName`, `phoneNumber`, `emailAddress`, `address`) VALUES
	('1234567', 'Argenis', 'Medina', '987654321', 'argenis.medina@udea.edu.co', 'Antioquia Rio Negro Rio Negro 00001'),
	('123456789', 'Santiago', 'Trespalacios', '305364436', 'santiago.tbolivar@udea.edu.co', 'Antioquia itagui Medellin 09402'),
	('124142151', 'Karen', 'Mejia', '1232131', 'karme@outlook.com', 'Antioquia Envigado Medellin 123'),
	('12431652', 'Mateo', 'Lotero', '123416125', 'mateo.lotero@udea.edu.co', 'Antioquia Bello Medellin 124141'),
	('13212452', 'Hernesto', 'Perez', '24152532', 'hernestperez@gmail.com', 'Antioquia Envigado Medellin 21412'),
	('14176215', 'Samuel', 'de Luque', '12131314', 'samuelitox2@gmail.com', 'Antioquia La Estrella Medellin 12141');

-- Volcando estructura para tabla facturacion_veterinaria.details
CREATE TABLE IF NOT EXISTS `details` (
  `num_detail` int(11) NOT NULL AUTO_INCREMENT,
  `id_receipt` int(11) NOT NULL,
  `id_product` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `price` varchar(50) NOT NULL,
  PRIMARY KEY (`num_detail`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla facturacion_veterinaria.details: ~13 rows (aproximadamente)
INSERT INTO `details` (`num_detail`, `id_receipt`, `id_product`, `quantity`, `price`) VALUES
	(116, 26, '20', '1', '100000'),
	(117, 27, '20', '1', '100000'),
	(118, 27, '3', '1', '50000'),
	(119, 27, '4', '1', '150000'),
	(120, 28, '20', '1', '100000'),
	(121, 28, '3', '1', '50000'),
	(122, 29, '20', '1', '100000'),
	(123, 29, '3', '1', '50000'),
	(124, 29, '28', '1', '85000'),
	(125, 29, '31', '1', '70000'),
	(126, 30, '20', '1', '100000'),
	(127, 31, '26', '1', '80000'),
	(128, 31, '4', '1', '150000');

-- Volcando estructura para tabla facturacion_veterinaria.products
CREATE TABLE IF NOT EXISTS `products` (
  `id` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` int(11) NOT NULL DEFAULT 0,
  `type_product` varchar(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla facturacion_veterinaria.products: ~25 rows (aproximadamente)
INSERT INTO `products` (`id`, `name`, `price`, `type_product`) VALUES
	('10', 'Limpieza de Oídos', 20000, 'Peluquería'),
	('11', 'Tratamiento de Piel y Pelaje', 80000, 'Peluquería'),
	('20', 'Consulta General', 100000, 'Consulta'),
	('21', 'Consulta de Cardiología', 250000, 'Consulta'),
	('22', 'Consulta de Oftalmología', 250000, 'Consulta'),
	('23', 'Consulta de Odontología', 250000, 'Consulta'),
	('24', 'Consulta de Dermatología', 250000, 'Consulta'),
	('25', 'Consulta de Traumatología', 250000, 'Consulta'),
	('26', 'Hematología', 80000, 'Exámenes Clínicos'),
	('27', 'Bioquímica', 90000, 'Exámenes Clínicos'),
	('28', 'Estudios de Coagulación', 85000, 'Exámenes Clínicos'),
	('29', 'Estudios de Orina', 75000, 'Exámenes Clínicos'),
	('3', 'Rayos X', 50000, 'Imagenología'),
	('30', 'Microbiología', 90000, 'Exámenes Clínicos'),
	('31', 'Coproparasitología', 70000, 'Exámenes Clínicos'),
	('32', 'Hormonas', 95000, 'Exámenes Clínicos'),
	('33', 'Serologías', 85000, 'Exámenes Clínicos'),
	('34', 'Detección de Medicamentos', 100000, 'Exámenes Clínicos'),
	('35', 'Alergología', 90000, 'Exámenes Clínicos'),
	('36', 'Genéticas', 110000, 'Exámenes Clínicos'),
	('37', 'Antibiogramas', 95000, 'Exámenes Clínicos'),
	('4', 'Ultrasonido', 150000, 'Imagenología'),
	('7', 'Baño y Secado', 40000, 'Peluquería'),
	('8', 'Corte de Pelo', 60000, 'Peluquería'),
	('9', 'Recorte de Uñas', 25000, 'Peluquería');

-- Volcando estructura para tabla facturacion_veterinaria.receipts
CREATE TABLE IF NOT EXISTS `receipts` (
  `id_receipt` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `id_client` varchar(50) NOT NULL,
  `date` date NOT NULL DEFAULT curdate(),
  PRIMARY KEY (`id_receipt`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

-- Volcando datos para la tabla facturacion_veterinaria.receipts: ~6 rows (aproximadamente)
INSERT INTO `receipts` (`id_receipt`, `id_client`, `date`) VALUES
	(26, '4124124', '2023-11-11'),
	(27, '123456789', '2023-11-11'),
	(28, '4124124', '2023-11-11'),
	(29, '412421', '2023-11-11'),
	(30, '124142151', '2023-11-11'),
	(31, '13212452', '2023-11-11');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
