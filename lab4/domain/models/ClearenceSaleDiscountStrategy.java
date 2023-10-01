package domain.models;

import utilities.DiscountStrategy;

class ClearanceSaleDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.20);  // 20% clearance sale discount
    }
}