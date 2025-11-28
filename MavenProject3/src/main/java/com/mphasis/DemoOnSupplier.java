package com.mphasis;

import java.util.function.Supplier;

public class DemoOnSupplier {

	public static void main(String[] args) {
		
		
		String name="Parveen";
		
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		
		Supplier<Integer> randomSupplier=()->(int)Math.round(Math.random()*10000);
		System.out.println(randomSupplier.get());
		
		int a=67,b=89;
		Supplier<Integer> maxSupplier=()->a>b?a:b;
		System.out.println(maxSupplier.get());
		

	}

}
