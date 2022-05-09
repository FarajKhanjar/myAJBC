package bootcamp.basic.loops;

import java.util.Scanner;

public class Detector_ex {

	public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
		
       	//The Detector Exercise. Count how many times the number 1, -1, 0 will be entered.
		System.out.println("Enter number of the parts:");
		int num = scanner.nextInt();
		int cnt1=0,cnt2=0,cnt3=0;

		for(int i=0; i<num; i++)
		{
			System.out.println("Enter produce status (1 or -1 or 0):");
			int sta = scanner.nextInt(); //produce status (1 or -1 or 0)
			if(sta == 1) {
				cnt1++; //fixedPatrs
			}
			else if(sta == -1){
				cnt2++; //rejectParts
			}
			else {
				cnt3++; //shippedParts
			}
		}
		System.out.println(cnt1+" "+cnt2+" "+cnt3);
		scanner.close();
	}

}
