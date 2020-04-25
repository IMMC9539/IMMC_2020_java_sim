package immc;

public class item 
{
	private int numberOfItems;
	private String itemId;
	private double popularity;
	private int totalArea;
	
	public item(String givenItem) 
	{
		itemId=givenItem;
		numberOfItems=0;
		popularity=0;
		totalArea=4;
	}
	
	public item(String givenItem, int givenNumber, double  givenPopularity, int givenArea) 
	{
		numberOfItems=givenNumber;
		itemId=givenItem;
		popularity=givenPopularity;
		totalArea=givenArea;
	}
	
	public void addItem()
	{
		numberOfItems++;
	}
	
	public void removeItem()
	{
		if (numberOfItems!=0)
		{
			numberOfItems--;
		}
	}
	
	public String getItemId()
	{
		return itemId;
	}
	
	public String toString()
	{
		if (itemId.contentEquals("cash register"))
		{
			return itemId;
		}
		else if (itemId.contentEquals("wall"))
		{
			return "///////";
		}
		return itemId+" "+numberOfItems;
	}

	public int currentItems() 
	{
		return numberOfItems;
	}

	public double getPopularityScore() 
	{
		return popularity;
	}

	public int getTotalArea() 
	{
		return totalArea;
	}
}
