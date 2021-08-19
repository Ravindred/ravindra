package jkhf;

public class fghj7 {
	public static void main(String[] args) {
		int[] arr={90,65,84,52,25};//01234      //90,65,84,52,25
		int n=arr.length;//5
		for(int j=1;j<n;j++)                    //65,90,84,52,25
		{
			for(int i=1;i<n;i++){              //65,84,90,52,25
				if(arr[i-1]>arr[i])
				{                              //65,84,52,90,25
					int temp=arr[i-1];
					arr[i-1]=arr[i];           //65,84,52,25,90
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
