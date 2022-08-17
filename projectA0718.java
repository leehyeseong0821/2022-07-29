package projectA07;

public class projectA0718 {

	public static void main(String[] args) {
	 int[] std1 = new int[3];
	 int[] std2 = new int[3];
	 std1[0]=90; //국어
	 std1[1]=80; //영어
	 std1[2]=70; //수학
	 
	 std2[0]=90; //국어
	 std2[1]=80; //영어
	 std2[2]=80; //수학
	 
	 int grade=0;
	 for(int i=0;i<std1.length;i++) {
		 grade = grade + std1[i];
	 }
	 int grade1=0;
	 for(int i=0;i<std2.length;i++) {
		 grade1 = grade1 + std2[i];
	 }
	 System.out.println("총합:"+grade);
	 System.out.println("평균:"+(grade/std1.length));
	 System.out.println("총합:"+grade1);
	 System.out.println("평균:"+(grade1/std2.length));
//	  std1 영어 점수를 출력하시오 
//	  std2 국어 점수를 출력하시오
	 System.out.println("영어점수:"+std1[1]);
	 System.out.println("국어점수:"+std2[0]);
//   국어점수의 평균 
	 System.out.println("국어평균:"+((std1[0]+std2[0])/2));
//	 영어점수의 평균
	 System.out.println("영어평균:"+((std1[1]+std2[1])/2));
//	 수학점수의 평균
	 System.out.println("수학평균:"+((std1[2]+std2[2])/2));
	}

}
