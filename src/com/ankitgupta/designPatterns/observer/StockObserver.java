package com.ankitgupta.designPatterns.observer;

public interface StockObserver {
	
	void update(Double googlePrice, Double facebookPrice, Double applePrice);
	
}
