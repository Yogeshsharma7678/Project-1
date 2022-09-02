/* java program to printall the first 20 disibles of 5
without using looping statement 
 by YOGESH SHARMA
 */
package com.bankApp;

import java.util.stream.Stream;

public class divisibleWithoutLoop {

	public static void main(String[] args) {
		
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(20).forEach(System.out::println);
}
}