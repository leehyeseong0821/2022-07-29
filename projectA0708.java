package projectA07;

public class projectA0708 {

	public static void main(String[] args) {
		int []score= {83,90,87};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		int sum=0;
		for(int i=0;i<3;i++) {
			sum= sum +score[i];
		}
		System.out.println("합은:"+sum);
		double avg = (double)sum/3;
		System.out.println("평균은:"+avg);
		
	}

}
