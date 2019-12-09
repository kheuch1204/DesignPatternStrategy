package com.kheuch;

import java.util.Scanner;

import com.kheuch.Strategy.IStrategy;
public class App {

	public static void main(String[] args) throws Exception {
		
		Context context = new Context();
		
		
		boolean fin =false;
		Scanner scanner = new Scanner(System.in);
		
		while(!fin) {
			System.out.println("Donner la trategie :");
			String strategyClassName = scanner.nextLine();
			
		IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
			context.setStrategy(strategy);
		System.out.println("----------------------------------");
		
		context.process();
		
		}
		
		
		
	/*	
		System.out.println("----------------------------------");
		context.setStrategy(new StrategyImpl2());
		context.process();
		
		
		System.out.println("----------------------------------");
		context.setStrategy(new StrategyImpl3());
		context.process();
		*/
	}

}
	
