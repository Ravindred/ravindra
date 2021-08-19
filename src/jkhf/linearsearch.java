package jkhf;

public class linearsearch {
	public static void main(String[] args) {
		int arr[]={28,69,48,62,78,35};
		int find=42;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==find)
			{
				System.out.println("Hey I got the element");
			}
			else
			{
				System.out.println("not found");
			}
		}
	}

}
