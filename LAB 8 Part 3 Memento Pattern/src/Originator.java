
public class Originator 
{
	private int first_num;
	private int second_num;
	
	Originator(int first_num, int second_num)
	{
		this.first_num = first_num;
		this.second_num = second_num;
	}
	
	public void setFirst(int first_num)
	{
		this.first_num = first_num;
	}
	
	public void setSecond(int second_num)
	{
		this.second_num = second_num;
	}
	
	public int result()
	{
		return first_num + second_num;
	}
	 
	public Memento saveResultToMemento()
	{
		return new Memento(first_num, second_num);
	}
	
	public void getResultFromMemento(Memento memento)
	{
		this.first_num = memento.getFirst();
		this.second_num = memento.getSecond();
	}
}
