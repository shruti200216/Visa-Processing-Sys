-- MySQL dump 10.19  Distrib 10.3.31-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: visa
-- ------------------------------------------------------
-- Server version	10.3.31-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminlogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `applicationdetails`
--

DROP TABLE IF EXISTS `applicationdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `applicationdetails` (
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `date of birth` varchar(50) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `visatype` varchar(20) NOT NULL,
  `idproof` varchar(20) NOT NULL,
  `document` blob NOT NULL,
  KEY `FK_application details_user registration` (`fname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applicationdetails`
--

LOCK TABLES `applicationdetails` WRITE;
/*!40000 ALTER TABLE `applicationdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `applicationdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `businessvisa`
--

DROP TABLE IF EXISTS `businessvisa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `businessvisa` (
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `countryvisiting` varchar(50) NOT NULL,
  `companyname` varchar(50) NOT NULL,
  `purpose` varchar(45) NOT NULL,
  `dateofvisiting` varchar(50) NOT NULL,
  `dateofreturn` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `businessvisa`
--

LOCK TABLES `businessvisa` WRITE;
/*!40000 ALTER TABLE `businessvisa` DISABLE KEYS */;
/*!40000 ALTER TABLE `businessvisa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicalvisa`
--

DROP TABLE IF EXISTS `medicalvisa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicalvisa` (
  `countryvisiting` varchar(50) NOT NULL,
  `patientname` varchar(50) NOT NULL,
  `domestichospital` varchar(50) NOT NULL,
  `passportno` int(11) NOT NULL,
  `dateoftravelling` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicalvisa`
--

LOCK TABLES `medicalvisa` WRITE;
/*!40000 ALTER TABLE `medicalvisa` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicalvisa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentvisa`
--

DROP TABLE IF EXISTS `studentvisa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentvisa` (
  `countryvisiting` varchar(50) NOT NULL,
  `currentuniversity` varchar(50) NOT NULL,
  `abroaduniversity` varchar(45) NOT NULL,
  `selectcources` varchar(45) NOT NULL,
  `collegename` varchar(45) NOT NULL,
  `studentname` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentvisa`
--

LOCK TABLES `studentvisa` WRITE;
/*!40000 ALTER TABLE `studentvisa` DISABLE KEYS */;
/*!40000 ALTER TABLE `studentvisa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `touristvisa`
--

DROP TABLE IF EXISTS `touristvisa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `touristvisa` (
  `countryname` varchar(50) NOT NULL,
  `passportno` int(11) NOT NULL,
  `travellername` varchar(50) NOT NULL,
  `dateofvisiting` varchar(50) NOT NULL,
  `dateofreturn` varchar(50) NOT NULL,
  `dateofbirth` varchar(50) NOT NULL,
  `gender` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `touristvisa`
--

LOCK TABLES `touristvisa` WRITE;
/*!40000 ALTER TABLE `touristvisa` DISABLE KEYS */;
/*!40000 ALTER TABLE `touristvisa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userregistration`
--

DROP TABLE IF EXISTS `userregistration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userregistration` (
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `passward` int(10) NOT NULL,
  `umob` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dateofbirth` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userregistration`
--

LOCK TABLES `userregistration` WRITE;
/*!40000 ALTER TABLE `userregistration` DISABLE KEYS */;
/*!40000 ALTER TABLE `userregistration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vstatus`
--

DROP TABLE IF EXISTS `vstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vstatus` (
  `approved` varchar(20) DEFAULT NULL,
  `rejected` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vstatus`
--

LOCK TABLES `vstatus` WRITE;
/*!40000 ALTER TABLE `vstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `vstatus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-13 19:46:39
