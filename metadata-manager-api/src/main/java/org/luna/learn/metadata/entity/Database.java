package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Database
 * @author Liu Yang
 * @date 2022/5/18 13:33
 */
public class Database {
    private int id;
    private int catalogId;
    private String name;
    private String comment;
    private String owner;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    @JsonIgnore private Catalog catalog;
    @JsonIgnore private List<Table> tables;

    public Database(int id, int catalogId, String name, String comment, String owner, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.catalogId = catalogId;
        this.name = name;
        this.comment = comment;
        this.owner = owner;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getOwner() {
        return owner;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String desc) {
        this.comment = comment;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

}
