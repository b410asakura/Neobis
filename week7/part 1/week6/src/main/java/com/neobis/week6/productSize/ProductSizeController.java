package com.neobis.week6.productSize;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/productSize")
public class ProductSizeController {

    private final ProductSizeService productSizeService;

    @Autowired
    public ProductSizeController(ProductSizeService productSizeService) {
        this.productSizeService = productSizeService;
    }

    @GetMapping(path = "/getProductSize")
    public List<ProductSize> getProductSize() {
        return productSizeService.getProductSize();
    }

    @GetMapping(path = "/getProductSize/{sizeId}")
    public Optional<ProductSize> getProductSizeById(
            @PathVariable("sizeId") Long sizeId
    ) {
        return productSizeService.getProductSizeById(sizeId);
    }

    @PostMapping(path = "/addProductSize")
    public ProductSize addProductSize(
            @RequestBody ProductSize productSize
    ) {
        return productSizeService.addProductSize(productSize);
    }

    @PutMapping(path = "/updateProductSize/{sizeId}")
    public ProductSize updateProductSize(
            @PathVariable("sizeId") Long sizeId,
            @RequestBody ProductSize newProductSize
    ) {
        return productSizeService.updateProductSize(sizeId, newProductSize);
    }

    @DeleteMapping(path = "/deleteProductSize/{sizeId}")
    public void deleteProductSize(
            @PathVariable("sizeId") Long sizeId
    ){
        productSizeService.deleteProductSize(sizeId);
    }

}
