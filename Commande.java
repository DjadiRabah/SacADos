public class Commande 
{
	private Objet objet;
	private int numero;

	public Commande(int numero, Objet objet)
	{
		this.numero = numero;
		this.objet = objet;
	}

	public int getNumeroCommande()
	{
		return this.numero;
	}

	public Objet getObjet()
	{
		return this.objet;
	}
}