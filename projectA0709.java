package projectA07;

public class projectA0709 {

	public static void main(String[] args) {
	int []score;
	
	score = new int[] {83,90,87};
	 int sum=0;
	 for(int i=0;i<3;i++) {
		 sum = sum+score[i];
	 }
	 System.out.println("총합:"+sum);
	 double avg =(double)sum/3;
	 System.out.println(avg);
	 score = new int[] {80,90,70};
	 int sum1=0;
	 for(int i=0;i<3;i++) {
		 sum1 =sum1+score[i];
	 }
	 System.out.println("총합은:"+sum1);
	 double avg1=(double)sum1/3;
	 System.out.println("평균은:"+avg1);
		
	}

}
