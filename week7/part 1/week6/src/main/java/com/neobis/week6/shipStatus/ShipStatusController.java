package com.neobis.week6.shipStatus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/shipperStatuses")
public class ShipStatusController {

    private final ShipStatusService shipStatusService;

    @Autowired
    public ShipStatusController(ShipStatusService shipStatusService) {
        this.shipStatusService = shipStatusService;
    }

    @GetMapping(path = "/getShipStatus")
    public List<ShipStatus> getShipStatuses() {
        return shipStatusService.getShipStatuses();
    }

    @GetMapping(path = "/getShipStatusById/{shipStatusId}")
    public Optional<ShipStatus> getShipStatusByid(
            @PathVariable("shipStatusId") Long shipStatusId
    ) {
        return shipStatusService.getShipStatusById(shipStatusId);
    }

    @PostMapping(path = "/addShipStatus")
    public ShipStatus addShipStatus(
            @RequestBody ShipStatus shipStatus
    ) {
        return shipStatusService.addShipStatus(shipStatus);
    }

    @PutMapping(path = "/updateShipStatus/{shipStatusId}")
    public ShipStatus updateShipStatus(
            @PathVariable("shipStatusId") Long shipStatusId,
            @RequestBody ShipStatus newShipStatus
    ) {
        return shipStatusService.updateShipStatus(shipStatusId, newShipStatus);
    }

    @DeleteMapping(path = "/deleteShipStatus/{shipStatusId}")
    public void deleteShipStatus(
            @PathVariable("shipStatusId") Long shipStatusId
    ){
        shipStatusService.deleteShipStatus(shipStatusId);
    }
}
