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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wishlist wishlist)) return false;
        return Objects.equals(getWishId(), wishlist.getWishId()) && Objects.equals(getBuyer(), wishlist.getBuyer()) && Objects.equals(getProducts(), wishlist.getProducts()) && Objects.equals(getDateAdded(), wishlist.getDateAdded());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWishId(), getBuyer(), getProducts(), getDateAdded());
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishId=" + wishId +
                ", buyer=" + buyer +
                ", products=" + products +
                ", dateAdded=" + dateAdded +
                '}';
    }

    public static class Builder {
        private Long wishId;
        private User buyer;
        private Set<Product> products = new HashSet<>();
        private Date dateAdded;

        public Builder setWishId(Long wishId) {
            this.wishId = wishId;
            return this;
        }

        public Builder setBuyer(User buyer) {
            this.buyer = buyer;
            return this;
        }

        public Builder setProducts(Set<Product> products) {
            this.products = products;
            return this;
        }

        public Builder setDateAdded(Date dateAdded) {
            this.dateAdded = dateAdded;
            return this;
        }

        public Builder copy(Wishlist wishlist) {
            this.wishId = wishlist.wishId;
            this.buyer = wishlist.buyer;
            this.products = wishlist.products;
            this.dateAdded = wishlist.dateAdded;
            return this;
        }

        public Wishlist build() {
            return new Wishlist(this);
        }
    }
}
