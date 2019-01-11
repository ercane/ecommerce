package com.mree.ecommerce.common.model;

import java.security.spec.InvalidParameterSpecException;
import java.util.*;

public class ShoppingCart {
    private Map<Product, Integer> productMap;
    private Map<Category, List<Product>> categoryMap;
    private List<Campaign> campaignList;
    private Map<Campaign, List<Category>> campaignCategoryMap;
    private Coupon coupon;

    public ShoppingCart() {
        productMap = new TreeMap<Product, Integer>();
        categoryMap = new TreeMap<Category, List<Product>>();
        campaignList = new ArrayList<Campaign>();
        campaignCategoryMap = new TreeMap<Campaign, List<Category>>();
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public void addItem(Product product, Integer count) {
        Integer value = productMap.get(product);
        if (value == null)
            value = 0;
        productMap.put(product, value + count);
        List<Product> products = categoryMap.get(product.getCategory());
        if (products == null)
            products = new ArrayList<Product>();
        products.add(product);
        categoryMap.put(product.getCategory(), products);

    }

    public void applyDiscounts(Campaign... campaigns) {
        campaignList.addAll(Arrays.asList(campaigns));
        for (Campaign campaign : campaigns) {
            Category category = campaign.getCategory();
        }
    }


    public void applyCoupon(Coupon coupon) throws InvalidParameterSpecException {
        Double value = getTotalAmountWithoutDiscount() - getCampaignDiscount();
        if (value >= coupon.getMinLimit()) {
            this.coupon = coupon;
        } else {
            throw new InvalidParameterSpecException("Min limit of coupon is invalid");
        }
    }

    public Double getTotalAmountWithoutDiscount() {
        Double total = 0.0;

        for (Product p : productMap.keySet()) {
            Integer count = productMap.get(p);
            total += count * p.getPrice();
        }

        return total;
    }

    public Double getCampaignDiscount() {
        Double totalDiscount = 0.0;
        for (Campaign campaign : campaignList) {
            List<Product> products = categoryMap.get(campaign);
            if (products != null) {
                for (Product p : products) {

                }
            }
        }
        return totalDiscount;
    }

    public Double getCouponDiscount() {
        return 0.0;
    }

    public Double getDeliveryCost() {
        return 0.0;
    }


}
