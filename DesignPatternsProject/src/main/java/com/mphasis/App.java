package com.mphasis;


public class App {
    public static void main(String[] args) {
    	//Singleton Pattern
    	
//        DBConnection con1=DBConnection.getInstance();
//        System.out.println(con1.hashCode());
//        
//        DBConnection con2=DBConnection.getInstance();
//        System.out.println(con2.hashCode());
//        
//        DBConnection con3=DBConnection.getInstance();
//        System.out.println(con3.hashCode());
    	
    	
    	//Factory Pattern
    	
//    	Shape s=ShapesFactory.getShape("circle");
//    	s.draw();
//    	
//    	Shape s1=ShapesFactory.getShape("square");
//    	s1.draw();
    	
    	//Abstract Factory Pattern
    	
//    	GUIFactory win=new WinFactory();
//    	Button winbutton=win.createButton();
//    	CheckBox winbox=win.createCheckBox();
//    	winbutton.click();
//    	winbox.check();
//    	
//    	GUIFactory mac=new Macfactory();
//    	Button macbutton=mac.createButton();
//    	CheckBox macbox=mac.createCheckBox();
//    	macbutton.click();
//    	macbox.check();
    	
    	//Builder Pattern
    	
//    	Pizza pizza=new Pizza.Builder("medium")
//    			.cheese(true)
//    			.olives(false)
//    			.build();
//    	
//    	System.out.println(pizza);
    	
    	//Template method Pattern--behavioral 
    	
//    	DrinkMaker tea=new TeaMaker();
//    	tea.prepareDrink();
//    	
//    	System.out.println();
//    	
//    	DrinkMaker coffee=new CoffeeMaker();
//    	coffee.prepareDrink();
    	
    	//Bridge Pattern--structural
    	
//    	Video youtubeHD=new Youtube(new HDProcessing());
//    	youtubeHD.playVideo();
//    		
//    	Video youtube4K=new Youtube(new FourKProcessing());
//    	youtube4K.playVideo();
//    	
//    	Video youtube8k=new Youtube(new EightKProcessing());
//    	youtube8k.playVideo();
//    	
//    	Video primeHD=new PrimeChannel(new HDProcessing());
//    	primeHD.playVideo();
//    	
//    	Video prime4K=new PrimeChannel(new FourKProcessing());
//    	prime4K.playVideo();
//    	
//    	Video prime8k=new PrimeChannel(new EightKProcessing());
//    	prime8k.playVideo();
    	
    	//Proxy Pattern
    	
    	Payment netBanking=new NetBanking();
    	netBanking.pay(5000);
    	
    	System.out.println();
    	
    	Payment upi=new UPIPayment();
    	upi.pay(3000);
    	
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
