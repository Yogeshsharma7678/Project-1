package com.bankApp;

import java.util.Comparator;

public class IdComparator implements Comparator <student>{
	
	@Override
	public int compare(student s1, student s2) {
		
		if(s1.studentId==s2.studentId)
		// TODO Auto-generated method stub
		return 0;
		
		if(s1.studentId>s2.studentId)
			
	    return 1;
		
		else
			
	    return -1;
	
	}

}
