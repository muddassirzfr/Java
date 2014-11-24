/*
*Description Creation of two classes to simulate a teacher and a student interacting
*/

import java.util.Scanner;

public class Student
{
	Scanner scan = new Scanner(System.in);

	private String name;

	public Student(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public String calculateFinalGrade()
	{

		System.out.println("Enter score for: ");
		System.out.print("Test 1 - ");
		int test1 = scan.nextInt();
		System.out.print("Test 2 - ");
		int test2 = scan.nextInt();
		System.out.print("Test 3 - ");
		int test3 = scan.nextInt();
		System.out.print("Test 4 - ");
		int test4 = scan.nextInt();
		System.out.print("Test 5 - ");
		int test5 = scan.nextInt();

		double test1Weight = .15 * test1;
		double test2Weight = .15 * test2;
		double test3Weight = .20 * test3;
		double test4Weight = .20 * test4;
		double test5Weight = .30 * test5;

		double grade = test1Weight + test2Weight + test3Weight + test4Weight + test5Weight;

		System.out.println("The student's grade is " + grade);

		String letter = "";

		if (grade >= 90)
		{
			letter = "A";
		}
		else if (grade < 90 && grade >= 85)
		{
			letter = "B";
		}
		else if (grade < 85 && grade >= 75)
		{
			letter = "C";
		}
		else if (grade < 75)
		{
			letter = "D";
		}

		return letter;
	}
}
