package org.luna.learn.metamanager.service;

import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metamanager.mapper.meta.CatalogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Liu Yang
 * @date 2022/5/19 13:43
 */
@Service
public class CatalogService {

    @Autowired private CatalogMapper mapper;

    public List<Database> listDatabase() {
        return mapper.listDatabase();
    }


}
