package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.ProductCategory;
import za.ac.cput.repository.ProductCategoryRepository;
import za.ac.cput.repository.ProductRepository;

import java.util.List;

@Service
public class ProductCategoryService implements IProductCategoryService{
    public ProductCategoryRepository repository;
    @Autowired
    ProductCategoryService(ProductCategoryRepository repository){
        this.repository=repository;
    }

    @Override
    public ProductCategory create(ProductCategory productCategory) {
        return repository.save(productCategory);
    }

    @Override
    public ProductCategory read(String product_category_id) {
        return repository.findById(product_category_id).orElse(null);
    }

    @Override
    public ProductCategory update(ProductCategory productCategory) {
        return repository.save(productCategory);
    }

    @Override
    public List<ProductCategory> getall() {
        return repository.findAll();
    }
}
