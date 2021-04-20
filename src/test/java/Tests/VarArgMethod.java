package Tests;

public class VarArgMethod {

	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
		 

	}
	public static void m1(int... x)
	{
		System.out.println("Var Agr method");
	}

}
