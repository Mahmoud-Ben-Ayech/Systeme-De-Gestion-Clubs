-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 26, 2023 at 12:23 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clubbdd`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `firstName`, `lastName`, `email`, `password`) VALUES
(1, 'mahmoud', 'ben ayech', 'mm@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `id` bigint(20) NOT NULL,
  `attendees` int(11) NOT NULL,
  `event_date` varchar(255) DEFAULT NULL,
  `event_name` varchar(255) DEFAULT NULL,
  `materials_needed` varchar(255) DEFAULT NULL,
  `organizer` varchar(255) DEFAULT NULL,
  `place` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id`, `attendees`, `event_date`, `event_name`, `materials_needed`, `organizer`, `place`) VALUES
(111, 20, '18/06/2023', 'workshop AI', 'multibrises/cables', 'Mahmoud', 'Ariana'),
(112, 15, '15/04/2024', 'Formation Spring Boot', 'datashow', 'Chadi', 'Charguia 2'),
(211, 30, '19/01/2024', 'Formation Angular', 'ordinateurs/cables', 'Med Hamid', 'Tunis'),
(222, 50, '20/08/2024', 'General Assembly ', 'nothing', 'president Club', 'Jardin japonaise'),
(233, 50, '12/12/2024', 'Formation web', 'pcs', 'med', 'enicar');

-- --------------------------------------------------------

--
-- Table structure for table `event_join`
--

CREATE TABLE `event_join` (
  `id` bigint(20) NOT NULL,
  `email_user` varchar(255) DEFAULT NULL,
  `nom_event` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `event_join`
--

INSERT INTO `event_join` (`id`, `email_user`, `nom_event`) VALUES
(1, 'Mahmoud', 'workshop AI'),
(2, 'chadi', 'Formation Web');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(2);

-- --------------------------------------------------------

--
-- Table structure for table `responsableclub`
--

CREATE TABLE `responsableclub` (
  `id` int(11) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `responsableclub`
--

INSERT INTO `responsableclub` (`id`, `firstName`, `lastName`, `email`, `password`) VALUES
(1, 'mohamed', 'ali', 'ii@gmail.com', '123456'),
(2, 'mohamed', 'amine', 'mohamedamine@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstName` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstName`, `lastName`, `email`, `password`) VALUES
(1, 'mohamed', 'ali', 'll@gmail.com', '123456'),
(2, 'mohamed', 'ali', 'mohamedali@gmail.com', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `event`
--
ALTER TABLE `event`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `event_join`
--
ALTER TABLE `event_join`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `responsableclub`
--
ALTER TABLE `responsableclub`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `responsableclub`
--
ALTER TABLE `responsableclub`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
