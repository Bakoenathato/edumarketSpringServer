package za.ac.cput.service;

import za.ac.cput.domain.Product;
import za.ac.cput.domain.ProductCategory;

import java.util.List;

public interface IProductCategoryService extends IService<ProductCategory,String> {
    List<ProductCategory> getall();
}
