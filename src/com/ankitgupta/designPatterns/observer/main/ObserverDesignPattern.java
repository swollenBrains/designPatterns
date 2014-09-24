package com.ankitgupta.designPatterns.observer.main;

import com.ankitgupta.designPatterns.observer.observers.CommaStockDisplayer;
import com.ankitgupta.designPatterns.observer.observers.PipeStockObserver;
import com.ankitgupta.designPatterns.observer.observers.StockObserver;
import com.ankitgupta.designPatterns.observer.producer.RandomStockPriceProducer;

public class ObserverDesignPattern {
	
	public static void main(String[] args) throws InterruptedException {
		RandomStockPriceProducer producer = new RandomStockPriceProducer();
		
		StockObserver commaObserver = new CommaStockDisplayer();
		StockObserver pipeObserver = new PipeStockObserver();
		
		producer.register(commaObserver);
		producer.register(pipeObserver);
		
		
		producer.setGooglePrice(169.00);
		Thread.sleep(2000);
		producer.setFacebookPrice(40.24);
		Thread.sleep(2000);
		producer.setApplePrice(200.03);
	}
	
}
