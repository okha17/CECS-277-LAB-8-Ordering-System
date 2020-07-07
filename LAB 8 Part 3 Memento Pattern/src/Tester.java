
public class Tester 
{
	public static void main(String args[])
	{
		
		Originator calc = new Originator(12, 23); //first and second number set as 12 and 23	
		
		System.out.println("Testing first calculation: ");
		System.out.println("12 + 23 = " + calc.result()); // First addition
		Memento mem = calc.saveResultToMemento();  // Result saved to memento
		
		System.out.println("Testing second calculation: ");
		calc.setFirst(13);
		calc.setSecond(24); 
		System.out.println("13 + 24 = " + calc.result()); // trying a second addition
		
		System.out.println("Testing saved result: ");
		calc.getResultFromMemento(mem); // undoing to old result saved in memento
		System.out.println("= " + calc.result()); // getting the old result in memento
	}

}
