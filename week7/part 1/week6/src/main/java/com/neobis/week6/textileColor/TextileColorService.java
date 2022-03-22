package com.neobis.week6.textileColor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TextileColorService {

    private final TextileColorRepository textileColorRepository;


    @Autowired
    public TextileColorService(TextileColorRepository textileColorRepository) {
        this.textileColorRepository = textileColorRepository;
    }

    public List<TextileColor> getTextileColors() {
        return textileColorRepository.findAll();
    }

    public Optional<TextileColor> getTextileColorById(Long colorId) {
        return textileColorRepository.findById(colorId);
    }

    public TextileColor addTextileColor(TextileColor textileColor) {
        return textileColorRepository.save(textileColor);
    }

    public TextileColor updateTextileColor(Long colorId, TextileColor newTextileColor) {
        TextileColor textileColor = textileColorRepository.findById(colorId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no textile color with id = " + colorId
                        )
                );
        textileColor.setName(newTextileColor.getName());
        return textileColorRepository.save(textileColor);
    }

    public void deleteTextileColor(Long colorId) {
        textileColorRepository.deleteById(colorId);
    }
}
