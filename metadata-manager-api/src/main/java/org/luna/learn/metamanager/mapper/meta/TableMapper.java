package org.luna.learn.metamanager.mapper.meta;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.luna.learn.metadata.entity.Table;

import java.util.List;

/**
 * Table Mapper
 * @author Liu Yang
 * @date 2022/5/22 8:02
 */
@Mapper
public interface TableMapper {
    @Select(value = "select * from t_app_table")
    List<Table> findAll();
}
