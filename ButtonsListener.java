import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonsListener implements ActionListener
{
	private Data data;
	private DataView dataView;
	private ResultView resultView;
	public ButtonsListener(Data data, DataView dataView, ResultView resultView)
	{
		this.data = data;
		this.dataView = dataView;
		this.resultView = resultView;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getActionCommand().equals("Supprimer la derniere commande"))
		{
			this.data.remove();
			this.dataView.update();
			
		}
		else if(event.getActionCommand().equals("Ajouter une commande aleatoire"))
		{
			this.data.add(this.getRandomValue(1.0, 100.0), this.getRandomValue(1.0, 100.0));
			this.dataView.update();	
		}
		else if(event.getActionCommand().equals("Algorithme naif"))
		{
			Algorithm alg = new Algorithm();
			this.resultView.update(alg.getSolution(data, data.getMaxWeight()));
		}
		else if(event.getActionCommand().equals("Heuristique gloutonne"))
		{
			Heuristic alg = new Heuristic();
			this.resultView.update(alg.getSolution(data, data.getMaxWeight()));
		}
	}
	
	private double getRandomValue(double min, double max)
	{
		return Math.random() * (max-min) + min;
	}
}