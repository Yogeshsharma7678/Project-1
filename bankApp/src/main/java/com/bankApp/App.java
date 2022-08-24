package com.bankApp;
import java.util.Scanner;
import static java.lang.System.*;
import com.bankApp.controller.bankController;
import com.bankApp.model.bankModel;

public class App 
{
    public static void main( String[] args )
    {
        bankController bc=new bankController();
        bankModel bm = new bankModel();
        Scanner scan=new Scanner(System.in);
        out.println("\t\t\t******** WELCOME TO NATIONAL BANK *****------");
        out.println("Enter account Holder Name");
        String accHolderName=scan.next();
        bm.setAccHolderName(accHolderName);
        try
        {
        	//validg username
        	if(bc.checkUsername(bm))
        	{
        		  out.println("Enter Password for your account ");
        	        String accPassword=scan.next();
        	        bm.setAccPassword(accPassword);
        	        try {
        	        	//valid password
        	        		if(bc.checkPassword(bm))
        	        		{
        	        			out.println("Enter account number ");
        	        	        int accNumber = scan.nextInt();
        	        	        bm.setAccNumber(accNumber);
        	        	        out.println("Enter Minimum balance");
        	        	        int accBalance=scan.nextInt();
        	        	        bm.setAccBalance(accBalance);
        	        	        out.println("------your details------");
        	                    out.println(bm.toString());
        	                    //performing baking operations
        	                   int op=0;
        	                    while(op<3)
        	                    {
        	                    out.println("Select Operation \n Press 1 for Deposit \n Press 2 for Withdraw \n Press 3 for Exit");
        	                   op=scan.nextInt();
        	                    switch(op) {
        	                    // fill for deposit method
        	                    case 1->
        	                    {
        	                    	out.println("Enter password to deposit");
        	                    	String pwd=scan.next();
        	                    	try {
        	                    		if(bc.toDeposit(bm, pwd)) 
        	                    		{
        	                    		out.println("Enter amount to deposit");
        	                    		int newAmt=scan.nextInt();
        	                    		bm.depositAmount(newAmt);
        	                    		out.println("your account balance is :"+bm.getAccBalance());	
        	                    		}
        	                    	}
        	                    	catch(Exception e)
        	                    	{
        	                    		out.println(e.getMessage());
        	                    	}
        	                    	
        	                    }
        	                    //fill for withdraw method
        	                    case 2->
        	                    
        	                    {
        	                    	out.println("Enter password to withdraw");
        	                    	String pwd=scan.next();
        	                    	out.println("Enter amount to withdraw");
    	                    		int newAmt=scan.nextInt();
    	                    		try {
    	                    			if(bc.toWithdraw(bm, pwd, newAmt)) {
    	                    				bm.withdrawAmount(newAmt);
    	                    				out.println("Withdraw successfull \nyour account balance is : "+bm.getAccBalance());
    	                    			}
    	                    		}
    	                    		catch(Exception e) {
    	                    			out.println(e.getMessage());
    	                    		}
        	                    }
        	                    	default->System.exit(0);
        	                    
        	                    }
        	                    }
        	        		}
        	        }
        	        catch(Exception e) {
        	        	out.println(e.getMessage());
        	        }
        	}
        }
        catch(Exception e)
        {
        	out.println(e.getMessage());
        	System.exit(0);
        }
        scan.close();
    }
}