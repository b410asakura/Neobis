package com.neobis.week6.textileColor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/textileColors")
public class TextileColorController {

    private final TextileColorService textileColorService;

    @Autowired
    public TextileColorController(TextileColorService textileColorService) {
        this.textileColorService = textileColorService;
    }

    @GetMapping(path = "/getTextileColors")
    public List<TextileColor> getTextileColors() {
        return textileColorService.getTextileColors();
    }

    @GetMapping(path = "/getTextileColor/{colorId}")
    public Optional<TextileColor> getTextileColorByid(
            @PathVariable("colorId") Long colorId
    ) {
        return textileColorService.getTextileColorById(colorId);
    }

    @PostMapping(path = "/addTextileColor")
    public TextileColor addTextileColor(
            @RequestBody TextileColor textileColor
    ) {
        return textileColorService.addTextileColor(textileColor);
    }

    @PutMapping(path = "updateTextileColor/{colorId}")
    public TextileColor updateTextileColor(
            @PathVariable("colorId") Long colorId,
            @RequestBody TextileColor newTextileColor
    ) {
        return textileColorService.updateTextileColor(colorId, newTextileColor);
    }

    @DeleteMapping(path = "/deleteTextileColor/{colorId}")
    public void deleteTextileColor(
            @PathVariable("colorId") Long colorId
    ) {
        textileColorService.deleteTextileColor(colorId);
    }
}
