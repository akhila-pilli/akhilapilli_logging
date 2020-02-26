package com.epam.week3.akhila;

//import java.io.*;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Intrest{
float principalAmount;
float timePeriod;
float rateOfIntrest;
int terms;
 private static final Logger LOGGER = LogManager.getLogger(Intrest.class);
Scanner s= new Scanner(System.in);
void getPrincipalAmount()
{	
	LOGGER.info("\n enter principal amount:");
	principalAmount=s.nextFloat();
	
}
void getTimePeriod()
{	//Scanner p= new Scanner(System.in);
	LOGGER.info("\n enter timePeriod:");
	timePeriod=s.nextFloat();
	
}
void getRateOfIntrest()
{	//Scanner s= new Scanner(System.in);
	LOGGER.info("\n enter RateOfIntrest:");
	rateOfIntrest=s.nextFloat();
}
void getTerms()
{
	System.out.println("\n enter number of terms:");
	terms=s.nextInt();
}


}
