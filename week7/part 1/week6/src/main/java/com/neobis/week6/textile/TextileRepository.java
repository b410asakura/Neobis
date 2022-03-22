package com.neobis.week6.textile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextileRepository extends JpaRepository<Textile, Long> {
}
