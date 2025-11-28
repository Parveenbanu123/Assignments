package com.mphasis;

public class ComplexNumber {
	int real;
	int img;
	public ComplexNumber(int real, int img) {
		super();
		this.real = real;
		this.img = img;
	}
	public ComplexNumber() {
		super();
	}
	@Override
	public String toString() {
		return "ComplexNumber [real=" + real + ", img=" + img + "]";
	}
	
}
