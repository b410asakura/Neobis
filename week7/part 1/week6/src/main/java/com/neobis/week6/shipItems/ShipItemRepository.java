package com.neobis.week6.shipItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipItemRepository extends JpaRepository<ShipItem, Long> {
}
