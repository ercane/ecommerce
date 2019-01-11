package com.mree.ecommerce.common.model;

import com.mree.ecommerce.common.ref.DiscountType;

public class Coupon {
    private Double minLimit;
    private Integer discount;
    private DiscountType type;

    public Double getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(Double minLimit) {
        this.minLimit = minLimit;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public DiscountType getType() {
        return type;
    }

    public void setType(DiscountType type) {
        this.type = type;
    }
}
