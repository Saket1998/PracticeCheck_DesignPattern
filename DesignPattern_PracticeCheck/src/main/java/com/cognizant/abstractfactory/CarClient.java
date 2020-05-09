package com.cognizant.abstractfactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class CarClient {
	private static final Logger LOGGER = LogManager.getLogger(CarClient.class);
	public static void main(String[] args) {
		LOGGER.info("Start");
		LOGGER.info("Start MICRO-USA");
		LOGGER.debug(CarFactory.buildCar(CarType.MICRO, Location.USA));
		LOGGER.info("End");
		LOGGER.info("Start MINI-INDIA");
		LOGGER.debug("MINI-INDIA : "+CarFactory.buildCar(CarType.MINI, Location.INDIA));
		LOGGER.info("End");
		LOGGER.info("Start LUXURY-DEFAULT");
		LOGGER.debug("LUXURY-DEFAULT : "+CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
		LOGGER.info("End");
		LOGGER.info("End");
	}
}