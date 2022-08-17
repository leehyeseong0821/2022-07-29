package projectA07;

public class projectA0703 {

	public static void main(String[] args) {
//		1~100까지
		for(int i=1;i<=100;i=i+2) {
			System.out.println(i);
		}
		int i=1;
		while(i<=100) {
			System.out.print(i+"->"+"홀수입니다.");
			i=i+2;
		}
		System.out.println();
		i=1;
		do {
			System.out.print(i+"->"+"홀수입니다.");
			i=i+2;
		}while(i<=100);
		
	}

}
