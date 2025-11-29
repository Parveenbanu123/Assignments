package com.mphasis;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

public class GCInfo {

	public static void main(String[] args) throws InterruptedException {
		List<GarbageCollectorMXBean> gcBean=ManagementFactory.getGarbageCollectorMXBeans();
		
		System.out.println("Requesting gc manually");
		System.gc();
		Thread.sleep(10000);
		
		for(GarbageCollectorMXBean gcmx:gcBean) {
			System.out.println("GC Name: "+gcmx.getName());
			System.out.println("Count: "+gcmx.getCollectionCount());
			System.out.println("Time in ms: "+gcmx.getCollectionTime());
			System.out.println("-----------------------------------------");
		}
		
		

	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called");
	}

}
