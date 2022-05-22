package org.luna.learn.metamanager.mapper.meta;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.luna.learn.metadata.entity.Column;

import java.util.List;

/**
 * Table Mapper
 * @author Liu Yang
 * @date 2022/5/22 8:02
 */
@Mapper
public interface ColumnMapper {
    @Select(value = "select * from t_app_column")
    List<Column> findAll();

    @Select(value = "select * from t_app_column where table_id=#{table_id}")
    List<Column> findAllByTableId(String tableId);
}
