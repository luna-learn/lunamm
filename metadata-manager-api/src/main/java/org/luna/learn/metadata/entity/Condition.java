package org.luna.learn.metadata.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liu Yang
 * @date 2022/5/19 9:43
 */
public class Condition {
    // 第一表达式必须为单个字段
    private Column expr1;
    // 第二表达式可以为多个字段，但对于特定的逻辑条件表达式，会匹配不同字段个数
    // 对于一些不逻辑表达式，可能不需要第二表达式
    private List<Column> expr2;
    // 第三表达多是子条件表达式, 多条件之间使用 AND 连接
    private List<Condition> expr3;
    // ==,<>,<,>,<=,>=,IS NOT NULL,IS NULL,IN,NOT,AND,OR
    // ==,<>,<,>,<=,>= 要求 expr1 和 expr2[0]
    // IS NOT NULL,IS NULL 要求 expr1
    // IN 要求 expr1 和 expr2[-]
    // NOT,AND,OR 要求 expr3
    private int compareType;
    // public String toString() {}

    private Condition() {

    }

    public static Condition and(Condition... expressions) {
        Condition expr = new Condition();
        expr.expr3 = new ArrayList<>();
        expr.expr3.addAll(Arrays.asList(expressions));
        expr.compareType = 3231; // AND
        return expr;
    };

    public static Condition or(Condition... expressions) {
        Condition expr = new Condition();
        expr.expr3 = new ArrayList<>();
        expr.expr3.addAll(Arrays.asList(expressions));
        expr.compareType = 3232; // OR
        return expr;
    };

    public static Condition not(Condition expression) {
        Condition expr = new Condition();
        expr.expr3 = new ArrayList<>();
        expr.expr3.add(expression);
        expr.compareType = 3233; // NOT
        return expr;
    };

    public static Condition of(int compareType, Column c1, Column... c2) {
        // 判断 compareType 非 NOT,AND,OR 并抛出异常
        Condition expr = new Condition();
        expr.expr1 = c1;
        if (c2 != null) {
            expr.expr2 = new ArrayList<>();
            expr.expr2.addAll(Arrays.asList(c2));
        }
        expr.compareType = compareType;
        return expr;
    };

    public static Condition eq(Column c1, Column c2) {
        return null;
    }

    public static Condition neq(Column c1, Column c2) {
        return null;
    }

    public static Condition lt(Column c1, Column c2) {
        return null;
    }

    public static Condition gt(Column c1, Column c2) {
        return null;
    }

    public static Condition lte(Column c1, Column c2) {
        return null;
    }

    public static Condition gte(Column c1, Column c2) {
        return null;
    }

    public static Condition isNull(Column c1) {
        return null;
    }

    public static Condition isNotNull(Column c1) {
        return null;
    }

    public static Condition in(Column c1, Column... c2) {
        return null;
    }

}
