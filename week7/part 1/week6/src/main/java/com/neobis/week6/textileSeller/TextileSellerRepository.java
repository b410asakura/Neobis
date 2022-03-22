package com.neobis.week6.textileSeller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextileSellerRepository extends JpaRepository<TextileSeller, Long> {
}
