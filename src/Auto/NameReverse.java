package Auto;

public class NameReverse {

	public static void main(String[] args)
	{
		String n1="Dilip", n2="Sahukar", temp;
		System.out.println("Before Swap");
		System.out.println("First name ="+ n1);
		System.out.println("First name ="+ n2);
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("After Swap");
		System.out.println("First name ="+ n1);
		System.out.println("First name ="+ n2);

	}

}
