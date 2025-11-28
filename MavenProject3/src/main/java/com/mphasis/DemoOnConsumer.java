package com.mphasis;

import java.util.Arrays;
import java.util.function.Consumer;

public class DemoOnConsumer {

	public static void main(String[] args) {
		int num=7;
		Consumer<Integer> squareConsumer=(n)->System.out.println(n*n);
		squareConsumer.accept(num);
		
		
		Consumer<Integer[]> sortConsumer=(arr)->
		{
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
		};
		Integer[] arr= {23,12,34,54,67,87,90,89,7,49,38,59,28};
		sortConsumer.accept(arr);
		
		Employee e1=new Employee(338,"Parveen",25000);
		Employee e2=new Employee(347,"Saranya",30000);
		Employee e3=new Employee(349,"Sathis",19000);
		Employee e4=new Employee(304,"Arthika",20000);
		Employee e5=new Employee(340,"Praveenkumar",27000);
		
		Employee emparr[]= {e1,e2,e3,e4,e5};
		Consumer<Employee[]> printConsumer=(err)->{
			for(Employee e:err) {
				System.out.println(e.getName());
			}
		};
		printConsumer.accept(emparr);
		
		

	}

}
