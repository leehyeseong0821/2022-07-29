package projectA07;

public class projectA0705 {

	public static void main(String[] args) {
		int i;
		int sum=0;
		
		for(i=0;i<=1_000_000;i++) {
			sum= sum+i;
		}
		System.out.println("0에서 1,000,000까지의 합"+sum);
//		while문
		i=0;
		sum=0;
		while(i<=1_000_000) {
			sum = sum+i;
			i++;
		}
		System.out.println("0에서 1,000,000까지의 합"+sum);
//		do while문
		i=0;
		sum=0;
		do {
			sum=sum+i;
			i++;
		}while(i<=1_000_000);
		System.out.println("0에서 1,000,00까지의 합"+sum);
		

	}

}
