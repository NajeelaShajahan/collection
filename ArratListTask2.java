package com.ebrainpractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArratListTask2 {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number:");
		i=sc.nextInt();
		System.out.println("Enter end number");
		j=sc.nextInt();
		ArrayList<Integer> ll=new ArrayList<Integer>();
		System.out.println("number are:");
		for(int n=i;n<j;n++)
		{
			ll.add(sc.nextInt());
		}
		System.out.println("Arraylist:" +ll);
		System.out.println("1.Sum of all numbers:");
		int sum=0;
		for(Integer value:ll)
		{
			sum+=value;
		}
		System.out.println(sum);
		System.out.println("2.Multiples of all numbers:");
		int sum1=1;
		for(Integer value:ll)
		{
			sum1*=value;
		}
		System.out.println(sum1);
		System.out.println("3.Odd And Even List");
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		for(int n=i;n<j;n++)
		{
			if(n%2==0)
			{
				even.add(n);
			}
			else
			{
				odd.add(n);
			}
		}
		System.out.println(even);
		System.out.println(odd);
		System.out.println("4.Sum and Multiples of even numbers:");
		int sum2=0;
		for(Integer value:even)
		{
			sum2+=value;
		}
		System.out.println("Sum of even numbers:"+sum2);
		int sum5=1;
		for(Integer value:odd)
		{
			sum5*=value;
		}
		System.out.println("Sum of even numbers:" +sum5);
		System.out.println("5.Sum and multiples of odd numbers:");
		int sum3=0;
		for(Integer value:odd)
		{
			sum3+=value;
		}
		System.out.println("Sum of odd numbers:" +sum3);
		int sum4=1;
		for(Integer value:odd)
		{
			sum4*=value;
		}
		System.out.println("Multiples of odd numbers:" +sum4);
	}
	

}
