
public class Laptop implements Visitable
{
	private double price;
	private String name;
	Laptop()
	{
		name = "";
		price = 0;
	}
	
	Laptop(double prc, String nam)
	{
		this.setName(nam);
		this.setPrice(prc);
	}
	
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double prc)
	{
		price = prc;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(getName() + " $" + price);
	}

}
