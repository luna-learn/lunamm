package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Table
 * @author Liu Yang
 * @date 2022/5/19 8:43
 */
public class Table extends Property {
    private int id;
    private String name;
    private String comment;
    // 表类型
    // 0=TABLE (实体表)
    // 1=VIEW (视图)
    // 2=TEMPORARY TABLE (临时表)
    // 3=MATERIALIZED VIEW (物化视图)
    private int tableType;
    private LocalDateTime createTime;
    private LocalDateTime updateTIme;
    // 主键, 字段类型不能为复合型, 且必须在 columns
    @JsonIgnore private List<Column> primaryKeys;
    // 分区键, 必须为源映射字段, 且不在 columns
    @JsonIgnore private List<Column> partitionKeys;
    // 表的生命周期
    @JsonIgnore private int ttl;
    // 别名，一般情况下等同于 name
    // 在进行 直接映射、关联映射时，可以使用别名对表进行区别
    @JsonIgnore private String alias;
    // 所属数据库
    @JsonIgnore private Database database;
    // 字段列表
    @JsonIgnore private List<Column> columns;
    // 表映射类型: 0=源映射,1=直接映射,2=关联映射
    // 源映射是指该表是源表
    // 直接映射是指该表从某表直接映射 (=parentTables[0] && conditions)
    // 关联映射是指多张表进行关联映射的结果 (=parentTables[-] && joinExpr && conditions)
    @JsonIgnore private int mappingType;
    // 相关的父级表
    @JsonIgnore private List<Table> parentTables;
    // 相关的子级表
    @JsonIgnore private List<Table> childrenTables;
    // Join 表达式, Join 的表必须在 parentTables
    @JsonIgnore private List<Join> joins;
    // 条件表达式, 多条件之间使用 AND 连接
    // 条件表达式的表必须在 parentTables
    @JsonIgnore private List<Condition> conditions;
}
