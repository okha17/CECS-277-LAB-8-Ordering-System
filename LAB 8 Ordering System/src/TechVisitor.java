
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechVisitor implements Visitor
{
    private Scanner in = new Scanner(System.in); 
    private List<Visitable> items;

    TechVisitor()
    {
    	items = new ArrayList<Visitable>();
    }
    
	public void visit(Laptop laptop)
	{
		String lap = in.nextLine();
		
		if(lap.equalsIgnoreCase("Microsoft Surface"))
		{
			laptop.setName("Microsoft Surface");
			laptop.setPrice(1400.00);
			laptop.setPrice((laptop.getPrice())*.8);
			addItem(laptop);
			System.out.print("Purchase is ");
			laptop.display();
		}	
		else if(lap.equalsIgnoreCase("MacBook"))
		{
			Laptop laptop1 = new Laptop();
			laptop1.setName("MacBook");
			laptop1.setPrice(1300);
			addItem(laptop1);
			System.out.print("Purchase is ");
			laptop1.display();
		}
	}
	
	public void visit(Phone phone)
	{
		String phn = in.nextLine();
		if(phn.equalsIgnoreCase("iPhone X"))
		{
			phone.setPrice(1000.00);
			if(phone.getPrice() >= 400.00)
			{
				phone.setName("Iphone X");
				phone.setBrand("Apple");
				phone.setPrice(970.00);
				addItem(phone);
				System.out.print("Purchase is ");
				phone.display();
			}
		}
		
		else if(phn.equalsIgnoreCase("iPhone 6"))
		{
			Phone cellular = new Phone();
			cellular.setName("iPhone 6");
			cellular.setBrand("Apple");
			cellular.setPrice(350.00);
			addItem(cellular);
			System.out.print("Purchase is ");
			cellular.display();
		}
		
		else if(phn.equalsIgnoreCase("Galaxy S8"))
		{
			Phone cell = new Phone();
			cell.setName("Galaxy S8");
			cell.setBrand("Samsung");
			cell.setPrice(800.00);
			cell.setPrice((cell.getPrice())*.8);
			addItem(cell);
			System.out.print("Purchase is ");
			cell.display();
		}
		
		else if(phn.equalsIgnoreCase("Galaxy S7"))
		{
			Phone cell2 = new Phone();
			cell2.setName("Galaxy S7");
			cell2.setBrand("Samsung");
			cell2.setPrice(600.00);
			addItem(cell2);
			System.out.print("Purchase is ");
			cell2.display();
		}
	}
	
	public void visit(Game game)
	{
		String console = in.nextLine();
		if(console.equalsIgnoreCase("Sony-Playstation"))
		{
			game.setName("Sony-Playstation");
			game.setPrice(400);
			game.setPrice((game.getPrice())*.8);
			addItem(game);
			System.out.print("Purchase is ");
			game.display();
		}
		
		else if(console.equalsIgnoreCase("Xbox One"))
		{
			Game game1 = new Game();
			Game game2 = new Game();
			game.setName("Microsoft Xbox One");
			game.setPrice(350);
			System.out.println("Would you like a second Xbox for discount price?\nY/N");
			console = in.next();
			if(console.equalsIgnoreCase("y"))
			{
				game1.setPrice(350);
				game1.setName("Xbox One");
				game1.setPrice(game1.getPrice()*.7);
				addItem(game1);
				System.out.print("Purchase is ");
				game1.display();
				
			}
			game2.setName("Xbox One");
			game2.setPrice(350);
			addItem(game2);
			System.out.print("Purchase is ");
			game2.display();
		}
	}
	
	public void addItem(Visitable item)
	{
		items.add(item);
	}
	
	public double calculatePrice()
	{
		double sum = 0.0;
		for(Visitable item: items)
		{
			sum = sum + item.getPrice();
		}
		return sum;
	}
	
	public void displayAll()
	{
		for(Visitable item: items)
		{
			item.display();
		}
	}
}
