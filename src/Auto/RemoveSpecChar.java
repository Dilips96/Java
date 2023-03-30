package Auto;

public class RemoveSpecChar {

	public static void main(String[] args) 
	{
		String str = "Dilip@@@$$##Sahukar";  
		str = str.replaceAll("@@@$$##", " ");  
		str=str.replaceAll("\\W", " ");    //we can also use this regular expression  
		System.out.println(str);  

	}

}
