package com.mphasis.singleton;

public class PrinterSpooler {
	private static PrinterSpooler printer;
	private PrinterSpooler() {
		System.out.println("PrinterSpooler Class");
	}
	public static PrinterSpooler getPrinter() {
		if(printer==null)
			printer=new PrinterSpooler();
		return printer;
	}
	public void addJob() {
		System.out.println("Job Added");
	}
	public void processJob() {
		System.out.println("Job Processed");
	}
}
