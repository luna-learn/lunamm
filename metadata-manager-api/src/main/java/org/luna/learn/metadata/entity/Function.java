package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Function
 * 函数可以同名，对于同名函数，要求有不同的参数表达式或返回值类型
 * @author Liu Yang
 * @date 2022/5/19 10:27
 */
public class Function extends Property{
    private int id;
    private String name;
    private String comment;
    // 函数声明体
    private String statement;
    // 函数类型: 0=Build-in, 1=User-defined
    private int functionType;
    // 函数返回值类型, 等同于 ColumnType
    private int resultType;
    // 函数参数声明，如: {a: INT, b: VARCHAR, c: DATETIME}
    private String parameterTypes;
    private LocalDateTime createTime;
    private LocalDateTime updateTIme;
    // 函数参数表, 从 parameterTypes 中解析
    @JsonIgnore private List<Parameter> parameters;

}
