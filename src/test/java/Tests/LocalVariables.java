package Tests;

public class LocalVariables {

	public static void main(String[] args) {
		/*
		 * int i=0; for(int j=0;j<3;j++) { i=i+j; } System.out.println(i+"..."+j);
		 */
		
		/*
		 * try { int j = Integer.parseInt("ten"); } catch(NumberFormatException e) {
		 * j=10; } System.out.println(j);
		 */	
		/*
		 * int x; System.out.println("Hello"); System.out.println(x);
		 */
		int x;
		if(args.length>0)
		{
			x=10;
		}
		else
		{
			x=20;
		}
		System.out.println(x);
	}

}
