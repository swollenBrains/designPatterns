package com.ankitgupta.designPatterns.observer.producer;

import java.util.ArrayList;
import java.util.List;

import com.ankitgupta.designPatterns.observer.StockObserver;

public class RandomStockPriceProducer implements StockPriceProducer {

	private List<StockObserver> observers ;
	private Double googlePrice;
	private Double facebookPrice;
	private Double applePrice;
	
	public RandomStockPriceProducer(){
		observers = new ArrayList<StockObserver>();
	}
	
	@Override
	public void register(StockObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unregister(StockObserver observer) {
		int observerIndex = observers.indexOf(observer);
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObservers() {
		for(StockObserver observer : observers){
			observer.update(googlePrice, facebookPrice, applePrice);
		}
	}

	public void setGooglePrice(Double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObservers();
	}

	public void setFacebookPrice(Double facebookPrice) {
		this.facebookPrice = facebookPrice;
		notifyObservers();
	}

	public void setApplePrice(Double applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}

}
