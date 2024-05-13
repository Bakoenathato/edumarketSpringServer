package Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    private List<Product> products;

    private Wishlist(Builder builder) {
        this.userId = builder.userId;
        this.products = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Builder builder = (Builder) object;
        return java.util.Objects.equals(userId, builder.userId) && java.util.Objects.equals(products, builder.products);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), userId, products);
    }


    @Override
    public String toString() {
        return "Wishlist{" +
                "userId='" + userId + '\'' +
                ", products=" + products +
                '}';
    }

    public static class Builder {
        private String userId;
        private List<Product> products;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }



        public Builder setProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public Wishlist build() {
            return new Wishlist(this);
        }
    }
}
