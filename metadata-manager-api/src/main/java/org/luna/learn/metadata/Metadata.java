package org.luna.learn.metadata;

import org.luna.learn.metadata.entity.Column;
import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metadata.entity.Function;
import org.luna.learn.metadata.entity.Table;

import java.util.List;

/**
 * @author Liu Yang
 * @date 2022/5/19 11:51
 */
public interface Metadata {

    List<Database> listDatabase();

    List<Table> listTables();

    List<Table> listViews();

    List<Column> listColumns();

    List<Function> listFunctions();

}
