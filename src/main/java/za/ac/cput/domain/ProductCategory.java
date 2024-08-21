package za.ac.cput.domain;

import jakarta.persistence.*;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class ProductCategory {
    @Id
    private String product_category_id;
    private String product_category_name;

    @OneToMany(mappedBy = "productCategory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>();

    protected ProductCategory(){}

    private ProductCategory(Builder builder){
        this.product_category_id=builder.product_category_id;
        this.product_category_name=builder.product_category_name;
        this.products = builder.products;
    }

    public String getProduct_category_id() {
        return product_category_id;
    }

    public String getProduct_category_name() {
        return product_category_name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductCategory that)) return false;
        return Objects.equals(getProduct_category_id(), that.getProduct_category_id()) && Objects.equals(getProduct_category_name(), that.getProduct_category_name()) && Objects.equals(getProducts(), that.getProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProduct_category_id(), getProduct_category_name(), getProducts());
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "product_category_id='" + product_category_id + '\'' +
                ", product_category_name='" + product_category_name + '\'' +
                ", products=" + products +
                '}';
    }

    public static class Builder{

        private String product_category_id;
        private String product_category_name;
        private Set<Product> products = new HashSet<>();

        public Builder setProduct_category_id(String product_category_id) {
            this.product_category_id=product_category_id;
            return this;
        }

        public Builder setProduct_category_name(String product_category_name) {
            this.product_category_name=product_category_name;
            return this;
        }

        public Builder setProducts(Set<Product> products) {
            this.products=products;
            return this;
        }

        public Builder copy(ProductCategory n){
            this.product_category_id=n.product_category_id;
            this.product_category_name=n.product_category_name;
            this.products=n.products;
            return this;
        }
        public ProductCategory build(){return new ProductCategory(this);}
    }
}
