package com.cognizant.observerpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		INotificationObserver s = new SteveObserver();
		INotificationObserver j = new JohnObserver();
		INotificationService ser = new NotificationService();
		
		LOGGER.info("Start");
		LOGGER.info("Adding Subscriber");
		ser.AddSubscriber(j);
		LOGGER.info("Subscriber Notification");
		ser.NotifySubscriber();
		LOGGER.info("Adding Subscriber");
		ser.AddSubscriber(s);
		LOGGER.info("Subscriber Notification");
		ser.NotifySubscriber();
		LOGGER.info("Removing Subscriber");
		ser.RemoveSubscriber(j);
		LOGGER.info("Subscriber Notification");
		ser.NotifySubscriber();
		LOGGER.info("End");
	}
}
