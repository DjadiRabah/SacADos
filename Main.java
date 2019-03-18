public class Main
{
	public static void main(String[] args)
	{
		DataRandom data = new DataRandom();
		Algorithm alg = new Algorithm();
		int[] solution = alg.getSolution(data,100.0);
		System.out.println(data);
		for(int i = 0; i < solution.length; i++)
		{
			System.out.print(solution[i] + " ");
		}
	}
}
