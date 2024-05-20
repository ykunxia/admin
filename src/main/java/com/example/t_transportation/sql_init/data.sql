/*
 管理员表
 */
IF OBJECT_ID('admin', 'U') IS NOT NULL
    DROP TABLE admin;

CREATE TABLE [dbo].[admin](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[addtime] [smalldatetime] NULL,
	[zhanghao] [nchar](20) NULL,
	[mima] [nchar](20) NULL,
	[name] [nchar](10) NULL,
	[sex] [nchar](2) NULL,
	[phonenumber] [nchar](20) NULL,
	[identitynumber] [nchar](20) NULL
 CONSTRAINT [PK_admin] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

INSERT INTO admin(addtime, zhanghao, mima, name, sex, phonenumber, identitynumber) VALUES ('2023-07-27 14:47:45','张三','123456','张三','男','13823888881','440300199101010001'),('2022-07-27 14:47:45','李四','123456','李四','男','13823888882','440300199202020002')

/*
 产品信息表
 */
IF OBJECT_ID('product', 'U') IS NOT NULL
    DROP TABLE product;
CREATE TABLE [dbo].[product](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[product_name] [nchar](30) NULL,
	[quantity] [int] NULL,
	[material] [nchar](30) NULL

 CONSTRAINT [PK_product] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT INTO dbo.product(product_name, quantity,material) VALUES('红烧鱼',20,'鱼、油、盐、酱油、葱花'),('豆花',15,'豆腐、油、盐')

/*
 订单表
 */
IF OBJECT_ID('orders', 'U') IS NOT NULL
    DROP TABLE orders;
CREATE TABLE [dbo].[orders](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customers_name] [nchar](30) NULL,
	[product_name] [nchar](30) NULL,
	[order_amount] [int] NULL,
	[order_date] [nchar](100) NULL,
	[total_price] [decimal](10, 2) NULL
 CONSTRAINT [PK_orders] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT INTO orders(customers_name,product_name,order_amount,order_date, total_price) VALUES('张三','红烧鱼',20,'2023-07-27 ',200.34),('李四','豆花',3,'2023-07-27',70)


/*
 供应商表
 */
IF OBJECT_ID('suppliers', 'U') IS NOT NULL
    DROP TABLE suppliers;
CREATE TABLE [dbo].[suppliers](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[suppliers_name] [varchar](100) NULL,
	[materials_name] [varchar](100) NULL,
	[materials_totalprice] [decimal](10, 2) NULL,
	[contact] [varchar](100) NULL,
	[email] [varchar](100) NULL
 CONSTRAINT [PK_suppliers] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT INTO suppliers(suppliers_name,materials_name,materials_totalprice, contact, email) VALUES ('老娘舅','大米','1938','128373322','2837139@ancle.com'),('稻花香','盐','234','287461613','37631439@mi.com')

/*
 客户表
 */
IF OBJECT_ID('customers', 'U') IS NOT NULL
    DROP TABLE customers;
CREATE TABLE [dbo].[customers](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[customers_name] [varchar](100) NULL,
	[contact] [varchar](100) NULL,
	[email] [varchar](100) NULL
 CONSTRAINT [PK_customers] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT INTO customers(customers_name,contact, email) VALUES ('小雨','128373322','2837139@san.com'),('小明','287461613','37631439@si.com')

/*
 材料进货表（数量以kg为单位）
 */
IF OBJECT_ID('materials', 'U') IS NOT NULL
    DROP TABLE materials;
 CREATE TABLE [dbo].[materials](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[materials_name] [varchar](100) NULL,
	[quantity] [int] NULL,
    [suppliers_name] [varchar](100) NULL

        CONSTRAINT [PK_materials] PRIMARY KEY CLUSTERED
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
INSERT INTO materials(materials_name, quantity, suppliers_name) VALUES ('大米',587,'老娘舅'),('盐',32,'小米')