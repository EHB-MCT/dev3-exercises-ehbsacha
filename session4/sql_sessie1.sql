-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 09, 2021 at 10:58 AM
-- Server version: 5.7.36-0ubuntu0.18.04.1
-- PHP Version: 7.2.24-0ubuntu0.18.04.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2122DEV3063`
--

-- --------------------------------------------------------

--
-- Table structure for table `cities`
--

CREATE TABLE `cities` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `postal_code` int(11) DEFAULT NULL,
  `has_train_station` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cities`
--

INSERT INTO `cities` (`id`, `name`, `postal_code`, `has_train_station`) VALUES
(1, 'Leuven', 3000, 1),
(2, 'Gent', 9000, 1),
(3, 'Brussel', 1000, 1),
(4, 'Mechelen', 2800, 1);

-- --------------------------------------------------------

--
-- Table structure for table `passengers`
--

CREATE TABLE `passengers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `family_name` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passengers`
--

INSERT INTO `passengers` (`id`, `name`, `family_name`) VALUES
(1, 'Sacha', 'Voskuilen'),
(2, 'Johnny', 'Frank'),
(3, 'Henk', 'De Steen');

-- --------------------------------------------------------

--
-- Table structure for table `rides`
--

CREATE TABLE `rides` (
  `id` int(11) NOT NULL,
  `train_id` int(11) NOT NULL,
  `departure_time` datetime(6) DEFAULT NULL,
  `departure_city_id` int(11) NOT NULL,
  `destination_city_id` int(11) NOT NULL,
  `last_update_time` datetime DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rides`
--

INSERT INTO `rides` (`id`, `train_id`, `departure_time`, `departure_city_id`, `destination_city_id`, `last_update_time`) VALUES
(1, 3, '2021-11-09 13:32:00.000000', 1, 2, '2021-11-09 10:51:09'),
(2, 1, '2021-11-10 11:51:34.000000', 2, 4, '2021-11-09 10:51:55'),
(3, 2, '2021-11-09 17:12:00.000000', 3, 1, '2021-11-09 10:53:27');

-- --------------------------------------------------------

--
-- Table structure for table `trains`
--

CREATE TABLE `trains` (
  `id` int(11) NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `max_speed` int(11) DEFAULT NULL,
  `max_passengers` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trains`
--

INSERT INTO `trains` (`id`, `type`, `max_speed`, `max_passengers`) VALUES
(1, 'S2', 80, 600),
(2, 'IC', 120, 1200),
(3, 'THA', 250, 2000);

-- --------------------------------------------------------

--
-- Table structure for table `used_rides`
--

CREATE TABLE `used_rides` (
  `id` int(11) NOT NULL,
  `passenger_id` int(11) DEFAULT NULL,
  `ride_id` int(11) DEFAULT NULL,
  `last_update_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `used_rides`
--

INSERT INTO `used_rides` (`id`, `passenger_id`, `ride_id`, `last_update_time`) VALUES
(1, 2, 3, '2021-11-09 10:31:52');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `passengers`
--
ALTER TABLE `passengers`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rides`
--
ALTER TABLE `rides`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `trains`
--
ALTER TABLE `trains`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `used_rides`
--
ALTER TABLE `used_rides`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cities`
--
ALTER TABLE `cities`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `passengers`
--
ALTER TABLE `passengers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rides`
--
ALTER TABLE `rides`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `trains`
--
ALTER TABLE `trains`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `used_rides`
--
ALTER TABLE `used_rides`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
