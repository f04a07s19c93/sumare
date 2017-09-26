-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 12-Maio-2016 às 10:04
-- Versão do servidor: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projetopizza`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE IF NOT EXISTS `vendas` (
  `id_venda` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `endereco` varchar(30) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  `tipo_pagamento` varchar(30) NOT NULL,
  `cod_pizza` int(11) NOT NULL,
  `quant_pizza` int(11) NOT NULL,
  `cod_refri` int(11) NOT NULL,
  `quant_refri` int(11) NOT NULL,
  `valor` double NOT NULL,
  PRIMARY KEY (`id_venda`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`id_venda`, `nome`, `endereco`, `telefone`, `tipo_pagamento`, `cod_pizza`, `quant_pizza`, `cod_refri`, `quant_refri`, `valor`) VALUES
(1, 'filipe', 'rua nelson herling', '11-5673-1254', 'null Cartão de Crédito / ', 0, 0, 0, 0, 0),
(4, 'dsfdasfdsa', 'sadfdsafsdf', '  -    -    ', ' Cartão VA ou VR / ', 0, 0, 6, 0, 30),
(5, 'filipe ', 'rua g - 25', '11-5673-1254', ' Cartão de Crédito / ', 5, 1, 0, 1, 30);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
