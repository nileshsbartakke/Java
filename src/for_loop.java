import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("infinity Loop");
		//for(;;)
		{
			System.out.println("Java Programming");
		}
		
		System.out.println("Simple Number");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Even No");
		for(int i=1;i<10;i++)
		{
			if(i%2==0)
			{
				
				System.out.println(i);
			}
		}
		
		System.out.println("Odd No");
		for(int i=1;i<10;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		
		System.out.println(" Check Prime Number");
		
		int no=13;
		
		for(int i=2;i<no;i++)
		{
			
			if(no%i==0)
			{
				System.out.println("not Prime number");
				break;
			}
			else
			{
				System.out.println("Prime no");
				break;
			}
		}
		
		
		
		
		
		
		
	}
	
}
