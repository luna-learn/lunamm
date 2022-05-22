package org.luna.learn.metadata;

import org.luna.learn.metadata.entity.Column;
import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metadata.entity.Function;
import org.luna.learn.metadata.entity.Table;

/**
 * Dialect
 *
 * @author Liu Yang
 * @date 2022/5/19 13:22
 */
public interface Dialect {

    String name();

    String limitCause(long offset, long limit);

    default String quoteIdentifier(String identifier) {
        return "``" + identifier + "``";
    }

    String ddl(Column column);

    String ddl(Database database);

    String ddl(Table table);

    String ddl(Function function);

    String dql(Column column);

    String dql(Table table);

    default String drop(Database database) {
        return null;
    };

    default String drop(Table table) {
        return null;
    };

    default String drop(Column column) {
        return null;
    };

    default String drop(Function table) {
        return null;
    };

    default String alter(Database oldDatabase, Database newDatabase) {
        return null;
    };

    default String alter(Table oldTable, Table newTable) {
        return null;
    };

    default String alter(Column oldColumn, Column newColumn) {
        return null;
    };

    default String alter(Function oldFunction, Function newFunction) {
        return null;
    };

}
