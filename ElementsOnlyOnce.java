package com.home;
import java.util.Scanner;

public class ElementsOnlyOnce 
{
    static void printDistinct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            	if (arr[i] == arr[j])
            		break;
            	if (i == j)
            		System.out.print( arr[i] + " ");
        }
    }
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter The size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
        int n = arr.length;
		System.out.println("Enter the values into the Array ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("the Array of elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
        printDistinct(arr, n);
    }
}