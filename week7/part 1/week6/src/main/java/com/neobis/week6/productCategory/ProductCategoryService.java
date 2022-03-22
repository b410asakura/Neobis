package com.neobis.week6.productCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryService {

    private final ProductCategoryRepository productCategoryRepository;

    @Autowired
    public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }


    public List<ProductCategory> getProductCategory() {
        return productCategoryRepository.findAll();
    }

    public Optional<ProductCategory> getProductCategoryById(Long categoryId) {
        return productCategoryRepository.findById(categoryId);
    }

    public ProductCategory addProductCategory(ProductCategory productCategory) {
        return productCategoryRepository.save(productCategory);
    }

    public ProductCategory updateProductCategory(Long categoryId, ProductCategory newProductCategory) {
        ProductCategory productCategory = productCategoryRepository.findById(categoryId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no product category with id = " + categoryId
                        )
                );
        productCategory.setName(newProductCategory.getName());
        return productCategoryRepository.save(productCategory);
    }

    public void deleteProductCategory(Long categoryId) {
        productCategoryRepository.deleteById(categoryId);
    }
}
