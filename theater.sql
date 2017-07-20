-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 05, 2017 at 02:39 
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `theater`
--

-- --------------------------------------------------------

--
-- Table structure for table `menonton`
--

CREATE TABLE `menonton` (
  `Nama_studio` varchar(200) NOT NULL,
  `no_hp` varchar(200) NOT NULL,
  `Studio` int(11) NOT NULL,
  `judul_film` varchar(200) NOT NULL,
  `waktu` datetime NOT NULL,
  `no_kursi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menonton`
--

INSERT INTO `menonton` (`Nama_studio`, `no_hp`, `Studio`, `judul_film`, `waktu`, `no_kursi`) VALUES
('Garuda', '085759116062', 1, 'Mencari Bakat', '2017-05-17 11:00:00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `Penonton`
--

CREATE TABLE `Penonton` (
  `no_hp` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Penonton`
--

INSERT INTO `Penonton` (`no_hp`) VALUES
(''),
('085759116062');

-- --------------------------------------------------------

--
-- Table structure for table `theater`
--

CREATE TABLE `theater` (
  `Nama_studio` varchar(200) NOT NULL,
  `Studio` varchar(200) NOT NULL,
  `judul_film` varchar(200) NOT NULL,
  `waktu` datetime NOT NULL,
  `no_kursi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `theater`
--

INSERT INTO `theater` (`Nama_studio`, `Studio`, `judul_film`, `waktu`, `no_kursi`) VALUES
('Garuda', '1', 'Mencari Bakat', '2017-05-17 11:00:00', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `menonton`
--
ALTER TABLE `menonton`
  ADD KEY `Nama_studio` (`Nama_studio`),
  ADD KEY `no_hp` (`no_hp`);

--
-- Indexes for table `Penonton`
--
ALTER TABLE `Penonton`
  ADD PRIMARY KEY (`no_hp`);

--
-- Indexes for table `theater`
--
ALTER TABLE `theater`
  ADD PRIMARY KEY (`Nama_studio`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `menonton`
--
ALTER TABLE `menonton`
  ADD CONSTRAINT `menonton_ibfk_3` FOREIGN KEY (`Nama_studio`) REFERENCES `theater` (`Nama_studio`),
  ADD CONSTRAINT `menonton_ibfk_4` FOREIGN KEY (`no_hp`) REFERENCES `Penonton` (`no_hp`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
