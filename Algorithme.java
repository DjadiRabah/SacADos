public class Algorithme
{
	private ArrayList<Objet> objets;
	private Cargo cargo;
	public Algorithme()
	{
		this.cargo = new Cargo(14.0);
		this.objets = new ArrayList<Objet>();
		this.objets.add(new Objet(3.0, 8.0));
		this.objets.add(new Objet(6.0, 12.0));
		this.objets.add(new Objet(1.0, 1.0));
		this.objets.add(new Objet(7.0, 16.0));
		this.objets.add(new Objet(9.0, 20.0));
	}

	private Cargo getCurrentCargo(ArrayList<Boolean> ajouterObjet)
	{
		Cargo cargo = new Cargo(this.cargo.getCapacite());
		for(int i = 0; i < ajouterObjet.size(); i++)
		{
			if(ajouterObjet.get(i))
				cargo.add(this.objets.get(i));
		}

		return cargo;
	}

	private Cargo getBestCargo(Cargo cargoPrecedant,ArrayList<Objet> objets)
	{
		Cargo cargoA = new Cargo(cargoPrecedant);
		Cargo cargoB = new Cargo(cargoPrecedant);

		cargoA.ajouterObjet(objets.get(0));

		if(objets.size() == 1)
		{


		}

		else
		{
			
		}
		
	}




}