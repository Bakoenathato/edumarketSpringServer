package za.ac.cput.factory;

import za.ac.cput.domain.ProductCategory;
import za.ac.cput.util.Helper;

public class ProductCategoryFactory {
    public static ProductCategory createProductCategory(String ID,String Name){
        if (Helper.isNullOrEmpty(ID)||Helper.isNullOrEmpty(Name))
            return null;
        return new ProductCategory.Builder().setProduct_category_id(ID).setProduct_category_name(Name).build();

    }
    public static ProductCategory createProductCategory(String Name){
        if (Helper.isNullOrEmpty(Name))
            return null;
        String ID=Helper.generateID();
        return new ProductCategory.Builder().setProduct_category_id(ID).setProduct_category_name(Name).build();

    }

}
