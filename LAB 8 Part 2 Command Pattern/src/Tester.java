
public class Tester
{
	public static void main(String args[])
	{
		Stock person1 = new Stock("Apple", 350.00);
		Stock person2 = new Stock("Samsung", 234.00);
		Invoker inv = new Invoker();
		
		inv.setCommand(new Buy(person1, 4));
		inv.action();
		
		inv.setCommand(new Sell(person2, 3));
		inv.action();
	}

}
