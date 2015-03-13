-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.6.12-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for nsbm
CREATE DATABASE IF NOT EXISTS `nsbm` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `nsbm`;


-- Dumping structure for table nsbm.student
CREATE TABLE IF NOT EXISTS `student` (
  `name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table nsbm.student: ~16 rows (approximately)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`name`, `address`, `age`) VALUES
	('null', 'null', 'null'),
	('name', 'address', 'age'),
	('aaaaaaaaaa', 'address', '2313'),
	('aaaaaaaaaa', 'address', '2313'),
	('aaaaaaaaaa', 'address', '2313'),
	('xzc', 'xzcxc', 'xcxc'),
	('xzc', 'xzcxc', 'xcxc'),
	('dvd', 'v', 'v'),
	('123', '232', '321'),
	('', '', ''),
	('', '', ''),
	('', '', ''),
	('', '', ''),
	('', '', ''),
	('', '', ''),
	('', '', '');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
