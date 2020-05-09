package com.cognizant.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MiniCar extends Car {
	private static final Logger LOGGER = LogManager.getLogger(MiniCar.class);
	MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.debug("Connecting to Mini Car ");
	}
}