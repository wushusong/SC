package com.mywork.sc.entity;

import java.util.List;

public class Category {
    private Integer cid;

    private String ctitle;

    private Integer parentId;

    private List<Category> subCategory;

    private String ctitle2;

    public String getCtitle2() {
        return ctitle2;
    }



    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle;
        this.ctitle2 = ctitle+".do";
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Category> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<Category> subCategory) {
        this.subCategory = subCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cid=" + cid +
                ", ctitle='" + ctitle + '\'' +
                ", parentId=" + parentId +
                ", subCategory=" + subCategory +
                '}';
    }
}