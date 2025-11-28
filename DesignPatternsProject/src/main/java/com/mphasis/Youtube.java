package com.mphasis;

public class Youtube extends Video {

	public Youtube(ProcessingQuality quality) {
		super(quality);
	}

	@Override
	public void playVideo() {
		System.out.print("Playing video in Youtube with ");
		quality.processVideo(null);
		
	}

}
