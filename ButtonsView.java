import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsView extends JPanel
{
	public ButtonsView(Data data, DataView dataView, ResultView resultView) 
	{
		super();
		this.setLayout(new GridLayout(2,1));
		this.add(this.getDataButtons(data, dataView,resultView));
		this.add(this.getAlgorithmsButtons(data, dataView,resultView));
	}
	
	private JPanel getDataButtons(Data data, DataView dataView, ResultView resultView)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		JButton removeButton = new JButton("Supprimer la derniere commande");
		removeButton.addActionListener(new ButtonsListener(data,dataView,resultView));
		JButton addButton = new JButton("Ajouter une commande aleatoire");
		addButton.addActionListener(new ButtonsListener(data,dataView,resultView));
		panel.add(removeButton);
		panel.add(addButton);
		return panel;
	}
	
	private JPanel getAlgorithmsButtons(Data data, DataView dataView, ResultView resultView)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,2));
		JButton algButton = new JButton("Algorithme naif");
		algButton.addActionListener(new ButtonsListener(data,dataView,resultView));
		panel.add(algButton);
		JButton heuButton = new JButton("Heuristique gloutonne");
		heuButton.addActionListener(new ButtonsListener(data,dataView,resultView));
		panel.add(heuButton);
		return panel;
	}
}
