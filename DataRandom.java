public class DataRandom extends Data
{
	public DataRandom() 
	{
		super();
		for(int i = 0; i < 20; i++)
		{
			this.addRandom();
		}
		
	}
	
	private double getRandomValue(double min, double max)
	{
		return Math.random() * (max-min) + min;
	}
	
	public void addRandom()
	{
		this.addData(this.getRandomValue(1.0, 100.0), this.getRandomValue(1.0, 100.0));
	}

}
