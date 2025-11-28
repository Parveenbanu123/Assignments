package com.mphasis.singleton;

public class Main {

	public static void main(String[] args) {
//		Logger log1=Logger.getLogger();
//		log1.log("Logged in using log1");
//       
//       Logger log2=Logger.getLogger();
//       log2.log("Logged in using log2");
//       
//       Logger log3=Logger.getLogger();
//       log3.log("Logged in using log3");
//       
//       System.out.println();
//       
//       ConfigurationManager config1=ConfigurationManager.getConfig();
//       System.out.println(config1.hashCode());
//      
//       ConfigurationManager config2=ConfigurationManager.getConfig();
//       System.out.println(config2.hashCode());
//      
//       ConfigurationManager config3=ConfigurationManager.getConfig();
//       System.out.println(config3.hashCode());
		
		
//		DBConnection con1=DBConnection.getInstance();
//		System.out.println(con1.hashCode());
//      
//		DBConnection con2=DBConnection.getInstance();
//		System.out.println(con2.hashCode());
//      
//		DBConnection con3=DBConnection.getInstance();
//		System.out.println(con3.hashCode());
		
		PrinterSpooler print1=PrinterSpooler.getPrinter();
		print1.addJob();
		print1.processJob();
		System.out.println(print1.hashCode());

       
       PrinterSpooler print2=PrinterSpooler.getPrinter();
       print2.addJob();
       print2.processJob();
       System.out.println(print2.hashCode());

       
       PrinterSpooler print3=PrinterSpooler.getPrinter();
       print3.addJob();
       print3.processJob();
       System.out.println(print3.hashCode());
		
		

       
	}

}
