/*java program to illustrate synchronized method 
  in multthreading
 by YOGESH SHARMA
 */
package com.bankApp;
 class bookTicket{

   int total_seat = 20;
   
   synchronized void bookSeat(int seat){                //CREATION OF SYNCHRONIZED METHOD 
   
   if (total_seat>=seat){
   
     System.out.println("seat booked successfully");
	 
	 
	 total_seat = total_seat - seat;
	 
	 
	 System.out.println("seat left"+ total_seat);
  
     }
    else{
	
	System.out.println("seat cn't booked");
	
     }

   }    
 }
 
 public class movieBook extends Thread {
 
     static bookTicket b;
	 
	 int seat;
	 
	 public void run()
	 {
	 
	 b.bookSeat(seat);
	 
	 }

  public static void main(String []args)
  {
     b = new bookTicket();                        //calling bookticket method using instance
	
	movieBook yuvi = new movieBook();
	yuvi.seat=10;
	yuvi.start();
	
	movieBook mohit = new movieBook();
	mohit.seat =8;
	mohit.start();
   
  }
}
