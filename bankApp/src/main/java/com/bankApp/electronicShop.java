/* java program to sort the laptop using
 * stram api feature
 * by YOGESH SHARMA
 */

package com.bankApp;

import java.util.ArrayList;  
public class electronicShop {

	public static void main(String[] args) {
	
		int Al = 0;
		electronicsItem e1=new electronicsItem(Al,"Television","Samsung",40000,"Smart Tv");
		electronicsItem e2=new electronicsItem(Al,"Watch","iwatch",30000,"iphne");
		electronicsItem e3=new electronicsItem(Al,"Cellphoe","Apple",45000,"iphone 11");
		electronicsItem e4=new electronicsItem(Al,"Laptop","Asus",80000,"Asus A3");
		electronicsItem e5=new electronicsItem(Al,"Laptop","Apple",90000,"macBook 2 pro");
		
		ArrayList<electronicsItem> Al1=new ArrayList<electronicsItem>();
		Al1.add(e1);
		Al1.add(e2);
		Al1.add(e3);
		Al1.add(e4);
		Al1.add(e5);
		
		 Al1.stream()
         .filter(cost->cost.ePrice>30000)
         .filter(cost->(cost.eName=="Laptop"))
         .forEach(cost->{
             System.out.println(cost.eCompany+" "+cost.eName+" Rs: "+cost.ePrice +"Model" +cost.eModel);

         });

		
		
		
		
	}

}
