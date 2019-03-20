import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeightView extends JPanel
{
	public WeightView(Data data) 
	{
		super();
		this.setLayout(new GridBagLayout());
		JLabel label = new JLabel("Capacite de l'avion (en tonnes) : " + data.getMaxWeight());
		label.setForeground(Color.RED);
		this.add(label);
	}
}
