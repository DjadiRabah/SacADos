public class Main
{
	public static void main(String[] args)
	{
		DataTP1 data = new DataTP1();
		Algorithm alg = new Algorithm();
		int[] solution = alg.getSolution(data,14);
		for(int i = 0; i < solution.length; i++)
		{
			System.out.print(solution[i] + " ");
		}
	}
}
