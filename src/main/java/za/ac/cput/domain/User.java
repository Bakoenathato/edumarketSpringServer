package za.ac.cput.domain;

import java.time.LocalDateTime;
import java.util.*;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import za.ac.cput.domain.contactinfo.Address;
import za.ac.cput.domain.contactinfo.Contact;

@Entity
public class User
{
    @Id
    private int userId;
    private String userFName;
    private String userLName;
    private String userRole;
    private String userPassword;

    @OneToOne
    private Contact userContact;

    @OneToOne
    private Address userAddress;

    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Wishlist> wishlistList = new ArrayList<>();

    @OneToMany(mappedBy = "buyer")
    private Set<Review> reviews = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>();

    @ManyToMany(mappedBy = "participants")
    private Set<Chat> chats = new HashSet<>();


    @CreatedDate
    private LocalDateTime dateCreated;

    @LastModifiedDate
    private LocalDateTime dateUpdated;

    protected User(){
    }

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userFName = builder.userFName;
        this.userLName = builder.userLName;
        this.userRole = builder.userRole;
        this.userPassword = builder.userPassword;
        this.userContact = builder.userContact;
        this.userAddress = builder.userAddress;
        this.wishlistList = builder.wishlistList;
        this.reviews = builder.reviews;
        this.products = builder.products;

        this.dateCreated = builder.dateCreated;
        this.dateUpdated = builder.dateUpdated;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserFName() {
        return userFName;
    }

    public String getUserLName() {
        return userLName;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public Contact getUserContact() {
        return userContact;
    }

    public Address getUserAddress() {
        return userAddress;
    }

    public List<Wishlist> getWishlistList() {
        return wishlistList;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public Set<Chat> getChats() {
        return chats;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getUserId() == user.getUserId() && Objects.equals(getUserFName(), user.getUserFName()) && Objects.equals(getUserLName(), user.getUserLName()) && Objects.equals(getUserRole(), user.getUserRole()) && Objects.equals(getUserPassword(), user.getUserPassword()) && Objects.equals(getUserContact(), user.getUserContact()) && Objects.equals(getUserAddress(), user.getUserAddress()) && Objects.equals(getWishlistList(), user.getWishlistList()) && Objects.equals(getReviews(), user.getReviews()) && Objects.equals(getProducts(), user.getProducts()) && Objects.equals(getChats(), user.getChats()) && Objects.equals(getDateCreated(), user.getDateCreated()) && Objects.equals(getDateUpdated(), user.getDateUpdated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getUserFName(), getUserLName(), getUserRole(), getUserPassword(), getUserContact(), getUserAddress(), getWishlistList(), getReviews(), getProducts(), getChats(), getDateCreated(), getDateUpdated());
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userFName='" + userFName + '\'' +
                ", userLName='" + userLName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userContact=" + userContact +
                ", userAddress=" + userAddress +
                ", wishlistList=" + wishlistList +
                ", reviews=" + reviews +
                ", products=" + products +
                ", chats=" + chats +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }

    public static class Builder
    {
        private int userId;
        private String userFName;
        private String userLName;
        private String userRole;
        private String userPassword;
        private Contact userContact;
        private Address userAddress;
        private List<Wishlist> wishlistList = new ArrayList<>();
        private Set<Review> reviews = new HashSet<>();
        private Set<Product> products = new HashSet<>();
        private Set<Chat> chats = new HashSet<>();
        private LocalDateTime dateCreated;
        private LocalDateTime dateUpdated;


        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUserFName(String userFName) {
            this.userFName = userFName;
            return this;
        }

        public Builder setUserLName(String userLName) {
            this.userLName = userLName;
            return this;
        }

        public Builder setUserRole(String userRole) {
            this.userRole = userRole;
            return this;
        }

        public Builder setUserPassword(String userPassword) {
            this.userPassword = userPassword;
            return this;
        }

        public Builder setUserContact(Contact userContact) {
            this.userContact = userContact;
            return this;
        }

        public Builder setUserAddress(Address userAddress) {
            this.userAddress = userAddress;
            return this;
        }

        public Builder setWishlistList(List<Wishlist> wishlistList) {
            this.wishlistList = wishlistList;
            return this;
        }

        public Builder setReviews(Set<Review> reviews) {
            this.reviews = reviews;
            return this;
        }

        public Builder setProducts(Set<Product> products) {
            this.products = products;
            return this;
        }

        public Builder setChats(Set<Chat> chats) {
            this.chats = chats;
            return this;
        }

        public Builder setDateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setDateUpdated(LocalDateTime dateUpdated) {
            this.dateUpdated = dateUpdated;
            return this;
        }

        public Builder copy(User user){
            this.userId = user.userId;
            this.userFName = user.userFName;
            this.userLName = user.userLName;
            this.userRole = user.userRole;
            this.userPassword = user.userPassword;
            this.userContact = user.userContact;
            this.userAddress = user.userAddress;
            this.wishlistList = user.wishlistList;
            this.reviews = user.reviews;
            this.products = user.products;
            this.chats = user.chats;
            this.dateCreated = user.dateCreated;
            this.dateUpdated = user.dateUpdated;
            return this;
        }
        public User build()
        {
           return new User(this);
        }
    }

}
