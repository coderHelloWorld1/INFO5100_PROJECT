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
-- Table structure for table `RequestTable`
--

DROP TABLE IF EXISTS `RequestTable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `RequestTable` (
  `RequestType` varchar(50) DEFAULT NULL,
  `Requested_By_ID` int DEFAULT NULL,
  `Order_ID` int DEFAULT NULL,
  `RequestStatus` varchar(50) DEFAULT NULL,
  `NewAddress` varchar(100) DEFAULT NULL,
  `CommentsOfRequestUser` varchar(255) DEFAULT NULL,
  `requester_company` varchar(50) DEFAULT NULL,
  `date` date DEFAULT NULL,
  KEY `Requested_By_ID` (`Requested_By_ID`),
  KEY `Order_ID` (`Order_ID`),
  CONSTRAINT `RequestTable_ibfk_1` FOREIGN KEY (`Requested_By_ID`) REFERENCES `UserTable` (`ID`) ON DELETE CASCADE,
  CONSTRAINT `RequestTable_ibfk_2` FOREIGN KEY (`Order_ID`) REFERENCES `OrderTable` (`OrderID`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `RequestTable`
--

LOCK TABLES `RequestTable` WRITE;
/*!40000 ALTER TABLE `RequestTable` DISABLE KEYS */;
INSERT INTO `RequestTable` VALUES ('Change Address',1,101,'processing','123 Main St','Change of address due to moving','Company A','2023-01-01'),('Cancel Order',2,102,'cancellation',NULL,'I changed my mind, please cancel','Company B','2023-02-15'),('Refund Request',3,103,'pending',NULL,'Faulty product, need a refund','Company C','2023-03-20'),('Change Address',4,104,'completed','456 Oak St','Update my shipping address','Company A','2023-04-10'),('Cancel Order',5,105,'cancellation',NULL,'Emergency, need to cancel the order','Company B','2023-05-05'),('Return Request',6,106,'pending',NULL,'Received wrong item, want to return','Company C','2023-06-08'),('Change Address',7,107,'cancellation',NULL,'Moving to a new place, cancel the order','Company A','2023-07-12'),('Refund Request',9,109,'processing',NULL,'Product damaged on arrival, need refund','Company C','2023-09-25'),('Change Address',10,110,'completed','789 Pine St','Update shipping address for the order','Company A','2023-10-30');
/*!40000 ALTER TABLE `RequestTable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-06  6:25:51
