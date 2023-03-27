package Auto;

public class Family 
{
public String name;;
public String bike;
	public static void main(String[] args)
	{
		Family f1 = new Family();
		f1.name ="Prakash";
		f1.bike = "Duet";
		
		Family f2 = new Family();
		f2.name = "Mohan";
        f2.bike = "Glamour";
        
        System.out.println(f1.name);
        System.out.println(f1.bike);
        System.out.println(f2.name);
        System.out.println(f2.bike);
	}

}
