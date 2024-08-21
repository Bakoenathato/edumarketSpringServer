package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.ProductCategory;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDateTime;

public class ProductFactory {
    public static Product createProduct(String Name, String Description, double Price, String Condition, String Status, Blob Image, LocalDateTime TimeStamp, ProductCategory productCategory, User user) {
        if(Helper.isNullOrEmpty(Name) || Helper.isNullOrEmpty(Description) || Price <= 0
                || Helper.isNullOrEmpty(Condition) || Helper.isNullOrEmpty(Status) || Image == null
                || TimeStamp == null || productCategory == null || user == null)
            return null;
        return new Product.Builder()
                .setProduct_name(Name)
                .setProduct_des(Description)
                .setProduct_price(Price)
                .setProduct_condition(Condition)
                .setProduct_status(Status)
                .setProduct_image(Image)
                .setProduct_timestamp(TimeStamp)
                .setProduct_category(productCategory)
                .setUser(user)
                .build();
    }
//    public static Product createProduct(String Name, String Description, double Price, String Condition, String Status, Clob Image, LocalDateTime TimeStamp) {
//        if(Helper.isNullOrEmpty(Name) || Helper.isNullOrEmpty(Description) || Helper.isNullOrEmpty(String.valueOf(Price)) || Helper.isNullOrEmpty(Condition) || Helper.isNullOrEmpty(Status) || Helper.isNullOrEmpty(String.valueOf(Image)) || Helper.isNullOrEmpty(String.valueOf(TimeStamp)))
//           return null;
//        String ID=Helper.generateID();
//        return new Product.Builder().setProudct_id(ID).setProduct_name(Name).setProduct_des(Description).setProduct_price(Price).setProduct_condition(Condition).setProduct_status(Status).setProduct_image(Image).setProduct_timestamp(TimeStamp).build();
//
//    }

}
