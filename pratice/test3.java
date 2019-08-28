package pratice;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++)
		{
			System.out.println(fibona(i));
			
		}
		
		
		
		
	}

	public static int fibona(int p)
	{
		if(p==0 )
			return 0;
		else if(p==1||p==2)
			return 1;
	
		return fibona(p-1)+fibona(p-2);
		
	}
}
