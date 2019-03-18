public class Cargo
{
	private ArrayList<Objet> objets;
	private double capacite;

	public Cargo(double capacite)
	{
		this.objets = new ArrayList<Objet>();
		this.setCapacite(capacite);
	}

	public Cargo(Cargo copy)
	{
		this.setCapacite(copy.capacite);
		this.objets = new ArrayList<Objet>(this.objets);
	}

	public void setCapacite(double capacite)
	{
		this.capacite = capacite;
	}

	public void ajouterObjet(Objet objet)
	{
		this.objets.add(objet);
	}

	public double getCapacite()
	{
		return this.capacite;
	} 

	public double getMasseActuelle()
	{
		double masse = 0.0;
		for(int i = 0; i < this.objets.size(); i++)
		{
			masse = masse + this.objets.get(i).getMasse();
		}
		return masse;
	}


}