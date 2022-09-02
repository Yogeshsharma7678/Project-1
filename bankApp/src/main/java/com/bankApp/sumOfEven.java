package com.bankApp;

import java.util.ArrayList;

public class sumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> al= new ArrayList<Integer>();
         al.add(15);
         al.add(50);
         al.add(55);
         al.add(17);
         al.add(18);
         int sum =al.stream().filter(i->i%2==0).reduce(0,(i,j)->i+j);
         
         System.out.println("Sum of even numbers :"+sum);
         
	}

}
