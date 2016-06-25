package org.bb;

import org.bb.entity.Offer;
import org.bb.entity.Place;
import org.bb.entity.Position;
import org.bb.service.OffersService;
import org.bb.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HackathonApplication {

	@Autowired
	PlacesService placesService;

	@Autowired
	OffersService offersService;

	public static void main(String[] args) {
		SpringApplication.run(HackathonApplication.class, args);

	}

	@PostConstruct
	private void addData() {
		placesService.savePlace(new Place("Sushi Taksteeg", new Position(52.36921615586098, 4.892004787248172), "Taksteeg 3",
				"http://www.Taksteeg.com.mk", "+31 20 422 8978", "8AM - 03AM", "img/mapImgs/logo/logo_ragusa.png", (long) 1));

		placesService.savePlace(new Place("Clarks Shoes", new Position(52.370719099999995, 4.891561), "Kalverstraat 80- 82",
				"http://www.clarks.nl/", "8AM - 03AM", "+31 20 320 7019", "img/mapImgs/logo/logo_clarks.png", (long) 1));

		offersService.saveOffer(new Offer((long) 1, placesService.getPlace((long) 1), "Pastrmajlija",
				"Pastrmalija is a Macedonian bread pie made from dough and meat. Pastrmalija is usually oval-shaped with sliced meat cubes on top of it. Its name derives from the word pastrma, meaning salted and dried meat of sheep or lamb",
				"img/products/pastrmajlija.jpg", (long) 200, "MKD", (long) 15, "RR234D346GJU"));
	}
}
