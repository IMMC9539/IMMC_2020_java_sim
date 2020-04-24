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
		
		//Appliances
		item groupA = new item("A", 257, 10.87);
		//Audio
		item groupB = new item("B", 50, 18.29);
		//Cameras
		item groupC = new item("C", 220, 13.04);
		//Cell Phones
		item groupD = new item("D", 55, 15.38);
		//Computers and Tablets
		item groupE = new item("E", 444, 15.32);
		//TV and Home Theater
		item groupF = new item("F", 383, 11.13);
		//Video Gaming
		item groupG = new item("G", 181, 15.97);
		
		//26 by 26 array. perimeter is walls, so actually 24 by 24 array of items, with each item measuring 2m by 2m.
		item[][] array = new item[][] {
		    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
		    {wall(), path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), groupG, path(), path(), groupG, path(), path(), groupG, path(), path(), path(), path(), path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupG, path(), path(), groupG, path(), path(), groupG, path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), groupG, path(), path(), groupG, path(), path(), groupG, path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupF, groupF, path(), groupF, groupF, path(), groupF, groupF, path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), groupF, groupF, path(), groupF, groupF, path(), groupF, groupF, path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupA, path(), groupA, groupA, groupA, groupA, path(), groupA, path(), path(), path(), path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupA, path(), groupA, groupA, groupA, groupA, path(), groupA, path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupA, path(), groupA, groupA, groupA, groupA, path(), groupA, path(), path(), groupE, path(), wall()},
		    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), groupE, groupE, groupE, groupE, path(), groupE, path(), path(), path(), path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
		    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
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
		//Appliances
		return new item("A", 257/2, 10.87);
	}
	
	private item grpB() 
	{
		//Audio
		return new item("B", 50, 18.29);
	}

	private item grpC() 
	{
		//Cameras
		return new item("C", 220, 13.04);
	}
	
	private item grpD() 
	{
		//Cell Phones
		return new item("D", 55, 15.38);
	}
	
	private item grpE() 
	{
		//Computers and Tablets
		return new item("E", 444/2, 15.32);
	}
	
	private item grpF() 
	{
		//TV and Home Theater
		return new item("F", 383, 11.13);
	}
	
	private item grpG() 
	{
		//Video Gaming
		return new item("G", 181, 15.97);
	}

	private item grpH() 
	{
		//Appliances 2.0
		return new item("H", 257/2+1, 10.87);
	}
	
//	private item grpI() 
//	{
//		//Computers and Tablets 2.0
//		return new item("I", 444/2, 15.32);
//	}
	
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
}
