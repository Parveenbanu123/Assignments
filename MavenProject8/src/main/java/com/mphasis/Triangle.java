package com.mphasis;

public class Triangle extends Shape {

	@Override
	public Shape type() {
		return new Triangle();

	}

}
