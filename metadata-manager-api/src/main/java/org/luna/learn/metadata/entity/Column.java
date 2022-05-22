package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Column
 * @author Liu Yang
 * @date 2022/5/19 8:53
 */
public class Column {
    private int id;
    private String columnName;
    private String columnComment;
    // 字段类型
    private int columnType; // VARCHAR, INT, BIGINT ......
    private int precision;
    private int scale;
    private boolean primary = false;
    private boolean nullable = true;
    // 默认值文本。如: ’abcde', '1', 1.00, '2022-01-01', '00:00:01' 等等
    // 通过 columnType 将 defaultValue 反序列化为对像
    private String defaultValue;
    private LocalDateTime createTime;
    private LocalDateTime updateTIme;
    // 标签，即字段显示的真实字段名称，一般情况下等同于 name
    // 如果在 直接映射、关联映射、函数映射 中出现同名字段，可以使用 label 对字段进行重命名加以区别
    @JsonIgnore private String label;
    // 所属表
    @JsonIgnore private Table table;
    // 字段映射类型: 0=源映射,1=直接映射,2=关联映射,3=函数映射
    // 源映射表示该字段是源字段，无需任何映射
    // 直接映射表示单表字段直接映射 (=expr in table.columns)
    // 关联映射表示多表关联直接映射 (=expr in table.joinTables[-].columns)
    // 函数映射表示需要函数转换取值 (=func(funcParam))
    @JsonIgnore private int mappingType;
    // 字段表达式。如源字段
    @JsonIgnore private Column expr;
    @JsonIgnore private Function func;
    // funcParam 字段类型要与 func 的 parameterTypes 声明的一致
    @JsonIgnore private List<Column> funcParam;

    public static Column of(String name, String comment) {
        return null;
    }

}
