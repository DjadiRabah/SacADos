import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Window extends JFrame
{
	public Window()
	{
		super("TP1");
		this.setSize(1920,1200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		Data data = new Data();
		DataView dataView = new DataView(data);
		ResultView resultView = new ResultView();
		
		this.add(new WeightView(data), BorderLayout.NORTH);
		this.add(dataView, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		panel.add(new ButtonsView(data,dataView,resultView));
		panel.add(resultView);
		this.add(panel, BorderLayout.SOUTH);
	}
}