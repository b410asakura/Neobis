package com.neobis.week6.shipper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipperService {

    private final ShipperRepository shipperRepository;

    @Autowired
    public ShipperService(ShipperRepository shipperRepository) {
        this.shipperRepository = shipperRepository;
    }

    public List<Shipper> getShippers() {
        return shipperRepository.findAll();
    }

    public Optional<Shipper> getShipperById(Long shipperId) {
        return shipperRepository.findById(shipperId);
    }


    public Shipper addShipper(Shipper shipper) {
        return shipperRepository.save(shipper);
    }

    public Shipper updateShipper(Long shipperId, Shipper newShipper) {
        Shipper shipper = shipperRepository.findById(shipperId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no shipper with id = " + shipperId
                        )
                );
        shipper.setName(newShipper.getName());

        return shipperRepository.save(shipper);
    }

    public void deleteShipper(Long shipperId) {
        shipperRepository.deleteById(shipperId);
    }
}
