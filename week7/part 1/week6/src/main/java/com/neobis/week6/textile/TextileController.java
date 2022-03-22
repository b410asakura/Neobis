package com.neobis.week6.textile;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.SpinnerUI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/textile")
public class TextileController {

    private final TextileService textileService;

    @Autowired
    public TextileController(TextileService textileService) {
        this.textileService = textileService;
    }

    @GetMapping(path = "/getTextile")
    public List<Textile> getTextile() {
        return textileService.getTextile();
    }

    @GetMapping(path = "/getTextile/{textile_id}")
    public Optional<Textile> getTextileById(
            @PathVariable("textile_id") Long textileId
    ) {
        return textileService.getTextileById(textileId);
    }

    @PostMapping(path = "/addTextile")
    public Textile addTextile(
            @RequestBody Textile textile
    ){
        return textileService.addTextile(textile);
    }

    @PutMapping(path = "/updateTextile/{textile_id}")
    public Textile updateTextile(
            @PathVariable("textile_id") Long textileId,
            @RequestBody Textile newTextile
    ){
        return textileService.updateTextile(textileId, newTextile);
    }

    @DeleteMapping(path = "/deleteTextile/{textile_id}")
    public void deleteTextile(
            @PathVariable("textile_id") Long textileId
    ){
        textileService.deleteTextile(textileId);
    }
}
