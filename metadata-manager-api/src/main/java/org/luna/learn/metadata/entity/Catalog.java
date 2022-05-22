package org.luna.learn.metadata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.luna.learn.metadata.Metadata;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Catalog
 *
 * @author Liu Yang
 * @date 2022/5/19 8:54
 */
public class Catalog extends Property {
    private int id;
    private String name;
    private String comment;
    private String namespace;
    private String owner;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 元数据服务
    @JsonIgnore private Metadata metadata;
    // 数据库列表
    @JsonIgnore private final List<Database> databases = new ArrayList<>();

    public Catalog(int id, String name, String comment, String owner, LocalDateTime createTime, LocalDateTime updateTime) {
        this.id = id;
        this.name = name;
        this.comment = comment;
        this.owner = owner;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public int getId() {
        return id;
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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setComment(String comment) {
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
}
