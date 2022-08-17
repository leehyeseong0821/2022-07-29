package projectA07;

public class projectA0706 {

	public static void main(String[] args) {
	   int i;
	   int sum=0;
	   i=0;
	   
	   for(;;) {
		   sum = sum+i;
		   i++;
		{
	   if(i>1_000_000) //<=이걸로 바꾸면 0이 나온다.break; 
	   {
		   break;
	   }
		   } 
	   }
	   System.out.println(sum);
//	   while문 
	   i=0;
	   sum=0;
	   while(true) {
		   sum= sum+i;
		   i++;
		   if(i>1_000_000) {
			   break;
		   }
		  
		   
	   }
	   System.out.println(sum);
	   i=0;
	   sum=0;
	   do {
		   sum= sum+i;
		   i++;
		   if(i>1_000_000) {
			   break;
		   }
	   }while(i<=1_000_000);
	   
	   System.out.println(sum);
	  
	   
	   
	}

}
