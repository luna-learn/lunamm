package org.luna.learn.metamanager.controller;

import org.luna.learn.metadata.entity.Database;
import org.luna.learn.metamanager.entity.PageResult;
import org.luna.learn.metamanager.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Catalog Controller
 * @author Liu Yang
 * @date 2022/5/19 8:42
 */
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired private CatalogService catalog;

    @RequestMapping("/database/list")
    public PageResult<Database> listDatabases() {
        //Pageable pageable = PageRequest.of(1, 10);
        //List<Database> content = new ArrayList<>();
        //content.add(new Database(1, "db1", "database1", "xxx"));
        //content.add(new Database(2, "db2", "database2", "xxx"));
        //return PageResult.of(content, 10, 1, 10);
        List<Database> content = catalog.listDatabase();
        return PageResult.of(content, 10, 1, 10);

    }
}
