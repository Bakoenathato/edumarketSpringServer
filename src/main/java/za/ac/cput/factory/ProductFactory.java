package za.ac.cput.factory;

import za.ac.cput.domain.Product;
import za.ac.cput.util.Helper;

import java.sql.Clob;
import java.time.LocalDateTime;

public class ProductFactory {
public static Product createProduct(String ID,String Name, String Description, double Price, String Condition, String Status, Clob Image, LocalDateTime TimeStamp) {
    if(Helper.isNullOrEmpty(ID) || Helper.isNullOrEmpty(Name) || Helper.isNullOrEmpty(Description) || Helper.isNullOrEmpty(String.valueOf(Price)) || Helper.isNullOrEmpty(Condition) || Helper.isNullOrEmpty(Status) || Helper.isNullOrEmpty(String.valueOf(Image)) || Helper.isNullOrEmpty(String.valueOf(TimeStamp)))
    return null;
    return new Product.Builder().setProudct_id(ID).setProduct_name(Name).setProduct_des(Description).setProduct_price(Price).setProduct_condition(Condition).setProduct_status(Status).setProduct_image(Image).setProduct_timestamp(TimeStamp).build();

}
    public static Product createProduct(String Name, String Description, double Price, String Condition, String Status, Clob Image, LocalDateTime TimeStamp) {
        if(Helper.isNullOrEmpty(Name) || Helper.isNullOrEmpty(Description) || Helper.isNullOrEmpty(String.valueOf(Price)) || Helper.isNullOrEmpty(Condition) || Helper.isNullOrEmpty(Status) || Helper.isNullOrEmpty(String.valueOf(Image)) || Helper.isNullOrEmpty(String.valueOf(TimeStamp)))
           return null;
        String ID=Helper.generateID();
        return new Product.Builder().setProudct_id(ID).setProduct_name(Name).setProduct_des(Description).setProduct_price(Price).setProduct_condition(Condition).setProduct_status(Status).setProduct_image(Image).setProduct_timestamp(TimeStamp).build();

    }

}
