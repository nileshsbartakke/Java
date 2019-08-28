import java.util.Scanner;

public class if_else2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Grading System..");
		float passingMarks=40;
		char grade;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Your Marks:");
		int marksObtained=scanner.nextInt();
		
		if (marksObtained >= passingMarks) {
		     
		      if (marksObtained > 90)
		        grade = 'A';
		      else if (marksObtained > 75)
		        grade = 'B';
		      else if (marksObtained > 60)
		        grade = 'C';
		      else
		        grade = 'D';
		         
		      System.out.println("You passed the exam and your grade is " + grade);
		    }
		    else {
		      grade = 'F';
		      System.out.println("You failed and your grade is " + grade);
		    }
			
	
	}

}
