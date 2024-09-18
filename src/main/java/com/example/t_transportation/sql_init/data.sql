/*
 管理员表
 */
IF OBJECT_ID('admin', 'U') IS NOT NULL
    DROP TABLE admin;

CREATE TABLE [dbo].[admin](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[addtime] [smalldatetime] NULL,
	[zhanghao] [nchar](20) NULL,
	[user_pic] varchar(128) NULL ,
	[mima] [nchar](20) NULL
 CONSTRAINT [PK_admin] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

INSERT INTO admin(addtime, zhanghao, mima) VALUES ('2024-07-27 14:47:45','','123456')
