package projectA07;

import java.util.Scanner;

public class projectA0719 {

	public static void main(String[] args) {
	
		float[]std =new float[3];
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<std.length;i++) {
			std[i]= Float.parseFloat(in.nextLine());
			
		}
		float sum=0;
		float avg=0;
//		평균을 계산하시오.
		for(int i=0;i<std.length;i++) {
			sum= sum+std[i];
		}
		System.out.println("합은:"+sum);
		avg= sum/std.length;
		System.out.println("평균은:"+avg);
		
	}

}
