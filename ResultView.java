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
	
	private void setLabel(ArrayList<Integer> solution, long time)
	{
		String str = new String();
		for(int i = 0; i < solution.size(); i++)
		{
			str = str + solution.get(i).intValue() + " "; 
		}
		str = str + " en " + time / Math.pow(10.0,9.0) + " secondes"; 
		this.label.setText(str);
	}
	
	public void update(ArrayList<Integer> solution, long time)
	{
		this.setLabel(solution, time);
		this.repaint();
		this.updateUI();
	}
}
