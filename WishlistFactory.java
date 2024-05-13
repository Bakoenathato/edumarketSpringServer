package Factory;

public class WishlistFactory {
    public static Wishlist buildWishlist(String userId, List<Product>products) {
        if (userId <= 0 || Helper.isEmpty(userId) || Helper.isEmpty(List<Product>products) ) {
            return null;
        }
        return new Wislist.Builder()
                .setUserId(userId)
                .setList<Product>products
                .build();
    }
}
