
public class Buy implements ICommand
{
	private Stock stock;
	private int quantity;
	
	public Buy(Stock stock, int quantity)
	{
		super();
		this.setStock(stock);
		this.setQuantity(quantity);
	}
	
	public void execute()
	{
		System.out.println("Buying stock.");
		stock.buy(quantity);
	}

	public Stock getStock() 
	{
		return stock;
	}

	public void setStock(Stock stock) 
	{
		this.stock = stock;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

}
