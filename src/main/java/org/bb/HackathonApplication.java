package org.bb;

import org.bb.entity.Place;
import org.bb.entity.Position;
import org.bb.service.PlacesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HackathonApplication {

	@Autowired
	PlacesService placesService;

	public static void main(String[] args) {
		SpringApplication.run(HackathonApplication.class, args);

	}

	@PostConstruct
	private void addData() {
		placesService.savePlace(new Place("Sushi Taksteeg", new Position(52.36921615586098, 4.892004787248172), "Taksteeg 3",
				"http://www.Taksteeg.com.mk", "+31 20 422 8978", "8AM - 03AM", "img/mapImgs/logo/logo_ragusa.png", (long) 1));

		placesService.savePlace(new Place("Clarks Shoes", new Position(52.370719099999995, 4.891561), "Kalverstraat 80- 82",
				"http://www.clarks.nl/", "8AM - 03AM", "+31 20 320 7019", "img/mapImgs/logo/logo_clarks.png", (long) 1));
	}
}
