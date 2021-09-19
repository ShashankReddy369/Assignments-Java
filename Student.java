package assignments;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		/*
		 * Difference between Interpreter and Compiler
		 * compiler:-
		 * It generates an intermediate machine code
		 * It is best suited for production environment
		 * It converts the entire program in a single go
		 * It is generally used by programming languages such as C,C++,Java
		 * 
		 * Interpreter:-
		 * It doesn't generate an intermediate machine code
		 * It is best suited for software development environment
		 * It converts a single line of code at a time
		 * It is generally used by programming languages such as Python,PHP,Ruby
		 */
		
		String name;
		int rollno;
		float marks;
		
		Scanner SC=new Scanner(System.in);
		
		System.out.print("Enter Name:");
		name=SC.nextLine();
		System.out.print("Enter Roll No.:");
		rollno=SC.nextInt();
		System.out.print("Enter Marks:");
		marks=SC.nextFloat();
		
		System.out.println("Name:"+name);
		System.out.println("Roll No.:"+rollno);
		System.out.println("Marks:"+marks);
		
		
		
		
				
		

	}

}
