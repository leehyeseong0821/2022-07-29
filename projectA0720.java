package projectA07;

import java.util.Arrays;

public class projectA0720 {

	public static void main(String[] args) {
	float[]fa=new float[100];
// 1~100까지 배열을 초기화
	for(int i=0;i<fa.length;i++) {
		fa[i]=(float)(i+1);
	}
	System.out.println(Arrays.toString(fa));
// 합 
 float sum=0.0f;
 for(int i=0;i<fa.length;i++) {
	 sum= sum+fa[i];
	}
    System.out.println("합은:"+sum);
//    fa에 모든 요소에 0.5를 더하시오.
    for(int i=0;i<fa.length;i++) {
    	fa[i]=fa[i]+0.5f;
    }
    System.out.println(Arrays.toString(fa));
//    fa에 모든 요소에 -0.5를 하시오
    for(int i=0;i<fa.length;i++) {
    	fa[i]=fa[i]-0.5f;
    }
    System.out.println(Arrays.toString(fa));
//    fa에 모든 요소에 10을곱하시오
    for(int i=0;i<fa.length;i++) {
    	fa[i]=fa[i]*10;
    }
    System.out.println(Arrays.toString(fa));
	}

}
