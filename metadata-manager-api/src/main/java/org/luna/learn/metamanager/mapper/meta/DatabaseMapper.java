package org.luna.learn.metamanager.mapper.meta;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.luna.learn.metadata.entity.Database;

import java.util.List;

/**
 * Database Mapper
 * @author Liu Yang
 * @date 2022/5/21 21:11
 */
@Mapper
public interface DatabaseMapper {

    @Select(value = "select * from t_app_database")
    List<Database> findAll();
}
