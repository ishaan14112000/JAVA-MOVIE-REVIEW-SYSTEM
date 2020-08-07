-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2020 at 09:07 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `new1`
--

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `name` varchar(100) DEFAULT NULL,
  `genre` varchar(100) DEFAULT NULL,
  `rating` int(2) DEFAULT NULL,
  `collection` int(3) DEFAULT NULL,
  `comments` varchar(5000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`name`, `genre`, `rating`, `collection`, `comments`) VALUES
('pk', 'comedy', 8, 300, 'aamir khan did excellent acting. direction was amazing. blockbuster movie'),
('znmd', 'comedy', 9, 400, 'fantastic movie. very well directed'),
('rustom', 'thriller', 7, 200, 'amazing direction. excellent story'),
('piku', 'comedy', 7, 100, 'a light hearted movie'),
('abcd', 'drama', 6, 50, 'good direction. one time watch'),
('1920', 'horror', 5, 200, 'poor movie. okayish story line'),
('hera pheri', 'comedy', 9, 400, 'excellent movie! one of the best comedy movies of all time'),
('welcome', 'comedy', 8, 400, 'amazing cast. great acting. blockbuster'),
('bhoot', 'horror', 6, 40, 'direction was good. execution was not that good'),
('stree', 'horror', 7, 80, 'a horror comedy. definitely one time watch'),
('alone', 'horror', 3, 10, 'poor storyline. poor sirection'),
('pari', 'horror', 5, 65, 'okayish movie. locations were good'),
('malang', 'thriller', 6, 80, 'one time watch. promotes goa tourism'),
('andhadhun', 'thriller', 10, 400, 'excellent movie! best thriller movie. great suspense'),
('talaash', 'thriller', 7, 100, 'amazing story line. good execution'),
('kahaani', 'thriller', 6, 50, 'a good comeback by vidya balan'),
('angrezi medium', 'drama', 7, 100, 'perfectly displays a father-daughter bond'),
('thappad', 'drama', 9, 90, 'perfectly portrays feminism'),
('street dancer', 'drama', 6, 100, 'only good thing about this movie was its songs'),
('udta punjab', 'drama', 8, 200, 'a movie that teenagers must watch '),
('3 idiots', 'comedy', 10, 500, 'a heart warming movie.'),
('dhoni', 'drama', 8, 300, 'perfect depiction of MS DHONI');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
