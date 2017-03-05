package com.rule.entity;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by stone on 17-2-6.
 */
public class Page<T> {
    private long totalPage;
    private long currentPage;
    private long navPre;
    private long navNext;
    private long pageSize;
    private List<T> data;

    public Page(List<T> data) {
        this.data = data;

        PageInfo pageInfo = new PageInfo(data);
        this.totalPage = pageInfo.getPages();
        this.currentPage = pageInfo.getPageNum();
        this.pageSize = pageInfo.getPageSize();
        this.navPre = pageInfo.getNavigateFirstPage();
        this.navNext = pageInfo.getNavigateLastPage();
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(long currentPage) {
        this.currentPage = currentPage;
    }

    public long getNavPre() {
        return navPre;
    }

    public void setNavPre(long navPre) {
        this.navPre = navPre;
    }

    public long getNavNext() {
        return navNext;
    }

    public void setNavNext(long navNext) {
        this.navNext = navNext;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
