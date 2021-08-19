package jkhf;

public class fghj11 {
	public static void main(String[] args) {
		int[] arr={90,60,80,55,22};//60,90,80,55,22      //60,80,55,22,90
		int n=arr.length;
		for(int j=1;j<n;j++)        //60,80,90,55,22     //60,55,80,22,90
		{
			for(int i=1;i<n;i++)   //60,80,55,90,22      //60,55,22,80,90
{
	if(arr[i-1]>arr[i])           //60,80,55,22,90
	{
		int temp=arr[i-1];                 //55,60,22,80,90  
		arr[i-1]=arr[i];                   //55,22,60,80,90
		arr[i]=temp;
	}                                      //22,55,60,80,90
}
}
			for(int i=0;i<n;i++)                   //22 55 60 80 90
			{
				System.out.println(arr[i]+" ");
			}

}
}
