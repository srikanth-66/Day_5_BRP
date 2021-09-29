package com.home;

import java.util.Scanner;

public class FlopCoin 
{
	public static void main(String[] args) {
		int flip;
		System.out.println("Enter number of times to flip::");
	 	Scanner sc = new Scanner(System.in);
	 	flip = sc.nextInt();

        System.out.println("number of times are " +flip);
        int i=1;
        int head = 0;
        int tail = 0;
        while(i<=flip) {
        if(Math.random()<0.5) 
              {
				System.out.println("heads");
				head=(head+1);
              }
        	else 
        	  {
					System.out.println("tails");
					tail=(tail+1);
	          }
        	   i++;
}	


        double headpercentage= (head*100)/flip;
        double tailpercentage= 100 - headpercentage; 
        System.out.println("heads percentage is " + headpercentage);
        System.out.println("tails percentage is " + tailpercentage );

	}
}
