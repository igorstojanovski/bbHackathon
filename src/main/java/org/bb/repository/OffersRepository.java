package org.bb.repository;

import org.bb.entity.Offer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OffersRepository extends CrudRepository<Offer, Long> {

    List<Offer> findByPlaceId(Long id);

}
