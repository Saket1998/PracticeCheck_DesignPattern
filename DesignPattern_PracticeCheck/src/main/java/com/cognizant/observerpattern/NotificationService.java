package com.cognizant.observerpattern;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotificationService implements INotificationService{
	private static final Logger LOGGER = LogManager.getLogger(NotificationService.class);

	List<INotificationObserver> l = new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver ob) {
		l.add(ob);
		LOGGER.debug(l);
	}

	@Override
	public void RemoveSubscriber(INotificationObserver ob) {
		l.remove(ob);
		LOGGER.debug(l);
	}

	@Override
	public void NotifySubscriber() {
		for(INotificationObserver i : l) {
			i.OnServerDown();
		}
	}
	
}
