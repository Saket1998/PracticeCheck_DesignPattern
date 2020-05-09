package com.cognizant.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class LuxuryCar extends Car {
	private static final Logger LOGGER = LogManager.getLogger(LuxuryCar.class);
	LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.debug("Connecting to Luxury Car ");
	}
}