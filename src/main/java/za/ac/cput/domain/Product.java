package za.ac.cput.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Product implements Serializable {
    @Id
    private String product_id;
    private String product_name;
    private String product_des;
    private double product_price;
    private String product_condition;
    private String product_status;
    private Clob product_image;
    private LocalDateTime product_timestamp;
    private String product_category_id;
    private String user_id;

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
//        this.product_category_id = product_category_id;
//        this.user_id = user_id;
    }


    public String getProudct_id() {
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

    public Clob getProduct_image() {
        return product_image;
    }

    public LocalDateTime getProduct_timestamp() {
        return product_timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product_price, product.product_price) == 0 && Objects.equals(product_id, product.product_id) && Objects.equals(product_name, product.product_name) && Objects.equals(product_des, product.product_des) && Objects.equals(product_condition, product.product_condition) && Objects.equals(product_status, product.product_status) && Objects.equals(product_image, product.product_image) && Objects.equals(product_timestamp, product.product_timestamp) && Objects.equals(product_category_id, product.product_category_id) && Objects.equals(user_id, product.user_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, product_des, product_price, product_condition, product_status, product_image, product_timestamp, product_category_id, user_id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "proudct_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_des='" + product_des + '\'' +
                ", product_price=" + product_price +
                ", product_condition='" + product_condition + '\'' +
                ", product_status='" + product_status + '\'' +
                ", product_image=" + product_image +
                ", product_timestamp=" + product_timestamp +
                ", product_category_id='" + product_category_id + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
    public static class Builder{
        @Id
        private String product_id;
        private String product_name;
        private String product_des;
        private double product_price;
        private String product_condition;
        private String product_status;
        private Clob product_image;
        private LocalDateTime product_timestamp;
//        private String product_category_id;
//        private String user_id;
public Builder setProudct_id(String product_id) {
    this.product_id=product_id;
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

        public Builder setProduct_image(Clob product_image) {
            this.product_image=product_image;
            return this;
        }

        public Builder setProduct_timestamp(LocalDateTime product_timestamp) {
            this.product_timestamp=product_timestamp;
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
            return this;
        }
        public Product build(){return new Product(this);}

    }

}
