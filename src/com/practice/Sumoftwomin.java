package com.practice;

public class Sumoftwomin {
	public static void main(String[] args) {
		int a[]={10,30,20,50,40};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=0;
		for(int i=0;i<2;i++)
		{
			sum=sum+a[i];
		}
			System.out.println("first two minimum no."+sum);
		}
	}


