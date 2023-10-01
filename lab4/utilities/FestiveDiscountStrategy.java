package utilities;

import utilities.DiscountStrategy;

public class FestiveDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price - (price * 0.10);  // 10% festive discount
    }
}
