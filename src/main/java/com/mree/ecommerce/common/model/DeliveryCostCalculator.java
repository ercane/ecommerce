package com.mree.ecommerce.common.model;

public class DeliveryCostCalculator {
    private Double costPerDelivery;
    private Double costPerProduct;
    private Double fixedCost;

    public DeliveryCostCalculator(Double costPerDelivery, Double costPerProduct, Double fixedCost) {
        this.costPerDelivery = costPerDelivery;
        this.costPerProduct = costPerProduct;
        this.fixedCost = fixedCost;
    }

    public Double calculate(ShoppingCart cart) {
        return 0.0;
    }

    public Double getCostPerDelivery() {
        return costPerDelivery;
    }

    public void setCostPerDelivery(Double costPerDelivery) {
        this.costPerDelivery = costPerDelivery;
    }

    public Double getCostPerProduct() {
        return costPerProduct;
    }

    public void setCostPerProduct(Double costPerProduct) {
        this.costPerProduct = costPerProduct;
    }

    public Double getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(Double fixedCost) {
        this.fixedCost = fixedCost;
    }
}
