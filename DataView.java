import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DataView extends JPanel
{
	protected Data data;
	protected JPanel dataPanel;
	
	public DataView(Data data)
	{
		super();
		this.data = data;

		this.setLayout(new GridLayout(1,1));
		
		this.dataPanel = new JPanel();
		this.setDataPanel();
		this.add(dataPanel);
	}
	
	private void setDataPanel()
	{
		this.dataPanel.setLayout(new GridLayout(3,this.data.getSize() + 1));

		this.dataPanel.add(this.getLabel("Commandes", Color.GRAY));
		for(int i = 1; i <= this.data.getSize(); i++)
		{
			this.dataPanel.add(this.getLabel(i + "", Color.WHITE));
		}
		this.dataPanel.add(this.getLabel("Gains", Color.GRAY));
		for(int i = 0; i < this.data.getSize(); i++)
		{
			this.dataPanel.add(this.getLabel(this.data.getGain(i) + "", Color.WHITE));
		}
		this.dataPanel.add(this.getLabel("Masses", Color.GRAY));
		for(int i = 0; i < this.data.getSize(); i++)
		{
			this.dataPanel.add(this.getLabel(this.data.getWeight(i) + "", Color.WHITE));
		}	
	}
	
	private JPanel getLabel(String str, Color backgroundColor)
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
        
		JLabel label = new JLabel(str);
		panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel.setBackground(backgroundColor);
		panel.setOpaque(true);
		panel.add(label);
		return panel;
	}
	
	public void update()
	{
		this.dataPanel.removeAll();
		this.setDataPanel();
		this.add(this.dataPanel,0);
		this.updateUI();
	}
}
