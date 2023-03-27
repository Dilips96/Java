package Auto;

public class Classloading 
{
	void define() 
	{
	System.out.println("This Program Belongs to Class Loader");
}
	public static void main(String[] args) 
	{
	  System.out.println("Main Starts");
	  Classloading c = new Classloading();
	  c.define();
	  System.out.println("This program is Applicable for void method");
	  System.out.println("if it is a void then there is no return type");

	}

}
