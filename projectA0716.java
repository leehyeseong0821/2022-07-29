package projectA07;

import java.util.Scanner;

public class projectA0716 {

	public static void main(String[] args) {
		int[]a=new int[5];
		int sum=0;
		Scanner in = new Scanner(System.in);
//		5개의 정수를 입력받는다.
		for(int i=0;i<a.length;i++) {
			System.out.println("정수를 입력하세요");
			a[i]=Integer.parseInt(in.nextLine());
		}
//		크기비교 
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
         System.out.println("가장 큰수는"+max);
         int min=a[0];
          for(int num:a) {
        	  if(num<min) {
        		  min=num;
        	  }
          }
          System.out.println(min);
          
	}

}
