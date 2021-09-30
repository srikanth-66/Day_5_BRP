package com.home;

import java.util.Scanner;

public class NonRepeatingElemnts
{
	public static int nonrepeatelement(int arr[],int n)
	{
		int i=0;
		for( i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j] && i!=j)
					break;
				if(j==i) 
				{
					System.out.println("the non repeting elemnts are");
					System.out.println(arr[i]);}}
		}
		return -1;
		
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		NonRepeatingElemnts nre=new NonRepeatingElemnts();
		System.out.println("enter the size of the array");
		int size=input.nextInt();
		int arr[]=new int [size];
		int n=arr.length;
		System.out.println("enter the elemnts into the array");
		for(int i=0;i<n;i++)
		{
			int num=input.nextInt();
			arr[i]=num;
		}
		System.out.println("Displaying the user entered array elemnts");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		nre.nonrepeatelement(arr, n);
		
	}

}
