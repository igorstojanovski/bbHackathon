package org.bb.service;

import org.bb.entity.Place;
import org.bb.repository.PlacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacesService {

    @Autowired
    PlacesRepository placesRepository;

    public Place savePlace(Place place) {
        return placesRepository.save(place);
    }

    public Place getPlace(Long id) {
        return placesRepository.findOne(id);
    }

    public Iterable<Place> getAllPlaces() {
        return placesRepository.findAll();
    }
}
