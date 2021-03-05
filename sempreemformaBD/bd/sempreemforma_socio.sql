-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: sempreemforma
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `socio`
--

DROP TABLE IF EXISTS `socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socio` (
  `NroSocio` decimal(5,0) NOT NULL,
  `Nome` varchar(60) DEFAULT NULL,
  `Telefone` char(11) DEFAULT NULL,
  `Endereco` varchar(70) DEFAULT NULL,
  `Profissao` varchar(50) DEFAULT NULL,
  `DocBancarios` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`NroSocio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socio`
--

LOCK TABLES `socio` WRITE;
/*!40000 ALTER TABLE `socio` DISABLE KEYS */;
INSERT INTO `socio` VALUES (1,'Carlos','561638','fsfsf','vzdxz','pomol'),(2,'Geraldo','186868','fdsv','vszdxc','çoliu'),(3,'Sara','168894','bdrsg','vdzxv','qwerfgh '),(4,'Maria','626216','vdfb c','gbtfdnufm','dfvbhjnm'),(5,'Laura','268261','varsdv','qwdca','mjhygbn'),(6,'Gilberto','165136','gvsrdfx','vdbzd','edfvghn'),(7,'Viraldo','654186','fsdxb xd','ljoihmh','poiujmnbvf'),(8,'Natalia','811331','gdrfx','hyfc','yhgbvcfg'),(9,'Ana','135138','mfgmhj','grdzr','sxcvb'),(10,'Matilda','653432','fghscvds','laskdjfh','tyrueio'),(11,'Paula','124234','fasfasca','asdvs','vdzvzdzv'),(12,'Jurema','739154','esaefdae','vdzvzdv','vdszvvdxv'),(13,'13','13','13','13','13');
/*!40000 ALTER TABLE `socio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-15 23:19:27
