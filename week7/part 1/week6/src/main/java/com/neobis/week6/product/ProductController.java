package com.neobis.week6.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/getProduct")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping(path = "/getProduct/{productId}")
    public Optional<Product> getProductById(
            @PathVariable ("productId") Long productId
    ){
        return productService.getProductById(productId);
    }

    @PostMapping(path = "/addProduct")
    public Product addProduct(
        @RequestBody Product product
    ){
        return productService.addProduct(product);
    }

    @PutMapping(path = "/updateProduct/{productId}")
    public Product updateProduct(
            @PathVariable ("productId") Long productId,
            @RequestBody Product newProduct
    ){
        return productService.updateProduct(productId, newProduct);
    }

    @DeleteMapping(path = "/deleteProduct/{productId}")
    public void deleteProduct(
            @PathVariable ("productId") Long productId
    ){
        productService.deleteProduct(productId);
    }

}
