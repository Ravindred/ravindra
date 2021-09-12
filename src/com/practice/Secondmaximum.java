package com.practice;

public class Secondmaximum {
	public static void main(String[] args) {
		int a[]={10,30,20,50,40};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("2nd maximum no.is"+ a[1]);
		System.out.println("2nd  minimum no.is"+ a[a.length-2]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
	}


