package org.bb.controller;

import org.bb.entity.Offer;
import org.bb.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/offers")
public class OffersController {

    @Autowired
    OffersService offersService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Offer>> getAllOffers() {
        Iterable<Offer> places = offersService.getAllOffers();

        return new ResponseEntity<Iterable<Offer>>(places, HttpStatus.OK);
    }

    @RequestMapping(path = "/place", method = RequestMethod.GET)
    public ResponseEntity<List<Offer>> getOfferByPlaceId(@RequestParam Long placeID) {
        List<Offer> offers = offersService.getOffersByPlaceId(placeID);

        return new ResponseEntity<>(offers, HttpStatus.OK);
    }

}
