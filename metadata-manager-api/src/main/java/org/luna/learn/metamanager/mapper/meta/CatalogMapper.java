package org.luna.learn.metamanager.mapper.meta;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.luna.learn.metadata.entity.Catalog;

import java.util.List;

/**
 * Catalog Mapper
 * @author Liu Yang
 * @date 2022/5/19 9:12
 */
@Mapper
public interface CatalogMapper {
    @Select(value = "select * from t_app_catalog")
    List<Catalog> findAll();

    /*@Select(value = "select * from t_app_database")
    List<Database> listDatabase();

    @Select(value = "select * from t_app_tables where table_type = 0")
    List<Table> listTables();

    @Select(value = "select * from t_app_tables where table_type = 1")
    List<Table> listViews();

    @Select(value = "select * from t_app_column where table_id = '${tableId}'")
    List<Column> listColumns(String tableId);

    @Select(value = "select * from t_app_function")
    List<Function> listFunctions();*/



}
