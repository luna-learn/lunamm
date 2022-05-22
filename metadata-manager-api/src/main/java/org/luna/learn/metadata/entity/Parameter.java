package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Liu Yang
 * @date 2022/5/19 10:34
 */
public class Parameter {
    private int id;
    private String name;
    // 参数类型, 等同于 ColumnType
    private int parameterType;
    // 默认值
    private String defaultValue;
    // 所属函数
    @JsonIgnore private Function function;
}
