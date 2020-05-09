package com.cognizant.abstractfactory;

class DefaultCarFactory {
	public Car getCar(CarType model) {
		if (model == CarType.LUXURY) {
			return new LuxuryCar(Location.DEFAULT);
		} else if (model == CarType.MICRO) {
			return new MicroCar(Location.DEFAULT);
		}
		return new MiniCar(Location.DEFAULT);
	}
}