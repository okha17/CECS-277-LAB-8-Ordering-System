
public final class Memento 
{
	private final int first_num;
	private final int second_num;
	
	public Memento(int first_num, int second_num)
	{
		this.first_num = first_num;
		this.second_num = second_num;
	}
	 
	public  int getFirst()
	{
		return first_num;
	}
	
	public int getSecond()
	{
		return second_num;
	}

}
