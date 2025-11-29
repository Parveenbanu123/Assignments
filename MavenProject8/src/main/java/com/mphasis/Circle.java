package com.mphasis;

public class Circle extends Shape {

	@Override
	public Shape type() {
		return new Circle();

	}

}
