package com.neobis.week6.textileSeller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/textileSeller")
public class TextileSellerController {

    private final TextileSellerService textileSellerService;

    @Autowired
    public TextileSellerController(TextileSellerService textileSellerService) {
        this.textileSellerService = textileSellerService;
    }

    @GetMapping(path = "/getTextileSellers")
    public List<TextileSeller> getTextileSellers(){
        return textileSellerService.getTextileSellers();
    }

    @GetMapping(path = "/getTextileSeller/{sellerId}")
    public Optional<TextileSeller> getTextileSellerById(
            @PathVariable ("sellerId") Long sellerId
    ){
        return textileSellerService.getTextileSellerById(sellerId);
    }

    @PostMapping(path = "/addTextileSeller")
    public TextileSeller addTextileSeller(
            @RequestBody TextileSeller textileSeller
    ){
        return textileSellerService.addTextileSeller(textileSeller);
    }

    @PutMapping(path = "/updateTextileSeller/{sellerId}")
    public TextileSeller updateTextileSeller(
            @PathVariable ("sellerId") Long sellerId,
            @RequestBody TextileSeller newTextileSeller
    ){
        return textileSellerService.updateTextileSeller(sellerId, newTextileSeller);
    }

    @DeleteMapping(path = "/deleteTextileSeller/{sellerId}")
    public void deleteTextileSeller(
            @PathVariable ("sellerId") Long sellerId
    ){
        textileSellerService.deleteTextileSeller(sellerId);
    }
}
