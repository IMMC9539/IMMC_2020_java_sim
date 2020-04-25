package immc;
public class map 
{
	private item[][] map;
	private int bought;
	private int roughHandling;
	private int openedPackaging;
	private int dropping;
	private int initialItems;
	private int doorX;
	private int doorY;
	private int cshRegX;
	private int cshRegY;
	
	public map()
	{
		map=newMap();
		bought=0;
		roughHandling=0;
		openedPackaging=0;
		dropping=0;
	}
	
	private item[][] newMap() 
	{
		//set number of items to what you need. only in this class, because it might change based on the map.
		initialItems=257+383+444+181+50+220+55;
		
		item cshReg = new item("cash register");
		item door = new item("door");
		
		//Appliances
		item groupA = new item("C", 257, 10.87, 144);
		//TV and Home Theater
		item groupB = new item("B", 383, 11.13, 73);
		//Computers and Tablets
		item groupC = new item("C", 444, 15.32, 138);
		//Video Gaming
		item groupD = new item("D", 181, 15.97, 104);
		//Audio, Cell Phones, and Cameras
		item groupE = new item("E", 50+220+55, 18.29+13.04+15.38, 32);
		
		//26 by 26 array. perimeter is walls, so actually 24 by 24 array of items, with each item measuring 2m by 2m.
		item[][] array = new item[][] {
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
		    {wall(), path(), path(), groupA, groupA, groupA, groupA, groupA, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), groupB, path(), path(), groupB, path(), path(), groupB, path(), path(), path(), path(), path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), path(), groupB, path(), path(), groupB, path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), path(), groupB, path(), path(), groupB, path(), path(), groupB, path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), groupA, groupA, path(), groupA, groupA, path(), groupA, groupA, path(), path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), groupB, path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupC, path(), groupC, groupC, groupC, groupC, path(), groupC, path(), path(), path(), path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupC, path(), groupC, groupC, groupC, groupC, path(), groupC, path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupC, path(), groupC, groupC, groupC, groupC, path(), groupC, path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), groupE, groupE, groupE, groupE, path(), groupE, path(), path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupB, path(), wall()},
		    {wall(), path(), cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(),  door , wall(), wall(), wall(), wall(), wall()},
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
		};
		
		doorX=20;
		doorY=25;
		
		cshRegX=8;
		cshRegY=24;
		
		return array;
	}
	
	private item wall() 
	{
		return new item("wall");
	}

	private item path() 
	{
		return new item("");
	}

	public void addItem(int r, int c)
	{
		map[r][c].addItem();
	}
	
	public void removeItem(int r, int c, String string)
	{
		//this part of the code is irrelevant for now, but it's here if we need it.
		if (map[r][c].currentItems()!=0)
		{
			if (string.equals("roughHandled"))
			{
				roughHandling++;
			}
			else if (string.equals("opened"))
			{
				openedPackaging++;
			}
			else if (string.equals("dropped"))
			{
				dropping++;
			}
			else
			{
				bought++;
			}
		}
		
		//change number of items available. doesn't decrease if number of items is 0.
		map[r][c].removeItem();
	}
	
	public void removeItem(int r, int c)
	{
		map[r][c].removeItem();
	}
	
	public int getItemNum(int r, int c)
	{
		return map[r][c].currentItems();
	}
	
	public item getItem(int r, int c)
	{
		return map[r][c];
	}
	
	public int getDoorX()
	{
		return doorX;
	}
	
	public int getDoorY()
	{
		return doorY;
	}
	
	public int getCashRegisterX()
	{
		return cshRegX;
	}
	
	public int getCashRegisterY()
	{
		return cshRegY;
	}

	public boolean onCashRegistar(int r, int c) 
	{
		if (map[r][c].getItemId()=="cash register")
		{
			return true;
		}
		return false;
	}
	
	public boolean pathAhead(int r, int c)
	{
		if (map[r][c].getItemId().equals(""))
		{
			return true;
		}
		return false;
	}
	
	public boolean isWall(int r, int c) 
	{
		if (map[r][c].getItemId()=="wall")
		{
			return true;
		}
		return false;
	}
	
	public int getNumInitial()
	{
		return initialItems;
	}
	
	public int getNumRoughHandled()
	{
		return roughHandling;
	}
	
	public int getNumOpened()
	{
		return openedPackaging;
	}
	
	public int getNumDropped()
	{
		return dropping;
	}
	
	public int getNumBought()
	{
		return bought;
	}

	public void printMap() 
	{
		for (int r=0; r<map.length; r++)
		{
			for (int i = 0; i<10*26+1; i++)
			{
				System.out.print("-");
			}
			System.out.println();
			
			for (int c=0; c<map[0].length; c++)
			{
				System.out.print("|"+center(""));
			}
			System.out.println("|");
			
			for (int c=0; c<map[0].length; c++)
			{
				if (map[r][c].equals(null))
				{
					System.out.print("|"+center("null"));
				}
				else
				{
					System.out.print("|"+center(map[r][c].toString()));
				}			}
			System.out.println("|");
			
			for (int c=0; c<map[0].length; c++)
			{
				System.out.print("|"+center(""));
			}
			System.out.println("|");
		}
		for (int i = 0; i<10*26+1; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	
	public String center(String string)
	{
		int totalSpace=9;
		String newString="";
		if (string.length()<=totalSpace)
		{
			int firstHalf=(totalSpace-string.length())/2;
			for (int i = 0; i<firstHalf;i++)
			{
				newString+=" ";
			}
			newString+=string;
			for (int i = 0; i<totalSpace-string.length()-firstHalf;i++)
			{
				newString+=" ";
			}

		}
		else
		{
			newString=string.substring(0,totalSpace);
		}
		return newString;
	}

	public double getPopularityScore(int newR, int newC) 
	{
		return map[newR][newC].getPopularityScore();
	}
}
