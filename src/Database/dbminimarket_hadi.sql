-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Jun 2022 pada 07.09
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbminimarket_hadi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_penjualanhadi`
--

CREATE TABLE `detail_penjualanhadi` (
  `no_nota` varchar(11) NOT NULL,
  `kode_barang` varchar(19) NOT NULL,
  `harga_penjualan` float NOT NULL,
  `jumlah_penjualan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `detail_penjualanhadi`
--

INSERT INTO `detail_penjualanhadi` (`no_nota`, `kode_barang`, `harga_penjualan`, `jumlah_penjualan`) VALUES
('FKP02', 'B002', 30000, 3),
('FKJ01', 'B002', 26000, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `header_penjualanhadi`
--

CREATE TABLE `header_penjualanhadi` (
  `no_nota` varchar(11) NOT NULL,
  `tanggal_penjualan` date NOT NULL,
  `id_pegawai` varchar(11) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `header_penjualanhadi`
--

INSERT INTO `header_penjualanhadi` (`no_nota`, `tanggal_penjualan`, `id_pegawai`, `total`) VALUES
('FKJ01', '2022-06-21', 'P02', 52000),
('FKP02', '2022-06-10', 'P004', 90000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbbarang_hadi`
--

CREATE TABLE `tbbarang_hadi` (
  `kode_barang` varchar(19) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga_beli` float NOT NULL,
  `harga_jual` float NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbbarang_hadi`
--

INSERT INTO `tbbarang_hadi` (`kode_barang`, `nama_barang`, `harga_beli`, `harga_jual`, `jumlah`) VALUES
('B001', 'Detergen', 25000, 30000, 20),
('B002', 'Minyak Goreng 1LT', 24000, 26000, 20),
('B003', 'Minyak Goreng 2LT', 40000, 49000, 20),
('B004', 'Sabun Cuci Piring', 14000, 18000, 25),
('B005', 'Pembersih Lantai', 10000, 13500, 10),
('B006', 'Pewangi Pakaian', 12000, 14000, 10),
('B007', 'Pasta Gigi', 20000, 22000, 30),
('B008', 'Sabun Mandi', 2000, 3000, 30),
('B009', 'Mie Instan', 2000, 3000, 99),
('B010', 'Kopi', 2000, 4000, 99),
('B011', 'Teh', 2000, 3500, 99),
('B012', 'Susu Kental Manis', 10000, 15000, 99),
('B013', 'Kecap Manis', 15000, 18000, 9),
('B014', 'Beras 5Kg', 60000, 75000, 10),
('B015', 'Gas Elpiji ', 21000, 23000, 10);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbdetail_pembelianhadi`
--

CREATE TABLE `tbdetail_pembelianhadi` (
  `no_faktur` varchar(11) CHARACTER SET latin1 NOT NULL,
  `kode_barang` varchar(19) CHARACTER SET latin1 NOT NULL,
  `harga_pembelian` float NOT NULL,
  `jumlah_pembelian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbdetail_pembelianhadi`
--

INSERT INTO `tbdetail_pembelianhadi` (`no_faktur`, `kode_barang`, `harga_pembelian`, `jumlah_pembelian`) VALUES
('FK01', 'B001', 30000, 1),
('FK03', 'B002', 30000, 3),
('FK04', 'B003', 49000, 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbheader_pembelianhadi`
--

CREATE TABLE `tbheader_pembelianhadi` (
  `no_faktur` varchar(11) CHARACTER SET latin1 NOT NULL,
  `tanggal_pembelian` date NOT NULL,
  `kode_supplier` varchar(7) CHARACTER SET latin1 NOT NULL,
  `id_pegawai` char(15) CHARACTER SET latin1 NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbheader_pembelianhadi`
--

INSERT INTO `tbheader_pembelianhadi` (`no_faktur`, `tanggal_pembelian`, `kode_supplier`, `id_pegawai`, `total`) VALUES
('FK01', '2022-06-04', 'A001', 'P001', 30000),
('FK03', '2022-06-12', 'IN01', 'P002', 90000),
('FK04', '2022-06-21', 'KS03', 'P02', 98000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbpegawai_hadi`
--

CREATE TABLE `tbpegawai_hadi` (
  `id_pegawai` varchar(11) CHARACTER SET latin1 NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `jenis_kelamin` enum('Pria','Wanita') NOT NULL,
  `alamat_pegawai` varchar(200) NOT NULL,
  `bagian` varchar(25) NOT NULL,
  `kontak_pegawai` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbpegawai_hadi`
--

INSERT INTO `tbpegawai_hadi` (`id_pegawai`, `nama_pegawai`, `jenis_kelamin`, `alamat_pegawai`, `bagian`, `kontak_pegawai`) VALUES
('P01', 'Muhamad Hadi Saputra', 'Pria', 'Jl.Residen H.Najamuddin Kenten Laut', 'Pemilik Toko', '085368620987'),
('P02', 'Nurhaliza', 'Wanita', 'Jl KH. Wahid Hasyim', 'Kasir', '0988119821'),
('P03', 'Krisna', 'Pria', 'Kertapati', 'Pramuniaga/Kasir2', '0988776112'),
('P04', 'Agung Darmawan', 'Pria', 'Jl Banten', 'Penerima barang masuk', '0988877322');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbsupplier_hadi`
--

CREATE TABLE `tbsupplier_hadi` (
  `kode_supplier` varchar(7) CHARACTER SET latin1 NOT NULL,
  `nama_supplier` varchar(50) CHARACTER SET latin1 NOT NULL,
  `alamat_supplier` varchar(200) CHARACTER SET latin1 NOT NULL,
  `kontak_supplier` varchar(15) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbsupplier_hadi`
--

INSERT INTO `tbsupplier_hadi` (`kode_supplier`, `nama_supplier`, `alamat_supplier`, `kontak_supplier`) VALUES
('KS01', 'PT Indofood Tbk', 'Jl.Kapten Ahmad', '02122987622'),
('KS02', 'PT Gudang Garam ', 'Jl.Kapten Ahmad', '099887988'),
('KS03', 'PT Unilever Indonesia Tbk', 'Jl.BSD - Tangerang', '099887655'),
('KS04', 'PT Mayora', 'Jl.palembang -betung', '09988765588');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbuser_hadi`
--

CREATE TABLE `tbuser_hadi` (
  `id_user` varchar(15) CHARACTER SET latin1 NOT NULL,
  `id_pegawai` varchar(11) CHARACTER SET latin1 NOT NULL,
  `username` varchar(15) CHARACTER SET latin1 NOT NULL,
  `password` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbuser_hadi`
--

INSERT INTO `tbuser_hadi` (`id_user`, `id_pegawai`, `username`, `password`) VALUES
('004HD', 'P001', 'hadisptr', 'F59BD65F7EDAFB087A81D4DCA06C4910'),
('HD04', '004HD', 'hadisptr', 'e10adc3949ba59abbe56e057f20f883e');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detail_penjualanhadi`
--
ALTER TABLE `detail_penjualanhadi`
  ADD KEY `no_nota` (`no_nota`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indeks untuk tabel `header_penjualanhadi`
--
ALTER TABLE `header_penjualanhadi`
  ADD PRIMARY KEY (`no_nota`),
  ADD KEY `header_penjualan_ibfk_1` (`id_pegawai`);

--
-- Indeks untuk tabel `tbbarang_hadi`
--
ALTER TABLE `tbbarang_hadi`
  ADD PRIMARY KEY (`kode_barang`);

--
-- Indeks untuk tabel `tbdetail_pembelianhadi`
--
ALTER TABLE `tbdetail_pembelianhadi`
  ADD KEY `no_faktur` (`no_faktur`),
  ADD KEY `kode_barang` (`kode_barang`);

--
-- Indeks untuk tabel `tbheader_pembelianhadi`
--
ALTER TABLE `tbheader_pembelianhadi`
  ADD PRIMARY KEY (`no_faktur`),
  ADD KEY `kode_supplier` (`kode_supplier`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indeks untuk tabel `tbpegawai_hadi`
--
ALTER TABLE `tbpegawai_hadi`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indeks untuk tabel `tbsupplier_hadi`
--
ALTER TABLE `tbsupplier_hadi`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indeks untuk tabel `tbuser_hadi`
--
ALTER TABLE `tbuser_hadi`
  ADD PRIMARY KEY (`id_user`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_penjualanhadi`
--
ALTER TABLE `detail_penjualanhadi`
  ADD CONSTRAINT `detail_penjualan_ibfk1` FOREIGN KEY (`kode_barang`) REFERENCES `tbbarang_hadi` (`kode_barang`),
  ADD CONSTRAINT `detail_penjualan_ibfk2` FOREIGN KEY (`no_nota`) REFERENCES `header_penjualanhadi` (`no_nota`);

--
-- Ketidakleluasaan untuk tabel `header_penjualanhadi`
--
ALTER TABLE `header_penjualanhadi`
  ADD CONSTRAINT `header_penjualan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tbpegawai_hadi` (`id_pegawai`);

--
-- Ketidakleluasaan untuk tabel `tbdetail_pembelianhadi`
--
ALTER TABLE `tbdetail_pembelianhadi`
  ADD CONSTRAINT `tbdetail_pembelian_ibfk1` FOREIGN KEY (`no_faktur`) REFERENCES `tbheader_pembelianhadi` (`no_faktur`),
  ADD CONSTRAINT `tbdetail_pembelian_ibfk2` FOREIGN KEY (`kode_barang`) REFERENCES `tbbarang_hadi` (`kode_barang`);

--
-- Ketidakleluasaan untuk tabel `tbheader_pembelianhadi`
--
ALTER TABLE `tbheader_pembelianhadi`
  ADD CONSTRAINT `tbheader_pembelian_ibfk2` FOREIGN KEY (`id_pegawai`) REFERENCES `tbpegawai_hadi` (`id_pegawai`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
