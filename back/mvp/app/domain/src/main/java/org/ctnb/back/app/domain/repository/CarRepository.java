package org.ctnb.back.app.domain.repository;

import org.ctnb.back.app.domain.entity.CarEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<CarEO, UUID> {
}
