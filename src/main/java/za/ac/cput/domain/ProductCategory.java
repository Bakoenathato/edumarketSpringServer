package za.ac.cput.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import java.util.Objects;

@Entity
public class ProductCategory {
    @Id
    private String product_category_id;
    private String product_category_name;

    protected ProductCategory(){}

    private ProductCategory(Builder builder){
        this.product_category_id=builder.product_category_id;
        this.product_category_name=builder.product_category_name;
    }

    public String getProduct_category_id() {
        return product_category_id;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCategory that = (ProductCategory) o;
        return Objects.equals(product_category_id, that.product_category_id) && Objects.equals(product_category_name, that.product_category_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_category_id, product_category_name);
    }

    @Override
    public String toString() {
        return "ProductCat{" +
                "product_category_id='" + product_category_id + '\'' +
                ", product_category_name='" + product_category_name + '\'' +
                '}';
    }
    public static class Builder{
        @Id
        private String product_category_id;
        private String product_category_name;

        public Builder setProduct_category_id(String product_category_id) {
            this.product_category_id=product_category_id;
            return this;
        }

        public Builder setProduct_category_name(String product_category_name) {
            this.product_category_name=product_category_name;
            return this;
        }
        public Builder copy(ProductCategory n){
            this.product_category_id=n.product_category_id;
            this.product_category_name=n.product_category_name;
            return this;
        }
        public ProductCategory build(){return new ProductCategory(this);}
    }
}
