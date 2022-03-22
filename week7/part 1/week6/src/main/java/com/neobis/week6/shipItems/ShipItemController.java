package com.neobis.week6.shipItems;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/shipItems")
public class ShipItemController {

    private final ShipItemService shipItemService;

    @Autowired
    public ShipItemController(ShipItemService shipItemService) {
        this.shipItemService = shipItemService;
    }

    @GetMapping(path = "/getShioItems")
    public List<ShipItem> getShipItems() {
        return shipItemService.getShipItems();
    }

    @GetMapping(path = "/getShipItem/{shipItemId}")
    public Optional<ShipItem> getShipItemById(
            @PathVariable("shipItemId") Long shipItemId
    ) {
        return shipItemService.getShipItemById(shipItemId);
    }

    @PostMapping(path = "/addShipItem")
    public ShipItem addShipItem(
            @RequestBody ShipItem shipItem
    ) {
        return shipItemService.addShipItem(shipItem);
    }

    @PutMapping(path = "/updateShipItem/{shipItemId}")
    public ShipItem updateShipItem(
            @PathVariable("shipItemId") Long shipItemId,
            @RequestBody ShipItem newShipItem
    ) {
        return shipItemService.updateShipItem(shipItemId, newShipItem);
    }

    @DeleteMapping(path = "/deleteShipItem/{shipItemId}")
    public void deleteShipItem(
            @PathVariable("shipItemId") Long shipItemId
    ) {
        shipItemService.deleteShipItem(shipItemId);
    }
}
