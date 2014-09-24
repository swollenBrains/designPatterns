package com.ankitgupta.designPatterns.observer.observers;

public interface StockObserver {
	
	void update(Double googlePrice, Double facebookPrice, Double applePrice);
	
}
