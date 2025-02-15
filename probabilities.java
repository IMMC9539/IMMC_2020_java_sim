package immc;

public class probabilities 
{
	private int people;
	private int product;
	private double pp;
	private double[] weight;
	//coordinates, (x, y) : (c, r)
	private double[] cashierX;
	private double[] cashierY;
	private int departmentX;
	private int departmentY;
	private map currentMap;
	private int departmentArea;
	private int personArea=4;
	
	private double max_dist=48*Math.sqrt(2);
	//maximum people to product ratio
	private double max_ppp=15;
	//dropping percentage
	public probabilities(map givenMap, int departmentGivenR, int departmentGivenC, int personGivenR, int personGivenC)
	{
		currentMap=givenMap;
		pp = currentMap.getItem(departmentGivenR, departmentGivenC).getPopularityScore()/100;
		weight = new double[] {0.2, 0.1, 0.7, 0.7, 0.3, 0.425, 0.15, 0.425};  //In order of opening package, rough handling, and total damage score
		
		people = currentMap.getItemNum(personGivenR, personGivenC);
		product = currentMap.getItemNum(departmentGivenR, departmentGivenC);
		departmentArea=currentMap.getItem(departmentGivenR, departmentGivenC).getTotalArea();
		
		cashierX = currentMap.getCashRegisterX();
		cashierY = currentMap.getCashRegisterY();
		departmentX = departmentGivenC;
		departmentY = departmentGivenR;
	}
	
	public double calculateDropping()
	{
		return weight[7]*(people_per_product_metric());
	}
	
	public double calculateOpening()
	{
		double ppp = people_per_product_metric();
	 	double vis = visibility();
	 	return weight[6]*(weight[0] * ppp + weight[1] * pp + weight[2] * vis);
	}
	
	public double calculateRoughHandling()
	{
		double ppp = people_per_product_metric();
		double vis = visibility();
		return weight[5]*(weight[3] * ppp + weight[4] * vis);
	}
	
	//People per product metric
	public double people_per_product_metric()
	{
	    return population_density()/(product_density() * max_ppp);
	}
	
	public double population_density()
	{
	    return (double)people+1/personArea;
	}
	
	public double product_density()
	{
	    return (double)product/departmentArea;
	}
	
	public double visibility()
	{
		double distance = (max_dist-getDistance()/max_dist);
		return Math.pow(Math.E, (-1 * (1 - pp) * (Math.pow(distance, 2))));
	}

	private double getDistance() 
	{
		double minDistance=(double)Integer.MAX_VALUE;
		for (int i = 0; i<7; i++)
		{
			double distance=(Math.sqrt(Math.pow((double)cashierX[i]*2.0-departmentX*2.0, 2)+Math.pow((double)cashierY[i]*2.0-departmentY*2.0, 2)));
			if (distance<minDistance)
			{
				minDistance=distance;
			}
		}
		return minDistance;
	}
}
