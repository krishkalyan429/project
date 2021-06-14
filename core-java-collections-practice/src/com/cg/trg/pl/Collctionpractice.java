package com.cg.trg.pl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.cg.trg.service.Product;

public class Collctionpractice {

	public static void main(String[] args) {
		Product door = new Product( "WoddenDoor",  250);
		Product phone = new Product( "Oppo", 500);
		Product laptop = new Product("LenovoYOGA520",2000);
       Collection<Product> product = new ArrayList<>();
       product.add(door);
       product.add(phone);
       product.add(laptop);
//       System.out.println(product.isEmpty());
//       System.out.println(product.contains(door));
//       System.out.println(product.size());
    Iterator<Product> iterator = product.iterator();
//    while(iterator.hasNext()) {
//   	   Product product1 = iterator.next();
//   	   System.out.println(product1);
//      }
    while(iterator.hasNext()) {
    	   Product product1 = iterator.next();
    	   if(product1.getWeight() > 1000) {
    		   iterator.remove();
    	   }
    	  
       }
    System.out.println(product);
	} 

}
