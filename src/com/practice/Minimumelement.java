package com.practice;

public class Minimumelement {
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
		System.out.println("1st  minimum no.is"+a[0]);
		System.out.println("1st  maximum no.is"+a[a.length-1]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
