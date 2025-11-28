package com.mphasis;

public class PrimeChannel extends Video {

	public PrimeChannel(ProcessingQuality quality) {
		super(quality);
		
	}

	@Override
	public void playVideo() {
		System.out.print("Playing video in prime with ");
		quality.processVideo(null);

	}

}
