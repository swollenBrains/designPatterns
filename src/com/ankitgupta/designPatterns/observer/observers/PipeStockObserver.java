package com.ankitgupta.designPatterns.observer.observers;

public class PipeStockObserver implements StockObserver {

	@Override
	public void update(Double googlePrice, Double facebookPrice,
			Double applePrice) {
		System.out.println("Google : "+googlePrice+"| Facebook : "+ facebookPrice + "| Apple : "+applePrice);
	}

}
