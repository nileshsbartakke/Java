package pratice;

public class test1 {
	public  static void palimdrome()
	{
		String str1="katak";
		
		String rev="";		
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			
			rev=rev+str1.charAt(i);
		}
		if(rev.equals(str1))
			System.out.println("palimdrome");
		else
			System.out.println("Not a Palimdoe");
	}
	
	public static void number_palimdrm()
	{
		
		int num=521,dig;
		int rev=0;
		int temp=num;
		
		while(num > 0) {
			
			dig=num%10;
			rev=rev*10+dig;
			num=num/10;
			
		}
		if(rev==temp)
			System.out.println("palimdrome number ");
		else
			System.out.println("not a palindrome ");
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//palimdrome();
		//number_palimdrm();
		int a=0,b=1,c;
		int num=10;
		while(num!=0)
		{
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
			num--;
		}
		
		
		
		
	}

}
