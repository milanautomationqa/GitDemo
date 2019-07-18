package com.interview.testiFrame;

import java.util.*;

	//This test is for the Day 12 of hacker rank contest
	class Person {
		
		protected String firstName;
		protected String lastName;
		protected int idNumber;
		
		// Constructor
		Person(String firstName, String lastName, int identification){
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = identification;
		}
		
		// Print person data
		public void printPerson(){
			 System.out.println(
					"Name: " + lastName + ", " + firstName 
				+ 	"\nID: " + idNumber); 
		}
		 
	}

	class Student extends Person{
		
		float AvgMarks;
		char awardedGrade;
		
		Student(String firstName, String lastName, int id, int[] scores)
		{
			super(firstName, lastName, id);
			int totalMarks=0;
						
			int arr_len = scores.length;
			
			for(int i=0;i<arr_len;i++)
            {
				totalMarks=totalMarks+scores[i];            	
            }
			
			this.AvgMarks = totalMarks/((float)arr_len);
			System.out.println(AvgMarks);
		}

	    char calculate()
	    {
	    	if(AvgMarks>=90 && AvgMarks<=100)
	    		awardedGrade='O';
	    	if(AvgMarks>=80 && AvgMarks<90)
	    		awardedGrade='E';
	    	if(AvgMarks>=70 && AvgMarks<80)
	    		awardedGrade='A';
	    	if(AvgMarks>=55 && AvgMarks<70)
	    		awardedGrade='P';
	    	if(AvgMarks>=40 && AvgMarks<55)
	    		awardedGrade='D';
	    	if(AvgMarks<40)
	    		awardedGrade='T';
	    	return awardedGrade;
	    }
	}

	class TestInheritance {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String firstName = scan.next();
			String lastName = scan.next();
			int id = scan.nextInt();
			int numScores = scan.nextInt();
			int[] testScores = new int[numScores];
			for(int i = 0; i < numScores; i++){
				testScores[i] = scan.nextInt();
			}
			scan.close();
			
			Student s = new Student(firstName, lastName, id, testScores);
			s.printPerson();
			System.out.println("Grade: " + s.calculate() );
		}
	}