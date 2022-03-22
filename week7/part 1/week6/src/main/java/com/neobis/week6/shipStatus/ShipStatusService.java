package com.neobis.week6.shipStatus;

import com.neobis.week6.shipper.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipStatusService {

    private final ShipStatusRepository shipStatusRepository;

    @Autowired
    public ShipStatusService(ShipStatusRepository shipStatusRepository) {
        this.shipStatusRepository = shipStatusRepository;
    }

    public List<ShipStatus> getShipStatuses() {
        return shipStatusRepository.findAll();
    }

    public Optional<ShipStatus> getShipStatusById(Long shipStatusId) {
        return shipStatusRepository.findById(shipStatusId);
    }

    public ShipStatus addShipStatus(ShipStatus shipStatus) {
        return shipStatusRepository.save(shipStatus);
    }

    public ShipStatus updateShipStatus(Long shipStatusId, ShipStatus newShipStatus) {
        ShipStatus shipStatus = shipStatusRepository.findById(shipStatusId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is ship status with id = " + shipStatusId
                        )
                );
        shipStatus.setName(newShipStatus.getName());
        return shipStatusRepository.save(shipStatus);
    }

    public void deleteShipStatus(Long shipStatusId) {
        shipStatusRepository.deleteById(shipStatusId);
    }
}
