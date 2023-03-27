package Auto;

public class Bus {
public String name;
public String colour;
public String route;
	public static void main(String[] args) 
	{	
		Bus t =new Bus();
        t.name = "Tirumala";
		t.colour = "Pink";
		t.route = "Pkd to Tekalli";
		Bus s =new Bus();
		s.name = "Saraswati";
		s.colour = "Skyblue";
		s.route = "Ksn to Tekkali";
		Bus d =new Bus();
		d.name = "Deluxe";
		d.colour ="Red";
		d.route = "pkd to berhampur";
		
		System.out.println(t.name);
		System.out.println(t.colour);
		System.out.println(t.route);
		System.out.println(s.name);
		System.out.println(s.colour);
		System.out.println(s.route);
		System.out.println(d.name);
		System.out.println(d.colour);
		System.out.println(d.route);
		
		
	}

}
