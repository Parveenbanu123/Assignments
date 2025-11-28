package com.mphasis;

public class Macfactory implements GUIFactory {

	@Override
	public Button createButton() {
		
		return new MacButton();
	}

	@Override
	public CheckBox createCheckBox() {
		
		return new MacCheckBox();
	}

}
