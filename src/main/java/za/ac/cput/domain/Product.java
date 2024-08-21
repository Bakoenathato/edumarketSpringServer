package za.ac.cput.domain;


import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    private String product_name;
    private String product_des;
    private double product_price;
    private String product_condition;
    private String product_status;

    @Lob
    private Blob product_image;

    private LocalDateTime product_timestamp;

    @OneToOne(mappedBy = "category_id")
    private ProductCategory product_category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;

    protected Product(){

    }

    private Product(Builder builder) {
        this.product_id = builder.product_id;
        this.product_name = builder.product_name;
        this.product_des = builder.product_des;
        this.product_price = builder.product_price;
        this.product_condition = builder.product_condition;
        this.product_status = builder.product_status;
        this.product_image = builder.product_image;
        this.product_timestamp = builder.product_timestamp;
        this.product_category = builder.product_category;
    }


    public long getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public String getProduct_des() {
        return product_des;
    }

    public double getProduct_price() {
        return product_price;
    }

    public String getProduct_condition() {
        return product_condition;
    }

    public String getProduct_status() {
        return product_status;
    }

    public Blob getProduct_image() {
        return product_image;
    }

    public LocalDateTime getProduct_timestamp() {
        return product_timestamp;
    }

    public ProductCategory getProduct_category() {
        return product_category;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getProduct_id() == product.getProduct_id() && Double.compare(getProduct_price(), product.getProduct_price()) == 0 && Objects.equals(getProduct_name(), product.getProduct_name()) && Objects.equals(getProduct_des(), product.getProduct_des()) && Objects.equals(getProduct_condition(), product.getProduct_condition()) && Objects.equals(getProduct_status(), product.getProduct_status()) && Objects.equals(getProduct_image(), product.getProduct_image()) && Objects.equals(getProduct_timestamp(), product.getProduct_timestamp()) && Objects.equals(getProduct_category(), product.getProduct_category()) && Objects.equals(getUser(), product.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct_id(), getProduct_name(), getProduct_des(), getProduct_price(), getProduct_condition(), getProduct_status(), getProduct_image(), getProduct_timestamp(), getProduct_category(), getUser());
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_des='" + product_des + '\'' +
                ", product_price=" + product_price +
                ", product_condition='" + product_condition + '\'' +
                ", product_status='" + product_status + '\'' +
                ", product_image=" + product_image +
                ", product_timestamp=" + product_timestamp +
                ", product_category=" + product_category +
                ", user=" + user +
                '}';
    }

    public static class Builder{

        private long product_id;
        private String product_name;
        private String product_des;
        private double product_price;
        private String product_condition;
        private String product_status;
        private Blob product_image;
        private LocalDateTime product_timestamp;
        private ProductCategory product_category;
        private User user;


        public Builder setProduct_id(long product_id) {
            this.product_id = product_id;
            return this;
        }

        public Builder setProduct_name(String product_name) {
            this.product_name=product_name;
            return this;
        }

        public Builder setProduct_des(String product_des) {
            this.product_des=product_des;
            return this;
        }

        public Builder setProduct_price(double product_price) {
            this.product_price=product_price;
            return this;
        }

        public Builder setProduct_condition(String product_condition) {
            this.product_condition=product_condition;
            return this;
        }

        public Builder setProduct_status(String product_status) {
            this.product_status=product_status;
            return this;
        }

        public Builder setProduct_image(Blob product_image) {
            this.product_image=product_image;
            return this;
        }

        public Builder setProduct_timestamp(LocalDateTime product_timestamp) {
            this.product_timestamp=product_timestamp;
            return this;
        }

        public Builder setProduct_category(ProductCategory product_category) {
            this.product_category = product_category;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder copy(Product n) {
            this.product_id = n.product_id;
            this.product_name = n.product_name;
            this.product_des = n.product_des;
            this.product_price = n.product_price;
            this.product_condition = n.product_condition;
            this.product_status = n.product_status;
            this.product_image = n.product_image;
            this.product_timestamp = n.product_timestamp;
            this.product_category = n.product_category;
            this.user = n.user;
            return this;
        }
        public Product build(){return new Product(this);}

    }

}
