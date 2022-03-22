package com.neobis.week6.textileSeller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TextileSellerService {

    private final TextileSellerRepository textileSellerRepository;

    @Autowired
    public TextileSellerService(TextileSellerRepository textileSellerRepository) {
        this.textileSellerRepository = textileSellerRepository;
    }

    public List<TextileSeller> getTextileSellers() {
        return textileSellerRepository.findAll();
    }


    public Optional<TextileSeller> getTextileSellerById(Long sellerId) {
        return textileSellerRepository.findById(sellerId);
    }

    public TextileSeller addTextileSeller(TextileSeller textileSeller) {
        return textileSellerRepository.save(textileSeller);
    }

    public TextileSeller updateTextileSeller(Long sellerId, TextileSeller newTextileSeller) {
        TextileSeller textileSeller = textileSellerRepository.findById(sellerId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no textile seller with id = " + sellerId
                        )
                );
        textileSeller.setFirstName(newTextileSeller.getFirstName());
        textileSeller.setLastName(newTextileSeller.getLastName());
        textileSeller.setEmail(newTextileSeller.getEmail());
        textileSeller.setPhoneNumber(newTextileSeller.getPhoneNumber());
        textileSeller.setAddress(newTextileSeller.getAddress());

        return textileSellerRepository.save(textileSeller);
    }

    public void deleteTextileSeller(Long sellerId) {
        textileSellerRepository.deleteById(sellerId);
    }
}
