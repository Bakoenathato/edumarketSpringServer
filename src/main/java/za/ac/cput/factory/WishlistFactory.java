package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.User;
import za.ac.cput.domain.Wishlist;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class WishlistFactory {
    public static Wishlist buildWishList(User buyer, Set<Product> products, Date dateAdded) {
        if (buyer == null || products == null || dateAdded == null)
            return null;

        return new Wishlist.Builder()
                .setBuyer(buyer)
                .setProducts(products)
                .setDateAdded(dateAdded)
                .build();
    }
}
