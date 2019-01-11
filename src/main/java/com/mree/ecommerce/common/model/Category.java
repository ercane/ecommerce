package com.mree.ecommerce.common.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Category {
    private String title;
    private List<Category> childList;

    public Category(String title) {
        this.title = title;
        childList = new ArrayList<Category>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Category> getChildList() {
        return childList;
    }

    public void setChildList(List<Category> childList) {
        this.childList = childList;
    }

    public void addChildCategory(Category... child) {
        childList.addAll(Arrays.asList(child));
    }
}
