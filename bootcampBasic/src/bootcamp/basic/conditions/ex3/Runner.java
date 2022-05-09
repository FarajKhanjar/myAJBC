package bootcamp.basic.conditions.ex3;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// question 3: Calculating the amount of money for a wedding
		int sum=0, family=0;
		System.out.println("To help you calculate the amount of money for a wedding, Answer YES=1/NO=0 :)");
		System.out.println("Are the bride or groom your close friends?:");
		int friend = scanner.nextInt();
		if(friend==0) {
		System.out.println("Are the bride or groom your family members?:");
		family = scanner.nextInt();
		if(family==1) {
			sum=1000;
		}
		}
		else{
			sum=500;
			System.out.println("Has the acquaintance between you and the groom or bride been over 3 years?:");
			int acq = scanner.nextInt(); //acquaintance
			if(acq==1) {
				sum+=50;
			}
			System.out.println("Is your travel distance to a wedding over an hour?:");
			int dis = scanner.nextInt(); //distance
			if(dis==1) {
				sum-=50;
			}		
		}
		if(friend==0 && family==0) {
			sum=250;
			System.out.println("Has the acquaintance between you and the groom or bride been over 3 years?:");
			int acq = scanner.nextInt(); //acquaintance
			if(acq==1) {
				sum+=50;
			}
			System.out.println("Is your travel distance to a wedding over an hour?:");
			int dis = scanner.nextInt(); //distance
			if(dis==1) {
				sum-=50;
			}
		}
		System.out.println("The amount of money for the wedding: "+sum);	
	
	
		
	/*	 question 7: Calculation of a student's final grade based on 
		an exam score, homework score, number of homework submitted. */
	/*	System.out.println("Enter your exam score:");
		int examScore = scanner.nextInt();
		System.out.println("Enter your homework score:");
		int HWScore = scanner.nextInt();
		System.out.println("Enter number of homeworks that you submitted:");
		int numSubmittedHW = scanner.nextInt();
		
		float finalScore=0;
		if((numSubmittedHW==5 || numSubmittedHW==6) && examScore<=54) {
			finalScore=examScore;
		}
		else if((numSubmittedHW==5 || numSubmittedHW==6) && examScore>54) {
			finalScore=examScore*0.80f+ HWScore*0.20f;
		}
		else if((numSubmittedHW==7 || numSubmittedHW==8) && examScore<=54 && HWScore>=80) {
			float tmp=examScore*0.75f+ HWScore*0.25f; // Auxiliary variable for calculating a Valid-score (TAKIF Grade)
			if(tmp>examScore) {
				finalScore=tmp;
			}
			else {
				finalScore=examScore;
			}
		}
		else if((numSubmittedHW==7 || numSubmittedHW==8) && examScore<=54 && HWScore<80) {
			float tmp=examScore*0.80f+ HWScore*0.20f; // Auxiliary variable for calculating a Protective-score (MAGIN Grade)
			if(tmp>examScore) {
				finalScore=tmp;
			}
			else {
				finalScore=examScore;
			}		
		}
		else if((numSubmittedHW==7 || numSubmittedHW==8) && examScore>54) {
			float tmp=examScore*0.70f+ HWScore*0.30f; // Auxiliary variable for calculating a Protective-score (MAGIN Grade)
			if(tmp>examScore) {
				finalScore=tmp;
			}
			else {
				finalScore=examScore;
			}
		}
		else {
			finalScore=0;
		}
		System.out.println("Your final score in the course is: "+finalScore);
	*/
		scanner.close();
	}

}
