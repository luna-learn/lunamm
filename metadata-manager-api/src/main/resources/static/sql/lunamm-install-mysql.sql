-- 初始化数据库
CREATE DATABASE IF NOT EXISTS lunamm;

DROP TABLE IF EXISTS t_app_hierarchy;
CREATE TABLE IF NOT EXISTS t_app_hierarchy
(
  id           VARCHAR(100) NOT NULL COMMENT '层级标识',
  name         VARCHAR(200) COMMENT '名称',
  comment      VARCHAR(200) COMMENT '备注',
  parent_id    VARCHAR(100) COMMENT '父层级标识',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '层级'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_catalog;
CREATE TABLE IF NOT EXISTS t_app_catalog
(
  id           VARCHAR(100) NOT NULL COMMENT '目录标识',
  name         VARCHAR(200) COMMENT '名称',
  comment      VARCHAR(200) COMMENT '备注',
  hierarchy_id VARCHAR(100) COMMENT '所属层级',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '目录'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_database;
CREATE TABLE IF NOT EXISTS t_app_database
(
  id           VARCHAR(100) NOT NULL COMMENT '数据库或模式标识',
  name         VARCHAR(200) COMMENT '名称',
  comment      VARCHAR(200) COMMENT '备注',
  catalog_id   VARCHAR(100) COMMENT '所属目录',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '目录'
ENGINE = INNODB;


DROP TABLE IF EXISTS t_app_table;
CREATE TABLE IF NOT EXISTS t_app_table
(
  id           VARCHAR(100) NOT NULL COMMENT '表标识',
  name         VARCHAR(200) COMMENT '名称',
  comment      VARCHAR(200) COMMENT '备注',
  database_id  VARCHAR(100) COMMENT '所属数据库或模式标识',
  table_type   INT          COMMENT '表类型',
  mapping_type INT          COMMENT '表映射类型',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '表'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_column;
CREATE TABLE IF NOT EXISTS t_app_column
(
  `id`             VARCHAR(100) NOT NULL COMMENT '字段标识',
  `column_name`    VARCHAR(200) COMMENT '字段名称',
  `column_comment` VARCHAR(200) COMMENT '字段备注',
  `data_type`      INT          COMMENT '数据类型',
  `precision`      INT          COMMENT '精度',
  `scale`          INT          COMMENT '尺度',
  `nullable`       INT          COMMENT '可空',
  `default_value`  VARCHAR(200) COMMENT '默认值表达式',
  `mapping_type`   INT          COMMENT '字段映射类型',
  `table_id`       VARCHAR(100) COMMENT '所属表标识',
  `create_time`    TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  `update_time`    TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (`id`)
) COMMENT = '字段'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_table_mapping;
CREATE TABLE IF NOT EXISTS t_app_table_mapping
(
  id           VARCHAR(100) NOT NULL COMMENT '表映射标识',
  f_table_id   VARCHAR(100) COMMENT '第一表标识',
  s_table_id   VARCHAR(100) COMMENT '第二表标识',
  relate_mode  INT          COMMENT '关联模式(origin,union,join,cross)',
  parent_id    VARCHAR(100) COMMENT '父级表映射标识',
  table_id     VARCHAR(100) COMMENT '所属表标识',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '表映射'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_column_mapping;
CREATE TABLE IF NOT EXISTS t_app_column_mapping
(
  id           VARCHAR(100) NOT NULL COMMENT '字段映射标识',
  s_column_id  VARCHAR(100) COMMENT '源字段标识',
  relate_mode  INT          COMMENT '关联模式(直接,函数)',
  relate_func  VARCHAR(100) COMMENT '关联函数标识',
  relate_param VARCHAR(100) COMMENT '关联函数参数标识',
  parent_id    VARCHAR(100) COMMENT '父级字段映射标识',
  column_id    VARCHAR(100) COMMENT '所属字段标识',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '字段映射'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_condition;
CREATE TABLE IF NOT EXISTS t_app_condition
(
  id           VARCHAR(100) NOT NULL COMMENT '条件标识',
  expr1        VARCHAR(100) COMMENT '表达式1',
  expr2        VARCHAR(100) COMMENT '表达式2',
  parent_id    VARCHAR(100) COMMENT '父级标识',
  logic_type   INT          COMMENT '逻辑表达类型(=,<>,<,>,<=,>=)',
  mapping_id   VARCHAR(100) COMMENT '所属表映射标识',
  create_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time  TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id, mapping_id)
) COMMENT = '条件'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_function;
CREATE TABLE IF NOT EXISTS t_app_function
(
  id             VARCHAR(100)  NOT NULL COMMENT '函数标识',
  name           VARCHAR(100)  COMMENT '名称',
  comment        VARCHAR(100)  COMMENT '备注',
  return_type    INT           COMMENT '返回值类型',
  parameter_type VARCHAR(500)  COMMENT '参数表',
  statement      VARCHAR(2000) COMMENT '函数声明',
  create_time    TIMESTAMP(6)  DEFAULT CURRENT_TIMESTAMP(6),
  update_time    TIMESTAMP(6)  DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '函数'
ENGINE = INNODB;

DROP TABLE IF EXISTS t_app_function_parameter;
CREATE TABLE IF NOT EXISTS t_app_function_parameter
(
  id            VARCHAR(100) NOT NULL COMMENT '函数参数标识',
  name          VARCHAR(100) COMMENT '名称',
  comment       VARCHAR(100) COMMENT '备注',
  data_type     INT          COMMENT '返回值类型',
  default_value VARCHAR(500) COMMENT '默认值表达式',
  function_id   VARCHAR(100) COMMENT '所属函数标识',
  create_time   TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  update_time   TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6),
  PRIMARY KEY (id)
) COMMENT = '函数参数'
ENGINE = INNODB;