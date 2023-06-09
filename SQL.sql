USE [QLCT_CTXaydung]
GO
/****** Object:  Table [dbo].[ChiTietCongNhan]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietCongNhan](
	[IDDA] [nvarchar](20) NOT NULL,
	[Thuong] [decimal](18, 0) NULL,
	[SoNgayLam] [int] NULL,
	[TongLuong] [float] NULL,
	[IDCN] [nvarchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVu]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVu](
	[IDCV] [nvarchar](10) NOT NULL,
	[ChucVu] [nvarchar](30) NULL,
 CONSTRAINT [PK_ChucVu] PRIMARY KEY CLUSTERED 
(
	[IDCV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChucVuCongNhan]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChucVuCongNhan](
	[IDCVCN] [nvarchar](10) NOT NULL,
	[ChucVu] [nvarchar](50) NULL,
	[LuongCoBan] [decimal](18, 0) NULL,
 CONSTRAINT [PK_ChucVuCongNhan] PRIMARY KEY CLUSTERED 
(
	[IDCVCN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DuAn]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DuAn](
	[IDDA] [nvarchar](20) NOT NULL,
	[TenDA] [nvarchar](max) NULL,
	[IDKH] [nvarchar](20) NULL,
	[NgayKiHopDong] [nvarchar](30) NULL,
	[DiaDiem] [nvarchar](max) NULL,
	[ThoiGianDuKienHoanThanh] [nvarchar](30) NULL,
	[DatCoc] [numeric](18, 0) NULL,
	[TienDoDA] [nvarchar](50) NULL,
 CONSTRAINT [PK_DuAn] PRIMARY KEY CLUSTERED 
(
	[IDDA] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhiPhatSinh]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhiPhatSinh](
	[TenPhatSinh] [nvarchar](20) NOT NULL,
	[DonVi] [nvarchar](50) NULL,
	[SoLuong] [int] NULL,
	[TongTien] [int] NULL,
	[GhiChu] [nvarchar](max) NULL,
	[IDDA] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_PhiPhatSinh] PRIMARY KEY CLUSTERED 
(
	[TenPhatSinh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLCongNhan]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLCongNhan](
	[IDCN] [nvarchar](10) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[SDT] [varchar](11) NULL,
	[IDCVCN] [nvarchar](10) NULL,
	[DiaChi] [nvarchar](max) NULL,
 CONSTRAINT [PK_QLCongNhan] PRIMARY KEY CLUSTERED 
(
	[IDCN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLNguyenVatLieu]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLNguyenVatLieu](
	[IDNVL] [nvarchar](20) NOT NULL,
	[TenNVL] [nvarchar](max) NULL,
	[NoiCungCap] [nvarchar](max) NULL,
	[SoLuongSP] [int] NULL,
	[DonViTinh] [nvarchar](20) NULL,
	[DonGia] [int] NULL,
	[TongTien] [int] NULL,
	[IDDA] [nvarchar](20) NOT NULL,
 CONSTRAINT [PK_QLNguyenVatLieu] PRIMARY KEY CLUSTERED 
(
	[IDNVL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLNhanVien]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLNhanVien](
	[IDNV] [nvarchar](10) NOT NULL,
	[HoTen] [nvarchar](50) NULL,
	[SDT] [nchar](11) NULL,
	[GioiTinh] [nvarchar](5) NULL,
	[IDCV] [nvarchar](10) NULL,
	[Email] [nvarchar](max) NULL,
	[DiaChi] [nvarchar](max) NULL,
 CONSTRAINT [PK_QLNhanVien] PRIMARY KEY CLUSTERED 
(
	[IDNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLPhanCong]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLPhanCong](
	[IDDA] [nvarchar](20) NOT NULL,
	[IDNV] [nvarchar](10) NULL,
	[NgayNhan] [nvarchar](50) NULL,
	[TienDo] [nvarchar](20) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QLThongTinKH]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QLThongTinKH](
	[IDKH] [nvarchar](20) NOT NULL,
	[HoTenKH] [nvarchar](50) NULL,
	[GioiTinh] [nvarchar](10) NULL,
	[SDT] [nvarchar](12) NULL,
	[DiaChi] [nvarchar](max) NULL,
 CONSTRAINT [PK_QLThongTinKH] PRIMARY KEY CLUSTERED 
(
	[IDKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoanAD]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoanAD](
	[TenTK] [varchar](50) NOT NULL,
	[MatKhau] [varchar](50) NULL,
 CONSTRAINT [PK_TaiKhoanAD] PRIMARY KEY CLUSTERED 
(
	[TenTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoanNV]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoanNV](
	[TenTaiKhoan] [nvarchar](20) NOT NULL,
	[MatKhau] [varchar](50) NULL,
	[IDNV] [nvarchar](10) NULL,
	[saltvalue] [varchar](max) NULL,
 CONSTRAINT [PK_TaiKhoanNV] PRIMARY KEY CLUSTERED 
(
	[TenTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Thuong]    Script Date: 6/17/2022 9:45:54 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Thuong](
	[DieuKien] [nvarchar](max) NOT NULL,
	[MucThuong] [float] NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA01', CAST(90000 AS Decimal(18, 0)), 60, 18090000, N'C01')
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA03', CAST(2400000 AS Decimal(18, 0)), 200, 42400000, N'C01')
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA03', CAST(360000 AS Decimal(18, 0)), 40, 12360000, N'C05')
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA04', CAST(2400000 AS Decimal(18, 0)), 200, 42400000, N'C01')
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA04', CAST(0 AS Decimal(18, 0)), 20, 6000000, N'C02')
INSERT [dbo].[ChiTietCongNhan] ([IDDA], [Thuong], [SoNgayLam], [TongLuong], [IDCN]) VALUES (N'DA04', CAST(720000 AS Decimal(18, 0)), 80, 24720000, N'C05')
GO
INSERT [dbo].[ChucVu] ([IDCV], [ChucVu]) VALUES (N'CV01', N'Thu ngân')
INSERT [dbo].[ChucVu] ([IDCV], [ChucVu]) VALUES (N'CV02', N'Quản lí nhân sự')
INSERT [dbo].[ChucVu] ([IDCV], [ChucVu]) VALUES (N'CV03', N'Nhân viên')
GO
INSERT [dbo].[ChucVuCongNhan] ([IDCVCN], [ChucVu], [LuongCoBan]) VALUES (N'CN01', N'Công nhân thời vụ', CAST(200000 AS Decimal(18, 0)))
INSERT [dbo].[ChucVuCongNhan] ([IDCVCN], [ChucVu], [LuongCoBan]) VALUES (N'CN02', N'Giám sát công trường', CAST(200000 AS Decimal(18, 0)))
INSERT [dbo].[ChucVuCongNhan] ([IDCVCN], [ChucVu], [LuongCoBan]) VALUES (N'CN03', N'Công nhân chính thức', CAST(300000 AS Decimal(18, 0)))
GO
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA01', N'Cao ốc Phú Nhuận', N'KH01', N'22/12/2012', N'Phú Nhuận', N'12/12/2020', CAST(300000000 AS Numeric(18, 0)), N'Hoàn thành')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA02', N'Công ty Hoa Mai', N'KH02', N'22/12/2013', N'Thủ Đức', N'23/12/2020', CAST(900000000 AS Numeric(18, 0)), N'Hoàn thành')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA03', N'Công ty Dược Phẩm', N'KH03', N'22/05/2022', N'Bình Thạnh', N'2/12/2019', CAST(850000000 AS Numeric(18, 0)), N'Đang tiến hành')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA04', N'Quan cafe', N'KH04', N'20/06/2022', N'Gò Vấp', N'20/07/2022', CAST(400000000 AS Numeric(18, 0)), N'Đang tiến hành')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA05', N'Siêu thị', N'KH05', N'12/5/2022', N'Quận 9', N'1/1/2023', CAST(800000000 AS Numeric(18, 0)), N'Chưa bắt đầu')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA06', N'Chung cư', N'KH01', N'15/05/2022', N'Quận 1', N'1/7/2025', CAST(1000000000 AS Numeric(18, 0)), N'Chưa bắt đầu')
INSERT [dbo].[DuAn] ([IDDA], [TenDA], [IDKH], [NgayKiHopDong], [DiaDiem], [ThoiGianDuKienHoanThanh], [DatCoc], [TienDoDA]) VALUES (N'DA07', N'Chung cư', N'KH06', N'02/06/2022', N'Quận 2', N'01/05/2027', CAST(1000000000 AS Numeric(18, 0)), N'Đang tiến hành')
GO
INSERT [dbo].[PhiPhatSinh] ([TenPhatSinh], [DonVi], [SoLuong], [TongTien], [GhiChu], [IDDA]) VALUES (N'Cần cẩu', N'Chiếc', 2, 4000000, N'Thuê', N'DA03')
INSERT [dbo].[PhiPhatSinh] ([TenPhatSinh], [DonVi], [SoLuong], [TongTien], [GhiChu], [IDDA]) VALUES (N'Cần cẩu dài', N'chiếc', 2, 2000000, N'thuê', N'DA04')
INSERT [dbo].[PhiPhatSinh] ([TenPhatSinh], [DonVi], [SoLuong], [TongTien], [GhiChu], [IDDA]) VALUES (N'Máy trộn bê tông', N'Chiếc', 5, 1000000, N'Thuê', N'DA03')
GO
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C01', N'ABC', N'Nam', N'092121341', N'CN01', N'ADC')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C02', N'ASD', N'Nam', N'092121341', N'CN03', N'ADF')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C03', N'An', N'Nữ', N'071231212', N'CN01', N'GHJ')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C04', N'23ad', N'Nữ', N'092121344', N'CN02', N'VBN')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C05', N'Hoang', N'Nam', N'036826433', N'CN03', N'quan 1')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C06', N'An', N'Nam', N'0982134243', N'CN01', N'quan 12')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C07', N'Nam', N'Nam', N'0982145353', N'CN01', N'quan 3')
INSERT [dbo].[QLCongNhan] ([IDCN], [HoTen], [GioiTinh], [SDT], [IDCVCN], [DiaChi]) VALUES (N'C08', N'Linh', N'Nữ', N'0782124245', N'CN03', N'quan 7')
GO
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'NVL01', N'Xi măng', N'cty Xi măng Thăng Long', 100, N'Bao', 74000, 7400000, N'DA03')
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'NVL02', N'Cát vàng', N'Cửa hàng vật liệu xây dựng Phương Vy', 12, N'm^3', 200000, 2500000, N'DA03')
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'NVL03', N'Thép(20,11)', N'Cửa hàng vật liệu xây dựng Phương Vy', 100, N'Cây', 300000, 30000000, N'DA03')
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'VL01', N'Xi măng', N'cty Xi măng Thăng Long', 50, N'Bao', 75000, 3750000, N'DA04')
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'VL02', N'Cát', N'Công ty cát Hà Linh', 3, N'm^3', 500000, 1500000, N'DA04')
INSERT [dbo].[QLNguyenVatLieu] ([IDNVL], [TenNVL], [NoiCungCap], [SoLuongSP], [DonViTinh], [DonGia], [TongTien], [IDDA]) VALUES (N'VL03', N'Đá', N'cty đá', 3, N'Tấn', 3000000, 9000000, N'DA04')
GO
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV01', N'Trần Thị Huyền', N'0762581052 ', N'Nữ', N'CV03', N'huyen@gmail.com', N'quan 1')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV02', N'Lê Anh Tâm', N'0936183182 ', N'Nam', N'CV01', N'king@gmail.com', N'quan 2')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV03', N'Nguyễn Phương Thảo', N'0982731132 ', N'Nữ', N'CV03', N'kingnguyen2710@gmail.com', N'quan 3')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV04', N'Ngô Hoàng Lan', N'0131241342 ', N'Nam', N'CV03', N'lan@gmail.com', N'quan Bình Thạnh')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV05', N'Đoàn Tấn Phát', N'0963562342 ', N'Nữ', N'CV03', N'kingnguyen2710@gmail.com', N'quan 11')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV06', N'Nguyễn Trường Đạt', N'0963562342 ', N'Nam', N'CV03', N'dat@gmail.com', N'quan 9')
INSERT [dbo].[QLNhanVien] ([IDNV], [HoTen], [SDT], [GioiTinh], [IDCV], [Email], [DiaChi]) VALUES (N'NV07', N'Phan Công Hậu', N'0876213242 ', N'Nữ', N'CV03', N'kingnguyen2710@gmail.com', N'quan Go Vap')
GO
INSERT [dbo].[QLPhanCong] ([IDDA], [IDNV], [NgayNhan], [TienDo]) VALUES (N'DA01', N'NV03', N'22/12/2012', N'Hoàn thành')
INSERT [dbo].[QLPhanCong] ([IDDA], [IDNV], [NgayNhan], [TienDo]) VALUES (N'DA02', N'NV02', N'22/12/2021', N'Hoàn thành')
INSERT [dbo].[QLPhanCong] ([IDDA], [IDNV], [NgayNhan], [TienDo]) VALUES (N'DA03', N'NV03', N'22/12/2021', N'Đang tiến hành')
INSERT [dbo].[QLPhanCong] ([IDDA], [IDNV], [NgayNhan], [TienDo]) VALUES (N'DA07', N'NV01', N'15/06/2022', N'Đang tiến hành')
INSERT [dbo].[QLPhanCong] ([IDDA], [IDNV], [NgayNhan], [TienDo]) VALUES (N'DA04', N'NV07', N'15/06/2022', N'Đang tiến hành')
GO
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH01', N'Hung', N'Nam', N'0213131312', N'Dong Nai')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH02', N'Ngan', N'Nữ', N'0213131313', N'Binh Duong')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH03', N'Dat', N'Nữ', N'0916636163', N'Lam Dong')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH04', N'Hoang', N'Nam', N'0728621553', N'Da Lat')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH05', N'An', N'Nam', N'0728621553', N'Soc Trang')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH06', N'Duy', N'Nữ', N'0362773424', N'Ho Chi Minh')
INSERT [dbo].[QLThongTinKH] ([IDKH], [HoTenKH], [GioiTinh], [SDT], [DiaChi]) VALUES (N'KH07', N'Hau', N'Nam', N'0312313434', N'Ho Chi Minh')
GO
INSERT [dbo].[TaiKhoanAD] ([TenTK], [MatKhau]) VALUES (N'tuan', N'Tuan@123')
GO
INSERT [dbo].[TaiKhoanNV] ([TenTaiKhoan], [MatKhau], [IDNV], [saltvalue]) VALUES (N'hau', N'fTjLhbYHmSeshtZnW0t9KSmw5xjfosL7KCaKiv3EG/g=', N'NV07', N'70cFr4vjZtVVBRx7r18bOjRuLeJzEp')
INSERT [dbo].[TaiKhoanNV] ([TenTaiKhoan], [MatKhau], [IDNV], [saltvalue]) VALUES (N'HUYEN', N'IOXdEiHFwxTtWYbgB4d6elt5t3z4RF58qXhR41POQmA=', N'NV01', N'6slGp2H3q3Ddzw6zYmjaATBM0GyM8o')
INSERT [dbo].[TaiKhoanNV] ([TenTaiKhoan], [MatKhau], [IDNV], [saltvalue]) VALUES (N'phat', N'7LVPMmV+TW6Fg//KmG1Qc4h0rAyRs8Vo8hy3I2nJ1IA=', N'NV05', N'BF8QTVEt4TfwDpILF2TiIW7Tl0hC79')
INSERT [dbo].[TaiKhoanNV] ([TenTaiKhoan], [MatKhau], [IDNV], [saltvalue]) VALUES (N'THAO', N'jITgfH6L99SOSbizjyKAioIWG0taeNAAImmXECQ3eWc=', N'NV03', N'0nvLJE8lSTPxSZYT2m7sFuslUEkLXs')
GO
INSERT [dbo].[Thuong] ([DieuKien], [MucThuong]) VALUES (N'Không có', 0)
INSERT [dbo].[Thuong] ([DieuKien], [MucThuong]) VALUES (N'Làm ít nhất 30 ngày', 0.03)
INSERT [dbo].[Thuong] ([DieuKien], [MucThuong]) VALUES (N'Làm ít nhất 100 ngày', 0.06)
INSERT [dbo].[Thuong] ([DieuKien], [MucThuong]) VALUES (N'Làm ít nhất 200 ngày', 0.1)
GO
ALTER TABLE [dbo].[ChiTietCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietCongNhan_DuAn] FOREIGN KEY([IDDA])
REFERENCES [dbo].[DuAn] ([IDDA])
GO
ALTER TABLE [dbo].[ChiTietCongNhan] CHECK CONSTRAINT [FK_ChiTietCongNhan_DuAn]
GO
ALTER TABLE [dbo].[ChiTietCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietCongNhan_QLCongNhan] FOREIGN KEY([IDCN])
REFERENCES [dbo].[QLCongNhan] ([IDCN])
GO
ALTER TABLE [dbo].[ChiTietCongNhan] CHECK CONSTRAINT [FK_ChiTietCongNhan_QLCongNhan]
GO
ALTER TABLE [dbo].[DuAn]  WITH CHECK ADD  CONSTRAINT [FK_DuAn_QLThongTinKH] FOREIGN KEY([IDKH])
REFERENCES [dbo].[QLThongTinKH] ([IDKH])
GO
ALTER TABLE [dbo].[DuAn] CHECK CONSTRAINT [FK_DuAn_QLThongTinKH]
GO
ALTER TABLE [dbo].[PhiPhatSinh]  WITH CHECK ADD  CONSTRAINT [FK_PhiPhatSinh_DuAn] FOREIGN KEY([IDDA])
REFERENCES [dbo].[DuAn] ([IDDA])
GO
ALTER TABLE [dbo].[PhiPhatSinh] CHECK CONSTRAINT [FK_PhiPhatSinh_DuAn]
GO
ALTER TABLE [dbo].[QLCongNhan]  WITH CHECK ADD  CONSTRAINT [FK_QLCongNhan_ChucVuCongNhan] FOREIGN KEY([IDCVCN])
REFERENCES [dbo].[ChucVuCongNhan] ([IDCVCN])
GO
ALTER TABLE [dbo].[QLCongNhan] CHECK CONSTRAINT [FK_QLCongNhan_ChucVuCongNhan]
GO
ALTER TABLE [dbo].[QLNguyenVatLieu]  WITH CHECK ADD  CONSTRAINT [FK_QLNguyenVatLieu_DuAn] FOREIGN KEY([IDDA])
REFERENCES [dbo].[DuAn] ([IDDA])
GO
ALTER TABLE [dbo].[QLNguyenVatLieu] CHECK CONSTRAINT [FK_QLNguyenVatLieu_DuAn]
GO
ALTER TABLE [dbo].[QLNhanVien]  WITH CHECK ADD  CONSTRAINT [FK_QLNhanVien_ChucVu] FOREIGN KEY([IDCV])
REFERENCES [dbo].[ChucVu] ([IDCV])
GO
ALTER TABLE [dbo].[QLNhanVien] CHECK CONSTRAINT [FK_QLNhanVien_ChucVu]
GO
ALTER TABLE [dbo].[QLPhanCong]  WITH CHECK ADD  CONSTRAINT [FK_QLPhanCong_DuAn] FOREIGN KEY([IDDA])
REFERENCES [dbo].[DuAn] ([IDDA])
GO
ALTER TABLE [dbo].[QLPhanCong] CHECK CONSTRAINT [FK_QLPhanCong_DuAn]
GO
ALTER TABLE [dbo].[QLPhanCong]  WITH CHECK ADD  CONSTRAINT [FK_QLPhanCong_QLNhanVien1] FOREIGN KEY([IDNV])
REFERENCES [dbo].[QLNhanVien] ([IDNV])
GO
ALTER TABLE [dbo].[QLPhanCong] CHECK CONSTRAINT [FK_QLPhanCong_QLNhanVien1]
GO
ALTER TABLE [dbo].[TaiKhoanNV]  WITH CHECK ADD  CONSTRAINT [FK_TaiKhoanNV_QLNhanVien] FOREIGN KEY([IDNV])
REFERENCES [dbo].[QLNhanVien] ([IDNV])
GO
ALTER TABLE [dbo].[TaiKhoanNV] CHECK CONSTRAINT [FK_TaiKhoanNV_QLNhanVien]
GO
