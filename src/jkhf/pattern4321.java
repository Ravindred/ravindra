package jkhf;

public class pattern4321 {
	public static void main(String[] args) {
		int space=0;
		int no=4;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=no;k>=1;k--)
			{
				System.out.print(k);
			}
			space++;
			no--;
			System.out.println();
		}
	}

}
