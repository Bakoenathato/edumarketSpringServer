package factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class WishlistFactoryTest {

    private Wishlist wishlist;

    @Test
    @Order(1)
    void buildWishlist() {
        // Create some dummy products
        Product product1 = new Product.Builder()
                .setProductId("818")
                .setProductName("Acer Laptop")
                .build();

        Product product2 = new Product.Builder()
                .setProductId("819")
                .setProductName("Sony Headphones")
                .build();

        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        wishlist = WishlistFactory.buildWishlist("55", products);
        assertNotNull(wishlist);
        System.out.println(wishlist);
    }

    @Test
    @Order(2)
    void buildWishlistWithFail() {
        wishlist = WishlistFactory.buildWishlist("", new ArrayList<>());
        assertNull(wishlist);
    }
}