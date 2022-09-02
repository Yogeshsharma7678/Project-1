/*
java program to create a text file
and write /read data in file using 
file handling
*Yogesh Sharma
*/
package com.bankApp;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//importing essential packages 

class textFile {

 public static void main(String []args) throws IOException{
 
 Scanner sc = new Scanner(System.in);         //creaion of scanner object
 
 System.out.println("--enter the data---");
 
 String data=sc.nextLine();                    /*variable declaration to 
                                                  perform operation in file*/
 
 File f1=new File("C:\\Users\\Admin\\Documents\\yuvi.txt");
 //address for file
 
 FileWriter fw= new FileWriter(f1);             //object to write data

 
 //method to write data in file
 fw.write(data);
 
 System.out.println(f1.getName() +" is generated");
 
 fw.close();                    //closing of filewriter object
 sc.close();                    //closing of scanner object
 }
}
