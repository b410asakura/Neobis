package com.neobis.week6.shipStatus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipStatusRepository extends JpaRepository<ShipStatus, Long> {
}
