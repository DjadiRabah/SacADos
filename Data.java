import java.util.ArrayList;

public class Data 
{
	protected ArrayList<Double[]> data;
	protected double maxWeight;
	
	public Data() 
	{
		this.data = new ArrayList<Double[]>();
		this.maxWeight = 100.0;
	}
	
	public void add(double gain, double weight)
	{
		Double[] newData = new Double[2];
		newData[0] = Double.valueOf(gain);
		newData[1] = Double.valueOf(weight);
		this.data.add(newData);
	}
	
	public void remove()
	{
		if(this.data.size()  > 0)
			this.data.remove(this.data.size()-1);
	}
	
	public double getGain(int index)
	{
		return this.data.get(index)[0];
	}
	
	public double getWeight(int index)
	{
		return this.data.get(index)[1];
	}
	
	public int getSize()
	{
		return this.data.size();
	}
	
	public double getMaxWeight()
	{
		return this.maxWeight;
	}
	
	public String toString()
	{
		String str = "";
		for(int i = 0; i < this.data.size(); i++)
		{
			str = str + (i+1) + " " + getGain(i) + " " + getWeight(i) + '\n';
		}
		return str;
	}
}
