
import java.util.Scanner;

public class Tester
{
	public static void main(String args[])
	{
	    @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
		Game game = new Game();
		Phone phone = new Phone();
		Laptop laptop = new Laptop();
		TechVisitor tech = new TechVisitor();
		
		int choice = 0;
		while (choice != 4) 
		{
			System.out.println("Tech Store: \n");
			System.out.println(" 1)Add phone to purchase\n 2)Add laptop to purchase\n 3)Add video game console to purchase\n 4)Complete entire purchase\n");
			System.out.println("Enter your choice: ");
			choice = in.nextInt();	
			switch (choice)
			{
			case 1:
				System.out.println("Please type one of these options: \nGalaxy S7: $600\nGalaxy S8: $800\niPhone 6: $350\niPhone X: $1000");
				System.out.println("-------------------------");
				System.out.println("The Galaxy S8 is 20% off");
				System.out.println("The iPhone X is $30 off");
				System.out.println("-------------------------");
				System.out.println("Enter your choice: ");
				phone.accept(tech);
				break;
			case 2:
				System.out.println("Please type one of these options: \nMicrosoft Surface: $1400 \nMacBook: $1300");
				System.out.println("-------------------------");
				System.out.println("The Microsoft Surface is 20% off");
				System.out.println("-------------------------");
				System.out.println("Enter your choice: ");
				laptop.accept(tech);
				break;
			case 3:
				System.out.println("Please type one of these options: \nXbox One: $350 \nSony-Playstation $400");
				System.out.println("-------------------------");
				System.out.println("The Sony-Playstation is 20% off");
				System.out.println("Get a second Microsoft Xbox One for 30% off if you get two");
				System.out.println("-------------------------");
				System.out.println("Enter your choice: ");
				game.accept(tech);
				break;
			case 4:
				System.out.println("Receipt Total");
				System.out.println("-------------------------");
				tech.displayAll();
				System.out.println("Your total will be $" + tech.calculatePrice());
				System.out.println("-------------------------");
				System.out.println("Thank you for shopping!");
				choice = 4;
				break;
			default:
				System.out.println("Incorrect choice \nTry again!\n");
			}
		}
	}
}
