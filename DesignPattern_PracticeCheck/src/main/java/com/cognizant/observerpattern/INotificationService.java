package com.cognizant.observerpattern;

public interface INotificationService {
	void AddSubscriber(INotificationObserver ob);
	void RemoveSubscriber(INotificationObserver ob);
	void NotifySubscriber();
}
