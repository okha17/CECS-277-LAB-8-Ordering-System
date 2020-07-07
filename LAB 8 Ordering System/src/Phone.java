
public class Phone implements Visitable
{
	private double price;
	private String name;
	private String brand;
	Phone()
	{
		name = "";
		price = 0;
		brand = "";
	}
	
	Phone(double prc, String name, String brand)
	{
		this.setName(name);
		this.setPrice(prc);
		this.setBrand(brand);
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
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public void display()
	{
		System.out.println(getBrand() + " " + getName() + " $" + price);
	}
}
