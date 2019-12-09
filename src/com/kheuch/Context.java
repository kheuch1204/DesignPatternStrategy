package com.kheuch;

import com.kheuch.Strategy.DefaultStrategyImpl;
import com.kheuch.Strategy.IStrategy;

public class Context {
	
	private IStrategy strategy;
	
	public Context() {
		this.strategy = new DefaultStrategyImpl();
	}

	
	public void process() {
		strategy.appliquerStrategy();
		
	}


	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

}
