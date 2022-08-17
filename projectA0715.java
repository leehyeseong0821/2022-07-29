package projectA07;

import java.util.Scanner;

public class projectA0715 {

	public static void main(String[] args) {
		int[]Array =new int[5];
		int sum=0;
		Scanner in =new Scanner(System.in);
		
//		입력받는부분
		for(int i=0;i<Array.length;i++) {
			System.out.println("정수를 입력하세요");
			Array[i]=Integer.parseInt(in.nextLine());
		}
//		더하기
		for(int i=0;i<Array.length;i++) {
			sum= sum+Array[i];
		}
		System.out.println("합은"+sum);
		System.out.println("평균은"+(sum/5));
		
	}

}
