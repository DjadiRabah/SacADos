import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ResultView extends JPanel
{
	protected JLabel label;
	public ResultView() 
	{
		super();
		this.label = new JLabel("Solution");
		this.setLayout(new GridBagLayout());
		this.add(this.label);
	}
	
	private void setLabel(ArrayList<Integer> solution)
	{
		String str = new String();
		for(int i = 0; i < solution.size(); i++)
		{
			str = str + solution.get(i).intValue() + " ";
		}
		this.label.setText(str);
	}
	
	public void update(ArrayList<Integer> solution)
	{
		this.setLabel(solution);
		this.repaint();
		this.updateUI();
	}

}
