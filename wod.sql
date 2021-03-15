-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2021. Már 15. 11:51
-- Kiszolgáló verziója: 10.4.18-MariaDB
-- PHP verzió: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `wod`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `alkalmazottak`
--

CREATE TABLE `alkalmazottak` (
  `a_ID` int(11) NOT NULL,
  `veznev` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `kernev` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `varos` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `utca` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `hazszam` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `taj` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `szigszam` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `ado` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `telszam` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `alkalmazottak`
--

INSERT INTO `alkalmazottak` (`a_ID`, `veznev`, `kernev`, `varos`, `utca`, `hazszam`, `taj`, `szigszam`, `ado`, `telszam`) VALUES
(1, '', '', '', '', '', '', '', '', ''),
(2, 'Simon', 'Szultán', 'New York', 'Futrinka utca', '5', '123456', '123456', '123456', '123456');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `beosztas`
--

CREATE TABLE `beosztas` (
  `a_ID` int(11) NOT NULL,
  `d1` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d2` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d3` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d4` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d5` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d6` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d7` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d8` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d9` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d10` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d11` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d12` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d13` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d14` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d15` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d16` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d17` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d18` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d19` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d20` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d21` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d22` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d23` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d24` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d25` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d26` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d27` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d28` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d29` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d30` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `d31` varchar(40) COLLATE utf8_hungarian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `beosztas`
--

INSERT INTO `beosztas` (`a_ID`, `d1`, `d2`, `d3`, `d4`, `d5`, `d6`, `d7`, `d8`, `d9`, `d10`, `d11`, `d12`, `d13`, `d14`, `d15`, `d16`, `d17`, `d18`, `d19`, `d20`, `d21`, `d22`, `d23`, `d24`, `d25`, `d26`, `d27`, `d28`, `d29`, `d30`, `d31`) VALUES
(1, '08:00-16:00', '08:00-16:00', 'P', 'SZ', 'SZ', 'Hétvége', 'Hétvége', '08:00-16:00', '08:00-16:00', '08:00-16:00', '08:00-16:00', '08:00-16:00', 'Hétvége', 'Hétvége', '08:00-16:00', '08:00-16:00', '08:00-16:00', '08:00-16:00', '08:00-16:00', 'Hétvége', 'Hétvége', '08:00-16:00', '08:00-16:00', 'P', 'P', '08:00-16:00', 'Hétvége', 'Hétvége', '08:00-16:00', 'SZ', 'SZ');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `user_login`
--

CREATE TABLE `user_login` (
  `a_ID` int(11) DEFAULT NULL,
  `passw` varchar(50) COLLATE utf8_hungarian_ci DEFAULT NULL,
  `jogosultsag` varchar(50) COLLATE utf8_hungarian_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_hungarian_ci;

--
-- A tábla adatainak kiíratása `user_login`
--

INSERT INTO `user_login` (`a_ID`, `passw`, `jogosultsag`) VALUES
(1, '21232f297a57a5a743894a0e4a801fc3', 'a'),
(2, '21232f297a57a5a743894a0e4a801fc3', 'a');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `alkalmazottak`
--
ALTER TABLE `alkalmazottak`
  ADD PRIMARY KEY (`a_ID`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `alkalmazottak`
--
ALTER TABLE `alkalmazottak`
  MODIFY `a_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
