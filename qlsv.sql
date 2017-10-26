USE [QuanLySinhVien]
GO
/****** Object:  Table [dbo].[SINHVIEN]    Script Date: 9/17/2017 11:14:32 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SINHVIEN](
	[ID] [nvarchar](10) NOT NULL,
	[Avatar] [nvarchar](max) NULL,
	[FullName] [nvarchar](50) NULL,
	[NationalID] [nvarchar](9) NULL,
	[Birthday] [smalldatetime] NULL,
	[Address] [nvarchar](max) NULL,
	[Phone] [nvarchar](12) NULL,
 CONSTRAINT [PK_SINHVIEN] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
INSERT [dbo].[SINHVIEN] ([ID], [Avatar], [FullName], [NationalID], [Birthday], [Address], [Phone]) VALUES (N'2121117317', N'...', N'Nguyễn Anh Nguyên', N'...', CAST(N'1997-09-19 00:00:00' AS SmallDateTime), N'...', N'...')
