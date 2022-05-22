package org.luna.learn.metadata;

import org.luna.learn.metadata.entity.Column;
import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metadata.entity.Function;
import org.luna.learn.metadata.entity.Table;

/**
 * @author Liu Yang
 * @date 2022/5/19 14:57
 */
public abstract class AbstractMetadata implements Metadata {

    public abstract String identified();

    public abstract Dialect getDialect();

    public abstract void createDatabase(Database database);

    public abstract void createTable(Table table);

    public abstract void createView(Table view);

    public abstract void createFunction(Function function);

    public abstract void dropDatabase(Database database);

    public abstract void dropTable(Table table);

    public abstract void dropView(Table view);

    public abstract void dropFunction(Function function);

    public abstract void alterTable(Table oldTable, Table newTable);

    public abstract void alterColumn(Column oldColumn, Column newColumn);
}
