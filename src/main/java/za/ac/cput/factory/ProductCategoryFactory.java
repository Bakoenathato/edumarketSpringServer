package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.ProductCategory;
import za.ac.cput.util.Helper;

import java.util.Set;

public class ProductCategoryFactory {

    public static ProductCategory createProductCategory(String product_category_id, String product_category_name, Set<Product> products){
        if(Helper.isNullOrEmpty(product_category_id) || Helper.isNullOrEmpty(product_category_name) || products == null)
            return null;

        return new ProductCategory.Builder()
                .setProduct_category_id(product_category_id)
                .setProduct_category_name(product_category_name)
                .setProducts(products)
                .build();
    }

//    public static ProductCategory createProductCategory(String Name){
//        if (Helper.isNullOrEmpty(Name))
//            return null;
//        String ID=Helper.generateID();
//        return new ProductCategory.Builder().setProduct_category_id(ID).setProduct_category_name(Name).build();
//
//    }

}
