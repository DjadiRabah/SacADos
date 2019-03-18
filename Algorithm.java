import java.util.ArrayList;

public class Algorithm 
{
	private ArrayList<int[]> permutations;
	public Algorithm() 
	{
		this.permutations = new ArrayList<int[]>();
	}
	
	private void setPermutations(int[] currentPermutations, int value)
	{
		if( value >= currentPermutations.length)
		{
			this.permutations.add(currentPermutations.clone());
		}
		else
		{
			for(int index = 0; index <= 1; index++)
			{
				currentPermutations[value] = index;
				this.setPermutations(currentPermutations, value+1);
			}
		}
	}
	
	public int[] getSolution(Data data, double maxWeight)
	{
		int[] currentPermutations = new int[data.getSize()];
		this.setPermutations(currentPermutations, 0);
		
		int[] solution = new int[data.getSize()];
		double bestGain = 0.0;
		double bestWeight = 0.0;
		
		for(int i = 1; i < this.permutations.size(); i++)
		{
			double currentWeight = 0.0;
			double currentGain = 0.0;
			int[] p = this.permutations.get(i);
			for(int j = 0; j < data.getSize(); j++)
			{
				if(p[j] == 1)
				{
					currentGain += data.getGain(j);
					currentWeight += data.getWeight(j);
				}
			}
			if(currentWeight <= maxWeight)
			{
				if(currentGain > bestGain)
				{
					bestGain = currentGain;
					bestWeight = currentWeight;
					solution = p.clone();
				}
				else if(currentGain == bestGain)
				{
					if(currentWeight < bestWeight)
					{
						bestGain = currentGain;
						bestWeight = currentWeight;
						solution = p.clone();
					}
				}
			}
		}
		return solution;
	}
}
