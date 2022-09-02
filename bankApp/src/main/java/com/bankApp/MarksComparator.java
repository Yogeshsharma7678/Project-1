package com.bankApp;

import java.util.Comparator;

public class MarksComparator implements Comparator<student> {

	@Override
	public int compare(student s1, student s2) {
		// TODO Auto-generated method stub
		if(s1.studentMarks== s2.studentMarks)
		
		return 0;
		
		if(s1.studentMarks > s2.studentMarks)
			
			return 1;
		
		else
			
			return -1;
	
	}

}
