package immc;
public class map 
{
	private item[][] map;
	private int stolen;
	private int bought;
	private int initialItems;
	private int doorX;
	private int doorY;
	
	public map()
	{
		map=newMap();
		stolen=0;
		bought=0;
	}
	
	private item[][] newMap() 
	{
		//set number of items to what you need. only in this class, because it might change based on the map.
		initialItems=50;
		
		item cshReg = new item("cash register");
		item door = new item("door");
		
		//26 by 26 array. perimeter is walls, so actually 24 by 24 array of items, with each item measuring 2m by 2m.
		item[][] array = new item[][] {
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
		    {wall(), path(), path(), grpB(), grpB(), grpB(), grpB(), grpB(), path(), path(), grpB(), grpB(), grpB(), grpB(), grpB(), path(), path(), grpB(), grpB(), grpB(), grpB(), grpB(), path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), path(), path(), path(), wall()},
		    {wall(), grpA(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), grpC(), grpC(), path(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), path(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), grpE(), path(), wall()},
		    {wall(), grpA(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), grpD(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpI(), path(), grpI(), grpI(), grpI(), grpI(), path(), grpI(), path(), path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpE(), path(), wall()},
		    {wall(), cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(),  door , wall(), wall(), wall(), wall(), wall()},
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
		};
		
		doorX=20;
		doorY=25;
		
		return array;
	}

//	private item[][] newMap() 
//	{
//		//set number of items to what you need. only in this class, because it might change based on the map.
//		initialItems=50;
//		
//		item cReg = new item("cash register");
//		item door = new item("door");
//		
//		item[][] array = new item[][] {
//		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//		    {wall(), path(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), path(), wall()},
//		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//		    {wall(), path(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), path(), wall()},
//		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//		    {wall(), path(), path(), path(), hPhn(), path(), hPhn(), path(), hPhn(), wall()},
//		    {wall(), path(), path(), path(), hPhn(), path(), hPhn(), path(), hPhn(), wall()},
//		    {wall(), cReg, cReg, path(), path(), path(), hPhn(), path(), hPhn(), wall()},
//		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), door, wall(), wall()},
//		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//		};
//		
//		doorX=7;
//		doorY=9;
//		
//		return array;
//	}

	private item grpA() 
	{
		return new item("A", 25, 44.6);
	}
	
	private item grpB() 
	{
		return new item("B", 25, 44.6);
	}

	private item grpC() 
	{
		return new item("C", 25, 44.6);
	}
	
	private item grpD() 
	{
		return new item("D", 25, 44.6);
	}
	
	private item grpE() 
	{
		return new item("E", 25, 44.6);
	}
	
	private item grpF() 
	{
		return new item("F", 25, 44.6);
	}
	
	private item grpG() 
	{
		return new item("G", 25, 44.6);
	}

	private item grpH() 
	{
		return new item("H", 25, 44.6);
	}
	
	private item grpI() 
	{
		return new item("I", 25, 44.6);
	}
	
	private item wall() 
	{
		return new item("wall");
	}
	
	private item hPhn() 
	{
		return new item("bd D earbuds", 25, 44.6);
	}

	private item path() 
	{
		return new item("");
	}

	public void addItem(int r, int c)
	{
		map[r][c].addItem();
	}
	
	public void removeItem(int r, int c, boolean damage)
	{
		//this part of the code is irrelevant for now, but it's here if we need it.
		if (map[r][c].currentItems()!=0)
		{
			if (damage)
			{
				stolen++;
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
	
	public int getDoorX()
	{
		return doorX;
	}
	
	public int getDoorY()
	{
		return doorY;
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
	
	public int getNumStolen()
	{
		return stolen;
	}
	
	public int getNumBought()
	{
		return bought;
	}

	public void printMap() 
	{
		for (int r=0; r<map.length; r++)
		{
			for (int i = 0; i<10*24+1; i++)
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
		for (int i = 0; i<5*24+1; i++)
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
}
