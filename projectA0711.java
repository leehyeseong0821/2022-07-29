package projectA07;

public class projectA0711 {

	public static void main(String[] args) {
	int []arry =new int[3];
	for(int i=0;i<3;i++) {
		System.out.println(i+"번째 값은"+arry[i]);
	}
	arry[0]=10;
	arry[1]=20;
	arry[2]=30;
	System.out.println();
	for(int i=0;i<3;i++) {
		System.out.println(i+"번째 값은"+arry[i]);
	}
	System.out.println();
	double[]arry1=new double[3];
	for(int i=0;i<3;i++) {
		System.out.println(i+"번째 값은"+arry1[i]);
	}
	arry1[0]=0.1;
	arry1[1]=0.2;
	arry1[2]=0.3;
	for(int i=0;i<3;i++) {
		System.out.println(i+"번째 값은"+arry1[i]);
	}
	System.out.println();
	String[]arr3= new String[3];
	for(int i=0;i<3;i++)
	{
		System.out.println(i+"번째 값은"+arr3[i]);
		
	}
    arr3[0]="1월";
    arr3[1]="2월";
    arr3[2]="3월";
    System.out.println();
    for(int i=0;i<3;i++) {
    	System.out.println(i+"번째 값은"+arr3[i]);
    }
    	
		
	}

}
