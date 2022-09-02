/*Java program to perform sorting 
operations with comparator interface
by YOGESH SHARMA
*/
package com.bankApp;                     //importing bankAapp package
 

import java.util.ArrayList;             //importing arraylist package 

import java.util.Collections;          //importing collection package

public class classroom {

	//main method of the proggram
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    student s1 = new student(21 ,"Yuvi", 16 , 44);                     //declaration of student 1
	    
	    student s2 = new student(15 , "mohit" ,18, 49);                     //declaration of student 2
	    
	    student s3 = new student(16 , "Preet" ,19, 48);                     //declaration of student 3
	    
	    student s4 = new student(14 , "mohit" ,20, 33);                     //declaration of student 4
	    
	    ArrayList <student> all = new ArrayList <student>();          //declare an array list to store values
	    
	    all.add(s1);
	    
	    all.add(s2);
	    
	    all.add(s3);
	    
	    all.add(s4);
	    
	    System.out.println("----Student based on Id----");
	    
	    Collections.sort(all, new IdComparator());                            // sorting using id comparator
	    
	    for(student s:all)
	    	
	    System.out.println(s.studentId +" is id of " +s.studentName+ " age is " +s.studentAge + " and marks is " +s.studentMarks);
	    
	    System.out.println("----Student based on Age----");
	    
	    Collections.sort(all , new AgeComparator());                                //   sorting using age comparator
	    
	    for(student s:all)
	    	
		    System.out.println(s.studentId+ " is id of "+ s.studentName + " age is " + s.studentAge + " and marks is " +s.studentMarks);
	    
	    System.out.println("----Student based on Marks----");
	    
	    Collections.sort(all , new MarksComparator());                             // sorting using marks comparator    
	    
	    for(student s:all)
	    	
		    System.out.println(s.studentId +" is id of " + s.studentName + " age is " +s.studentAge + " and marks is " +s.studentMarks);
	}

}
