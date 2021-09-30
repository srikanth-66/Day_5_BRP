package com.home;
import java.util.Scanner;

public class SeggregateZerosNOnesInArray
{
	public void seggragateZerosnOnes(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
				count++;
		}
		for(int i=0;i<count;i++)
			arr[i]=0;
		for(int i=count;i<n;i++)
			arr[i]=1;
	}
	public void printArray(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		SeggregateZerosNOnesInArray zno=new SeggregateZerosNOnesInArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
        int n = arr.length;
		System.out.println("Enter the values into the Array only 0's and 1's");
		try 
		{
			for(int i=0;i<n;i++)
			{
				int num=sc.nextInt();
				if(num<=1)
				{
					arr[i]=num;
				}
				else
					System.out.println("please only enter the 0's and 1's");
			}
		}
		catch(Exception e) {System.out.println(e);	}
		System.out.println("the Array of elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		zno.seggragateZerosnOnes(arr, n);
		zno.printArray(arr, n);		
	}
}