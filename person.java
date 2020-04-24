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
		/*
		 * this is where all the probability stuff for damage and all would go.
		 * honestly, please change the way that the probability stuff is being done because
		 * if we can implement the actual percent chances and the distance from the cash registar
		 * and all, this will be a much stronger model.
		 */
		double probability = (int) (Math.random()*5);
		//buy the item
		if (probability==0||probability==1||probability==2)
		{
			currentMap.removeItem(newR, newC, false);
		}
		//damage the item
		else if (probability==3)
		{
			currentMap.removeItem(newR, newC, true);
		}
		//ignore the item and move on
		else
		{
			//nothing
		}
	}
	
	/* The whole probability of dropping implementation is the following: 
	 */
	
	//Calculates the probability of products being roughly handled in a given department.
	public double rough_handling_score(double total_perimeter, double visible_perimeter, double population_density, double product_density, double max_ratio, double v_weight, double ppp_weight)
	{
		double ppp = people_per_product_metric(population_density, product_density, max_ratio);
		double visibility = cashier_visibility(total_perimeter, visible_perimeter);
		double score = ppp * ppp_weight + visibility * v_weight;
		return score;
	}
	
	public double opening_packaging_score(double population_density, double product_density, double popularity_score, double visible_perimeter, double total_perimeter, double ppp_weight, double ps_weight, double v_weight, double max_ppp, double max_ratio)
	{
		double ppp = people_per_product_metric(population_density, product_density, max_ratio);
		double vp = cashier_visibility(visible_perimeter, total_perimeter);
		double score = ppp_weight*ppp + ps_weight*popularity_score + v_weight*vp;
		return score;
	}
	
	//Calculates a score to represent the probability of product falling or being dropped in a given department.
	public double dropping_score(double population_density, double product_density, double max_ratio)
	{
//		Calculates a score to represent the probability of product falling or being dropped in a given department.
//		param population_density
//		param product_density
//		param max_ratio
//		return
				  
		return people_per_product_metric(population_density, product_density, max_ratio);
	}
	
	//People per product
	public double people_per_product(double population_density, double product_density)
	{
		  return population_density/product_density;
	}

	//visibility given perimeter and visible perimeter
	public double cashier_visibility(double total_perimeter, double visible_perimeter)
	{
		  return visible_perimeter/total_perimeter;
	}

	//People per product metric
	public double people_per_product_metric(double population_density, double product_density, double max_ratio)
	{
		  return population_density/(product_density*max_ratio);
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
				onItem(currentMap, newR, newC);
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
