package com.neobis.week6.productCategory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productCategory")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @Autowired
    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping(path = "/getProductCategory")
    public List<ProductCategory> getProductCategory() {
        return productCategoryService.getProductCategory();
    }

    @GetMapping(path = "/getProductCategory/{categoryId}")
    public Optional<ProductCategory> getProductCategoryById(
            @PathVariable("categoryId") Long categoryId
    ) {
        return productCategoryService.getProductCategoryById(categoryId);
    }

    @PostMapping(path = "/addProductCategory")
    public ProductCategory addProductCategory(
            @RequestBody ProductCategory productCategory
            ){
        return productCategoryService.addProductCategory(productCategory);
    }

    @PutMapping(path = "/updateProductCategory/{categoryId}")
    public ProductCategory updateProductCategory(
            @PathVariable("categoryId") Long categoryId,
            @RequestBody ProductCategory newProductCategory
    ){
        return productCategoryService.updateProductCategory(categoryId, newProductCategory);
    }

    @DeleteMapping(path = "/deleteProductCategory/{categoryId}")
    public void deleteProductCategory(
            @PathVariable("categoryId") Long categoryId
    ){
        productCategoryService.deleteProductCategory(categoryId);
    }
}
