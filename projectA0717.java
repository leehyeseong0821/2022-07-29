package projectA07;

import java.util.Arrays;
public class projectA0717 {

	public static void main(String[] args) {
		int[]a= new int[100];
//		0~99까지 배열을 초기화 하시오.초기화 값은 1~100
		for(int i=0,j=1;i<a.length;i++,j++) {
			a[i]=j;
			
		}
//		a 배열 요소의 합은
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum= sum+a[i];
		}
		System.out.println("배열요소의 합"+sum);
//		홀수의 합 
	    int sum1=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]%2!=0) {
	    		sum1 = sum1+a[i];
	    	}
	    }
	    System.out.println("홀수의 합"+sum1);
//	    짝수의 합
	    int sum2=0;
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]%2==0) {
	    		sum2= sum2+a[i];
	    	}
	    }
	    System.out.println("짝수의합"+sum2);
//	    b에 a의 짝수값을 읽어오시오
	    int[]b=new int[50];
	    for(int i=0,j=0;i<a.length;i++) {
	    	if(a[i]%2==0) {
	    		b[j]=a[i];
	    		j++;
	    	}
	    }
	    System.out.println(Arrays.toString(b));
//	    c에 a의 홀수값을 읽어오시오.
	    int[]c=new int[50];
	    for(int i=0,j=0;i<a.length;i++) {
	    	if(a[i]%2!=0) {
	    		c[j]=a[i];
	    		j++;
	    	}
	    }
	    System.out.println(Arrays.toString(c));
//	    b+c의 합 
	   int sum5=0;
	   for(int i=0;i<b.length;i++) {
		   sum5 = sum5 +b[i]+c[i];
	   }
	   System.out.println(sum5);
	}
	

}
