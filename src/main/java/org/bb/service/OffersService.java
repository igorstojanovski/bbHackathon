package org.bb.service;

import org.bb.entity.Offer;
import org.bb.repository.OffersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OffersService {

    @Autowired
    OffersRepository offersRepository;

    @Autowired
    PlacesService placesService;

    public Offer saveOffer(Offer offer) {
        return offersRepository.save(offer);
    }

    public List<Offer> getOffersByPlaceId(Long placeId) {
        return offersRepository.findByPlaceId(placeId);
    }

    public Iterable<Offer> getAllOffers() {
        return offersRepository.findAll();
    }

}
