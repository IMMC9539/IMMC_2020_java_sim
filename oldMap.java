package immc;

public class oldMap {
//	//Appliances
//			item groupA = new item("A", 257/2, 10.87);
//			//Audio
//			item groupB = new item("B", 50, 18.29);
//			//Cameras
//			item groupC = new item("C", 220, 13.04);
//			//Cell Phones
//			item groupD = new item("D", 55, 15.38);
//			//Computers and Tablets
//			item groupE = new item("E", 444/2, 15.32);
//	item[][] array = new item[][] {
//	    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//	    {wall(), path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), groupB, groupB, groupB, groupB, groupB, path(), path(), path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), path(), path(), path(), wall()},
//	    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), grpG(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupC, groupC, path(), groupC, groupC, path(), groupC, groupC, path(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), grpF(), grpF(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), path(), path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), grpH(), path(), grpH(), grpH(), grpH(), grpH(), path(), grpH(), path(), path(), groupE, path(), wall()},
//	    {wall(), groupA, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), groupD, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), grpI(), path(), grpI(), grpI(), grpI(), grpI(), path(), grpI(), path(), path(), path(), path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), groupE, path(), wall()},
//	    {wall(), cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, cshReg, path(), path(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//	    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(),  door , wall(), wall(), wall(), wall(), wall()},
//	    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//	};
//	
//	private item grpF() 
//	{
//		//TV and Home Theater
//		return new item("F", 383, 11.13);
//	}
//	
//	private item grpG() 
//	{
//		//Video Gaming
//		return new item("G", 181, 15.97);
//	}
//
//	private item grpH() 
//	{
//		//Appliances 2.0
//		return new item("H", 257/2+1, 10.87);
//	}
//	
//	private item grpI() 
//	{
//		//Computers and Tablets 2.0
//		return new item("I", 444/2, 15.32);
//	}
//	
//	private item wall() 
//	{
//		return new item("wall");
//	}
//	
//	private item path() 
//	{
//		return new item("");
//	}
	
	//set number of items to what you need. only in this class, because it might change based on the map.
			int initialItems=50;
			
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
			
			int doorX=20;
			int doorY=25;
			
			//return array;

//		private item[][] newMap() 
//		{
//			//set number of items to what you need. only in this class, because it might change based on the map.
//			initialItems=50;
//			
//			item cReg = new item("cash register");
//			item door = new item("door");
//			
//			item[][] array = new item[][] {
//			    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//			    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//			    {wall(), path(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), path(), wall()},
//			    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//			    {wall(), path(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), hPhn(), path(), wall()},
//			    {wall(), path(), path(), path(), path(), path(), path(), path(), path(), wall()},
//			    {wall(), path(), path(), path(), hPhn(), path(), hPhn(), path(), hPhn(), wall()},
//			    {wall(), path(), path(), path(), hPhn(), path(), hPhn(), path(), hPhn(), wall()},
//			    {wall(), cReg, cReg, path(), path(), path(), hPhn(), path(), hPhn(), wall()},
//			    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), door, wall(), wall()},
//			    {wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall(), wall()},
//			};
//			
//			doorX=7;
//			doorY=9;
//			
//			return array;
//		}

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
		
		private item grpI() 
		{
			//Computers and Tablets 2.0
			return new item("I", 444/2, 15.32);
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

}
