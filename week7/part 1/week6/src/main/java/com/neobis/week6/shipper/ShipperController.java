package com.neobis.week6.shipper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/shippers")
public class ShipperController {

    private final ShipperService shipperService;

    @Autowired
    public ShipperController(ShipperService shipperService) {
        this.shipperService = shipperService;
    }

    @GetMapping(path = "/getShippers")
    public List<Shipper> getShippers(){
        return shipperService.getShippers();
    }

    @GetMapping(path = "/getShipperById/{shipperId}")
    public Optional<Shipper> getShipperById(
            @PathVariable ("shipperId") Long shipperId
    ){
        return shipperService.getShipperById(shipperId);
    }

    @PostMapping (path = "/addShipper")
    public Shipper addShipper(
            @RequestBody Shipper shipper
    ){
        return shipperService.addShipper(shipper);
    }

    @PutMapping(path = "/updateShipper/{shipperId}")
    public Shipper updateShipper(
            @PathVariable ("shipperId") Long shipperId,
            @RequestBody Shipper newShipper
    ){
        return shipperService.updateShipper(shipperId,  newShipper);
    }

    @DeleteMapping(path = "/deleteShipper/{shipperId}")
    public void deleteShipper(
            @PathVariable ("shipperId") Long shipperId
    ){
        shipperService.deleteShipper(shipperId);
    }
}
