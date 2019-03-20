import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
			long currentTime = System.nanoTime();
			ArrayList<Integer> solution = alg.getSolution(data, data.getMaxWeight());
			currentTime = System.nanoTime() - currentTime;
			this.resultView.update(solution,currentTime);
		}
		else if(event.getActionCommand().equals("Heuristique gloutonne"))
		{
			Heuristic alg = new Heuristic();
			long currentTime = System.nanoTime();
			ArrayList<Integer> solution = alg.getSolution(data, data.getMaxWeight());
			currentTime = System.nanoTime() - currentTime;
			this.resultView.update(solution,currentTime);
		}
	}
	
	private double getRandomValue(double min, double max)
	{
		return Math.random() * (max-min) + min;
	}
}