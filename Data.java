import java.util.ArrayList;

public class Data 
{
	protected ArrayList<Double[]> data;
	
	public Data() 
	{
		this.data = new ArrayList<Double[]>();
	}
	
	public void addData(double gain, double weight)
	{
		Double[] newData = new Double[2];
		newData[0] = Double.valueOf(gain);
		newData[1] = Double.valueOf(weight);
		this.data.add(newData);
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
	
	public String toString()
	{
		String str = "";
		for(int i = 0; i < this.data.size(); i++)
		{
			str = str + (i+1) + " " + getGain(0) + " " + getGain(1) + '\n';
		}
		return str;
	}
}
