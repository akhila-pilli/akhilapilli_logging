package com.epam.week3.akhila;

public class CompoundIntrest extends Intrest {
	

	double calculateCompoundIntrest()
	{  
		double r= Math.pow((1+(timePeriod*rateOfIntrest)/100),timePeriod*terms);
		return (principalAmount*r-principalAmount);
	}
}
