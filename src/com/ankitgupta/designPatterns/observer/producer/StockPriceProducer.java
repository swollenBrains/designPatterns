package com.ankitgupta.designPatterns.observer.producer;

import com.ankitgupta.designPatterns.observer.StockObserver;

public interface StockPriceProducer {
	
	void register(StockObserver observer);
	void unregister(StockObserver observer);
	void notifyObservers();
}
