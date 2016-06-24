package org.bb.controller;

import org.bb.entity.Place;
import org.bb.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/places")
public class PlacesController {

    @Autowired
    PlacesService placesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Place>> getAllPlaces() {
        Iterable<Place> places = placesService.getAllPlaces();

        return new ResponseEntity<Iterable<Place>>(places, HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Place> getPlaceById(@PathVariable Long id) {
        Place place = placesService.getPlace(id);

        return new ResponseEntity<Place>(place, HttpStatus.OK);
    }

}
