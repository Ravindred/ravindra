package jkhf;

public class rangeofprime {
	public static void main(String[] args) {
		for(int j=2;j<=10;j++)
		{
			int no=j;
			boolean flag=true;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=false;
				}
			}
			if(flag==true)
			{
				System.out.println("prime no"+ no);
			}
		}
	}

}
