package domain.models;

import java.util.*;

public class Customer implements IWishlistManager {
    private List<Car> wishlist = new ArrayList<>();

    @Override
    public void addToWishlist(Car car) {
        wishlist.add(car);
        System.out.println("Customer added " + car.getModel() + " to their wishlist.");
    }

    @Override
    public void removeFromWishlist(Car car) {
        wishlist.remove(car);
        System.out.println("Customer removed " + car.getModel() + " from their wishlist.");

    }
}
