import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter Marks");
		marks=scanner.nextInt();
		
		if(marks > 40)
			System.out.println("pass");
		else
			System.out.println("fail");	
	}

}
