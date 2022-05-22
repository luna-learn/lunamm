package org.luna.learn.metadata.jdbc;

import org.luna.learn.metadata.*;
import org.luna.learn.metadata.entity.Column;
import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metadata.entity.Function;
import org.luna.learn.metadata.entity.Table;

import java.sql.DatabaseMetaData;
import java.util.List;

/**
 * Jdbc Metadata
 * @author Liu Yang
 * @date 2022/5/19 12:23
 */
public class JdbcMetadata extends AbstractMetadata {

    private DatabaseMetaData databaseMetaData;

    private JdbcDialect dialect;

    @Override
    public String identified() {
        return null;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public List<Database> listDatabase() {
        // databaseMetaData.getCatalogs()
        return null;
    }

    @Override
    public List<Table> listTables() {
        // databaseMetaData.getTables(null, null, null, new String[] {"TABLE"});
        return null;
    }

    @Override
    public List<Table> listViews() {
        // databaseMetaData.getTables(null, null, null, new String[] {"view"});
        return null;
    }

    @Override
    public List<Column> listColumns() {
        // databaseMetaData.getColumns(null, null, null, null);
        return null;
    }

    @Override
    public List<Function> listFunctions() {
        // databaseMetaData.getFunctions()
        return null;
    }

    @Override
    public void createDatabase(Database database) {

    }

    @Override
    public void createTable(Table table) {

    }

    @Override
    public void createView(Table view) {

    }

    @Override
    public void createFunction(Function function) {

    }

    @Override
    public void dropDatabase(Database database) {

    }

    @Override
    public void dropTable(Table table) {

    }

    @Override
    public void dropView(Table view) {

    }

    @Override
    public void dropFunction(Function function) {

    }

    @Override
    public void alterTable(Table oldTable, Table newTable) {

    }

    @Override
    public void alterColumn(Column oldColumn, Column newColumn) {

    }
}
