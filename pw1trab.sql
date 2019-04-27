-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 25-Nov-2018 às 15:59
-- Versão do servidor: 5.6.13
-- versão do PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `pw1trab`
--
CREATE DATABASE IF NOT EXISTS `pw1trab` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `pw1trab`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `localizacao`
--

CREATE TABLE IF NOT EXISTS `localizacao` (
  `idlocalizacao` int(11) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(100) NOT NULL,
  `uf` varchar(100) NOT NULL,
  PRIMARY KEY (`idlocalizacao`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Extraindo dados da tabela `localizacao`
--

INSERT INTO `localizacao` (`idlocalizacao`, `cidade`, `uf`) VALUES
(3, 'Porto Alegre', 'RS'),
(4, 'POA', 'RS'),
(5, 'Porto Alegre', 'RS'),
(6, 'Porto Alegre', 'RS'),
(7, 'Novo Hamburgo', 'RS'),
(8, 'São Leopoldo', 'RS');

-- --------------------------------------------------------

--
-- Estrutura da tabela `urna`
--

CREATE TABLE IF NOT EXISTS `urna` (
  `idurna` int(11) NOT NULL AUTO_INCREMENT,
  `zona` int(10) NOT NULL,
  `secao` int(10) NOT NULL,
  `situacao` varchar(200) NOT NULL,
  `idlocalizacao` int(11) NOT NULL,
  PRIMARY KEY (`idurna`),
  KEY `idcpf` (`idlocalizacao`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Extraindo dados da tabela `urna`
--

INSERT INTO `urna` (`idurna`, `zona`, `secao`, `situacao`, `idlocalizacao`) VALUES
(4, 123, 456, 'ABERTA', 6),
(5, 456, 123, 'FECHADA', 7),
(6, 111, 222, 'ENCERRADA', 8);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
