package immc;

public class person 
{
	private int r;
	private int c;
	//north, east, south, west. direction person is facing.
	private String direction;
	
	public person(int initialRow, int initialCol)
	{
		r=initialRow;
		c=initialCol;
		direction="north";
	}
	
	private void onItem(map currentMap, int newR, int newC) 
	{
		System.out.println("");
		System.out.println("Department "+currentMap.getDepartment(newR, newC));

		double probability = (Math.random());
		double popularityScore = currentMap.getPopularityScore(newR, newC)/100;
		
		probabilities p = new probabilities(currentMap, newR, newC, r, c);
		
		double roughHandlingScore = 0.1*p.calculateRoughHandling();
		double openingPackagingScore = 0.1*p.calculateOpening();
		double droppingScore = 0.1*p.calculateDropping();
		
		System.out.println("rough handling score: "+ roughHandlingScore);
		System.out.println("opening score: "+ openingPackagingScore);
		System.out.println("dropping score: "+ droppingScore);
		System.out.println("----------------------------");
		System.out.println("Items rough handled: "+currentMap.getNumRoughHandled());
		System.out.println("Items opened: "+currentMap.getNumOpened());
		System.out.println("Items dropped: "+currentMap.getNumDropped());

				
		//buy the item
		if (probability<popularityScore)
		{
			currentMap.removeItem(newR, newC, "bought");
		}
		//damage the item by rough handling
		else if (popularityScore<=probability&&probability<popularityScore+roughHandlingScore)
		{
			currentMap.removeItem(newR, newC, "roughHandled");
		}
		//damage the item by opening packaging
		else if (popularityScore+roughHandlingScore<=probability&&probability<popularityScore+roughHandlingScore+openingPackagingScore)
		{
			currentMap.removeItem(newR, newC, "opened");
		}
		//damage the item by dropping
		else if (popularityScore+roughHandlingScore+openingPackagingScore<=probability&&probability<popularityScore+roughHandlingScore+openingPackagingScore+droppingScore)
		{
			currentMap.removeItem(newR, newC, "dropped");
		}
		//ignore the item and move on
		else
		{
			//nothing
		}
	}
	
	public void moveForward(map currentMap)
	{
		int newR=r;
		int newC=c;
		if (direction.equals("north"))
		{
			newR--;
		}
		
		if (currentMap.pathAhead(newR, newC)||currentMap.onCashRegistar(newR, newC))
		{
			r=newR;
			c=newC;
		}
	}
	
	public void randomAction(map currentMap) 
	{
		//right now the percentages are very arbitrary, this is simply to illustrate a possible concept for the paths of the people.
		//also, the reason why there are 4 possibilities is because someone is more likely to go forward.
		
		//rotate
		double probability = (int)(Math.random()*4);
		//stay
		if (probability==0||probability==1)
		{
			//no change in direction
		}
		//left
		else if (probability==2)
		{
			if (direction.equals("north"))
			{
				direction="west";
			}
			else if (direction.equals("east"))
			{
				direction="north";
			}
			else if (direction.equals("south"))
			{
				direction="east";
			}
			else
			{
				direction="south";
			}
		}
		//right
		else if (probability==3)
		{
			if (direction.equals("south"))
			{
				direction="west";
			}
			else if (direction.equals("west"))
			{
				direction="north";
			}
			else if (direction.equals("north"))
			{
				direction="east";
			}
			else
			{
				direction="south";
			}
		}
		
		
		//move
		probability = (int)(Math.random()*2);
		//forward
		if (probability==0)
		{
			//determine what the new coordinates of the person would be
			int newR=r;
			int newC=c;
			if (direction.equals("north"))
			{
				newR--;
			}
			else if (direction.equals("east"))
			{
				newC++;
			}
			else if (direction.equals("south"))
			{
				newR++;
			}
			else
			{
				newC--;
			}
			
			//check whether or not you can actually move
			if (currentMap.pathAhead(newR, newC)||currentMap.onCashRegistar(newR, newC))
			{
				r=newR;
				c=newC;
			}
			else if (currentMap.isWall(newR, newC))
			{
				//do nothing; stay where you are
			}
			//would go to an item cell
			else
			{
				if (currentMap.getItemNum(newR, newC)>0)
				{
					onItem(currentMap, newR, newC);
				}
			}
		}
		//stay
		else
		{
			//nothing
		}
	}

	public int getRow() 
	{
		return r;
	}

	public int getCol() 
	{
		return c;
	}
	
	
}
