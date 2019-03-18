public class Objet
{
	private double gain;
	private double masse;

	public Objet(double masse, double gain)
	{
		this.masse = masse;
		this.gain = gain;
	}

	public Objet(Objet copy)
	{
		this.masse = copy.masse;
		this.gain = copy.gain;
	}

	public double getGain()
	{
		return this.gain;
	}

	public double getMasse()
	{
		return this.masse;
	}
}