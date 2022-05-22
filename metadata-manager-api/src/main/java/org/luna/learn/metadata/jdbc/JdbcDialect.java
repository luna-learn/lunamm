package org.luna.learn.metadata.jdbc;

import org.luna.learn.metadata.*;
import org.luna.learn.metadata.entity.Column;
import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metadata.entity.Function;
import org.luna.learn.metadata.entity.Table;

/**
 * Jdbc Dialect
 * @author Liu Yang
 * @date 2022/5/19 13:32
 */
public class JdbcDialect implements Dialect {

    private static final int MAX_TIMESTAMP_PRECISION = 6;
    private static final int MIN_TIMESTAMP_PRECISION = 1;

    private static final int MAX_DECIMAL_PRECISION = 65;
    private static final int MIN_DECIMAL_PRECISION = 1;

    private String driverName;

    public JdbcDialect() {

    }

    public String getDriverName() {
        return null;
    }

    public boolean canHandle(String url) {
        return url.startsWith("jdbc:");
    }


    @Override
    public String name() {
        return "Jdbc Dialect";
    }

    @Override
    public String limitCause(long offset, long limit) {
        return null;
    }

    @Override
    public String ddl(Column column) {
        return null;
    }

    @Override
    public String ddl(Database database) {
        return null;
    }

    @Override
    public String ddl(Table table) {
        return null;
    }

    @Override
    public String ddl(Function function) {
        return null;
    }

    @Override
    public String dql(Column column) {
        return null;
    }

    @Override
    public String dql(Table table) {
        return null;
    }
}
