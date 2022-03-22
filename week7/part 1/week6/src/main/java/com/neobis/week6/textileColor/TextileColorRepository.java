package com.neobis.week6.textileColor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextileColorRepository extends JpaRepository<TextileColor, Long> {
}
