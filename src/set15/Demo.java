class De
{
	{
		System.out.println("I ma first");
	}
	De()
	{
		System.out.println("I am construtor");
	}
	De(int a)
	{
		System.out.println("De");
	}
}
class Dem extends De
{
	Dem()
	{
		System.out.println("here");
	}
	int c=0,d=0;
	Dem(int g)
	
	{
		//this();
		super(g);
		System.out.println(g);
	}
	{
		System.out.println("I am second");
	}
}
public class Demo {
static
{
	int a=50;
	//System.out.println("hi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("ki");
		//System.out.println(a);
		Dem d = new Dem(6);
	}

}
