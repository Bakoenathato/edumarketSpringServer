package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "wishlists")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishId;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Set<Product> products = new HashSet<>();

    @Column(name = "date_added")
    private Date dateAdded;

    protected Wishlist() {}

    public Wishlist(Builder builder){
        this.wishId = builder.wishId;
        this.buyer = builder.buyer;
        this.products = builder.products;
        this.dateAdded = builder.dateAdded;
    }

    public Long getWishId() {
        return wishId;
    }

    public User getBuyer() {
        return buyer;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public static class Builder {
        private Long wishId;
        private User buyer;
        private Set<Product> products = new HashSet<>();
        private Date dateAdded;

        public Builder wishId(Long wishId) {
            this.wishId = wishId;
            return this;
        }

        public Builder buyer(User buyer) {
            this.buyer = buyer;
            return this;
        }

        public Builder products(Set<Product> product) {
            this.products = products;
            return this;
        }

        public Builder dateAdded(Date dateAdded) {
            this.dateAdded = dateAdded;
            return this;
        }

        public Builder copy(Wishlist wishlist) {
            this.wishId = wishlist.getWishId();
            this.buyer = wishlist.getBuyer();
            this.products = wishlist.getProducts();
            this.dateAdded = wishlist.getDateAdded();
            return this;
        }

        public Wishlist build() {
            return new Wishlist(this);
        }
    }
}