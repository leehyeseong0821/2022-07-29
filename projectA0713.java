package projectA07;

public class projectA0713 {

	public static void main(String[] args) {
	if(args.length !=2) {//!=아니면
		System.out.println("프로그램의 사용법");
        System.out.println("java projectA0713");
        System.exit(0);
	}
	String str=args[0];
	String str1=args[1];
	
	
	int num = Integer.parseInt(str);
	int num1 = Integer.parseInt(str1);
	int result = num+num1;
	System.out.println(num+"+"+num1+"="+result);
	}

}
