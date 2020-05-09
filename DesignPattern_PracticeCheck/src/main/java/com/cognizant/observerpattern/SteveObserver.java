package com.cognizant.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SteveObserver implements INotificationObserver {
	private static final Logger LOGGER = LogManager.getLogger(SteveObserver.class);
	public String name;

	public SteveObserver() {
		this.name = "Steve";
	}

	@Override
	public void OnServerDown() {
		LOGGER.debug("Notification has been received by : "+name);
	}

	@Override
	public String toString() {
		return "Name : "+name;
	}
}
