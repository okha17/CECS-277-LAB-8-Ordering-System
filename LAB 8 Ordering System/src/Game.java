import java.text.DecimalFormat;

public class Game implements Visitable
{
	private double price;
	private String name;
    private static DecimalFormat df2 = new DecimalFormat("#.00");
	Game()
	{
		name = "";
		price = 0;
	}
	
	Game(double prc, String name)
	{
		this.setName(name);
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
		System.out.println(getName() + " $" + df2.format(price));
	}
}
