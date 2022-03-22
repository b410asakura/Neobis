package com.neobis.week6.paymentItems;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentItemsRepository extends JpaRepository<PaymentItems, Long> {
}
