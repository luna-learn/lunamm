package org.luna.learn.metamanager.entity;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Page Result
 * @author Liu Yang
 * @date 2022/5/18 14:52
 */
public class PageResult <T> {

    private final List<T> content;
    private final long total;
    private final int pageNumber;
    private final int pageSize;
    private final Sort sort;

    public PageResult(List<T> content, long total, int pageNumber, int pageSize, Sort sort) {
        this.content = content;
        this.total = total;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = sort;
    }

    public PageResult(List<T> content, long total, Pageable pageable) {
        this.content = content;
        this.total = total;
        this.pageNumber = pageable.getPageNumber();
        this.pageSize = pageable.getPageSize();
        this.sort = pageable.getSort();
    }

    public long getTotal() {
        return total;
    }

    public int getTotalPages() {
        return (int) (total / pageSize);
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public List<T> getContent() {
        return content;
    }

    public Sort getSort() {
        return sort;
    }

    public static <T> PageResult<T> of(List<T> content, long total, int pageNumber, int pageSize) {
        return new PageResult<>(content, total, pageNumber, pageSize,null);
    }

    public static <T> PageResult<T> of(List<T> content, long total, int pageNumber, int pageSize, Sort sort) {
        return new PageResult<>(content, total, pageNumber, pageSize, sort);
    }

    public static <T> PageResult<T> of(List<T> content, Pageable pageable, int total) {
        return new PageResult<>(content,  total, pageable);
    }

    public static <T> PageResult<T> of(List<T> content) {
        int pageSize = content != null ? content.size() : 0;
        return new PageResult<>(content, pageSize, 1, pageSize, null);
    }

    public static <T> PageResult<T> of(List<T> content, Sort sort) {
        int pageSize = content != null ? content.size() : 0;
        return new PageResult<>(content, pageSize,1, pageSize,  sort);
    }
}
