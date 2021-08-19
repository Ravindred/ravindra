package jkhf;

public class separate {
	public static void main(String[] args) {
		String s1="royal@$143";
		String s2="";//alphabets
		String s3="";//digits
		String s4="";//special characters
		for(int i=0;i<s1.length();i++)
		{
			if(Character.isAlphabetic(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}
			else if(Character.isDigit(s1.charAt(i)))
			{
				s3=s3+s1.charAt(i);
			}
			else
			{
				s4=s4+s1.charAt(i);
			}
		}
		System.out.println("alphabets-->"+s2);
		System.out.println("numbers-->"+s3);
		System.out.println("special characters-->"+s4);
		
	}

}
