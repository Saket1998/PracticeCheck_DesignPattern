package com.cognizant.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JohnObserver implements INotificationObserver {
	private static final Logger LOGGER = LogManager.getLogger(JohnObserver.class);
	public String name;

	public JohnObserver() {
		this.name = "John";
	}

	@Override
	public void OnServerDown() {
		LOGGER.debug("Notification has been received by : "+name);
	}

	@Override
	public String toString() {
		return "Name : " +name;
	}
}
