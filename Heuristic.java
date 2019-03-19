import java.util.ArrayList;
import java.util.Arrays;

public class Heuristic 
{
	private ArrayList<int[]> permutations;
	public Heuristic() 
	{
		this.permutations = new ArrayList<int[]>();
	}

	
	private double[][] insertionSort(double[][] tab)
	{
		for(int i = 0; i< tab.length; i++)
		{
			double[] x = tab[i];
			int j = i;
			while ((j > 0) && (tab[j-1][1] < x[1]))
			{
				tab[j] = tab[j-1];
				j = j - 1;
			}
			tab[j] = x;
		}
		return tab;
	}
	
	public ArrayList<Integer> getSolution(Data data, double maxWeight)
	{
		ArrayList<Integer> solution = new ArrayList<Integer>();
		double[][] ratios = new double[data.getSize()][2];
		
		for(int i = 0; i < ratios.length; i++)
		{
			ratios[i][0] = i;
			ratios[i][1] = data.getGain(i) / data.getWeight(i);
		}
		System.out.println();
		this.insertionSort(ratios);
		
		double currentWeight = 0.0;
		int currentIndex = 0;
		
		while(currentWeight < data.getMaxWeight())
		{
			if ((currentWeight + data.getWeight((int)ratios[currentIndex][0])) < data.getMaxWeight())
			{
				currentWeight += data.getWeight((int)ratios[currentIndex][0]);
				solution.add((int)ratios[currentIndex][0] + 1);
				currentIndex++;
			}
			else
			{
				break;
			}
		}	
		return solution;
	}

}
