package com.neobis.week6.textile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TextileService {

    private final TextileRepository textileRepository;

    @Autowired
    public TextileService(TextileRepository textileRepository) {
        this.textileRepository = textileRepository;
    }

    public List<Textile> getTextile() {
        return textileRepository.findAll();
    }

    public Optional<Textile> getTextileById(Long textileId) {
        return textileRepository.findById(textileId);
    }

    public Textile addTextile(Textile textile) {
        return textileRepository.save(textile);
    }

    public Textile updateTextile(Long textileId, Textile newTextile) {
        Textile textile = textileRepository.findById(textileId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no textile with id = " + textileId
                        )
                );
        textile.setColorId(newTextile.getColorId());
        textile.setPrice(newTextile.getPrice());
        textile.setFootage(newTextile.getFootage());
        textile.setSellerId(newTextile.getSellerId());

        return textileRepository.save(textile);
    }

    public void deleteTextile(Long textileId) {
        textileRepository.deleteById(textileId);
    }
}
