package com.cognizant.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class MicroCar extends Car {
	private static final Logger LOGGER = LogManager.getLogger(MicroCar.class);
	MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	protected void construct() {
		LOGGER.debug("Connecting to Micro Car ");
	}
}