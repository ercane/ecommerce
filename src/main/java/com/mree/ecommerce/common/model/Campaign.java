package com.mree.ecommerce.common.model;

import com.mree.ecommerce.common.ref.DiscountType;

public class Campaign {
    private Category category;
    private Double value;
    private Integer count;
    private DiscountType type;

    public Campaign(Category category, Double value, Integer count, DiscountType type) {
        this.category = category;
        this.value = value;
        this.count = count;
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public DiscountType getType() {
        return type;
    }

    public void setType(DiscountType type) {
        this.type = type;
    }
}
