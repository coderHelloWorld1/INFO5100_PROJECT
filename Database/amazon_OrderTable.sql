-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: amazon
-- ------------------------------------------------------
-- Server version	8.1.0

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
-- Table structure for table `OrderTable`
--

DROP TABLE IF EXISTS `OrderTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `OrderTable` (
  `OrderID` int NOT NULL,
  `CreatorID` int DEFAULT NULL,
  `ProductName` varchar(50) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `PlacedDate` date DEFAULT NULL,
  `AgentID` int DEFAULT NULL,
  `OrderStatus` varchar(50) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`OrderID`),
  KEY `CreatorID` (`CreatorID`),
  KEY `AgentID` (`AgentID`),
  CONSTRAINT `OrderTable_ibfk_1` FOREIGN KEY (`CreatorID`) REFERENCES `UserTable` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `OrderTable_ibfk_2` FOREIGN KEY (`AgentID`) REFERENCES `UserTable` (`ID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `OrderTable`
--

LOCK TABLES `OrderTable` WRITE;
/*!40000 ALTER TABLE `OrderTable` DISABLE KEYS */;
INSERT INTO `OrderTable` VALUES (101,1,'Product A','123 Main St','2023-01-01',1,'ongoing','Standard shipping'),(102,2,'Product B','456 Oak St','2023-02-15',NULL,'canceled','Express delivery'),(103,3,'Product C','789 Pine St','2023-03-20',2,'ongoing','Gift wrapping requested'),(104,4,'Product D','987 Elm St','2023-04-10',2,'Processing','Include gift receipt'),(105,5,'Product E','654 Birch St','2023-05-05',2,'Cancelled','Customer changed mind'),(106,6,'Product F','321 Cedar St','2023-06-08',1,'Shipped','Track package online'),(107,7,'Product G','111 Maple St','2023-07-12',2,'Delivered','Customer satisfaction survey sent'),(108,8,'Product H','222 Pine St','2023-08-18',3,'Cancelled','Out of stock'),(109,9,'Product I','333 Oak St','2023-09-25',1,'Processing','Contact customer for additional details'),(110,10,'Product J','444 Cedar St','2023-10-30',2,'Shipped','Include promotional flyer'),(111,10,'Product J','444 Cedar St','2023-10-30',2,'completed','Include promotional flyer'),(112,10,'Product J','444 Cedar St','2023-10-30',2,'completed','Include promotional flyer'),(114,1,'Product A','123 Main St','2023-01-01',NULL,'pending_assignment','Standard shipping'),(115,2,'Product B','456 Oak St','2023-02-15',NULL,'pending_assignment','Express delivery'),(116,3,'Product C','789 Pine St','2023-03-20',NULL,'pending_assignment','Gift wrapping requested');
/*!40000 ALTER TABLE `OrderTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-06  6:25:50
