package org.luna.learn.metadata.entity;

import java.util.List;

/**
 * Dictionary
 * 字典表是一种特殊的源表
 * @author Liu Yang
 * @date 2022/5/19 16:43
 */
public class Dictionary {
    private int id;
    private String name;
    private String comment;
    private List<DictionaryItem> items;
}
