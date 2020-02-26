package com.epam.week3.akhila;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateIntrest {
	 private static final Logger LOGGER = LogManager.getLogger(CalculateIntrest.class);
	public static void main(String[] args) {
		try
		 {Intrest simpleIntrest=new SimpleIntrest();
	     Intrest compoundIntrest=new CompoundIntrest();
	     simpleIntrest.getPrincipalAmount();	
	     simpleIntrest.getTimePeriod();
	     simpleIntrest.getRateOfIntrest();
	     compoundIntrest.getTerms();
	     compoundIntrest.principalAmount=simpleIntrest.principalAmount;
	     compoundIntrest.timePeriod=simpleIntrest.timePeriod;
	     compoundIntrest.rateOfIntrest=simpleIntrest.rateOfIntrest;
	     LOGGER.info("Simple Intrest is");
	    LOGGER.info(((SimpleIntrest)simpleIntrest).calculateSimpleIntrest());
	    LOGGER.info("Compound Intrest is");
	    LOGGER.info(((CompoundIntrest)compoundIntrest).calculateCompoundIntrest());
		 }
		catch(Exception e) {
			LOGGER.debug(e);
		}
	    
		}


}
