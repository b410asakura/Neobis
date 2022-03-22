package com.neobis.week6.shipItems;


import com.neobis.week6.shipper.ShipperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipItemService {

    private final ShipItemRepository shipItemRepository;

    @Autowired
    public ShipItemService(ShipItemRepository shipItemRepository) {
        this.shipItemRepository = shipItemRepository;
    }

    public List<ShipItem> getShipItems() {
        return shipItemRepository.findAll();
    }

    public Optional<ShipItem> getShipItemById(Long shipItemId) {
        return shipItemRepository.findById(shipItemId);
    }

    public ShipItem addShipItem(ShipItem shipItem) {
        return shipItemRepository.save(shipItem);
    }


    public ShipItem updateShipItem(Long shipItemId, ShipItem newShipItem) {
        ShipItem shipItem = shipItemRepository.findById(shipItemId)
                .orElseThrow(() -> new IllegalStateException(
                                "There is no ship items with id = " + shipItemId
                        )
                );
        shipItem.setShipStatusId(newShipItem.getShipStatusId());
        shipItem.setShipperId(newShipItem.getShipperId());
        shipItem.setShippedDate(newShipItem.getShippedDate());

        return shipItemRepository.save(shipItem);
    }

    public void deleteShipItem(Long shipItemId) {
        shipItemRepository.deleteById(shipItemId);
    }
}
