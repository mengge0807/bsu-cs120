import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //interface
import java.awt.*;   //container, GridLayout
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JApplet;
import java.awt.event.*;

public class Investment extends JApplet   implements ActionListener {	

	JLabel            labelInvestment,  labelInterestRate, labelYears, labelFinalValue, labelMessage;
	JTextField        textInvestment,  textInterestRate, textYears, textFinalValue;
	JButton           buttonCompute, buttonClear, buttonMessage;
	Container content;


public void init(){
	content=getContentPane();
	content.setBackground(Color.yellow);
	content.setLayout(new GridLayout(6,2));
	
	//The label for displaying a label called Investment
	labelInvestment=new JLabel("Investment");
	//The text field for entering investment
	textInvestment=new JTextField(10);
	//The label for displaying a label called interest rate
	labelInterestRate=new JLabel("Interest Rate");
	//The text field for entering an interest rate
	textInterestRate=new JTextField(10);
	//The label for displaying a label called Number of years 
	labelYears=new JLabel("Number of Years");
	//The text field for entering the number of years
	textYears=new JTextField(10);
	//The label for displaying a label called final value
	labelFinalValue=new JLabel("Final Value");
	//The text field for displaying the final value
	textFinalValue=new JTextField(10);
	//The button to trigger the computation of the final value
	buttonCompute=new JButton("Compute");
	//The button to trigger deleting text fields
	buttonClear=new JButton("Clear");
	//The button to trigger a message box
	buttonMessage=new JButton("Click me!!");
	//The label for displaying a label called Number of years
	labelMessage=new JLabel("Happy Father Day!!");
	//Add all objects into Container that is called content
	content.add(labelInvestment);
	content.add(textInvestment);
	content.add(labelInterestRate);
	content.add(textInterestRate);
	content.add(labelYears);
	content.add(textYears);
	content.add(labelFinalValue);
	content.add(textFinalValue);
	content.add(buttonCompute);
	content.add(buttonClear);
	content.add(buttonMessage);
	content.add(labelMessage);
	//add your code here
	buttonCompute.addActionListener(this);
	buttonClear.addActionListener(this);
	buttonMessage.addActionListener(this);

}

@Override
	public void actionPerformed (ActionEvent event){//start actionPerformed method
		if (event.getSource()==buttonCompute){//start if
		double p=Double.parseDouble(textInvestment.getText()); // get a value from textInvestment
		double r=Double.parseDouble(textInterestRate.getText());// get a value form textInterestRate
		int n=Integer.parseInt(textYears.getText());//get a value from  textYears
		double finalValue=Math.round(p*Math.pow((1+r),n));
		String result=Double.toString(finalValue);
		textFinalValue.setText("$"+result);
		}
		
		else if (event.getSource()==buttonClear){
			textInvestment.setText(null);
			textInterestRate.setText(null);
			textYears.setText(null);
			textFinalValue.setText(null);
		}
		
		else
		{
			labelMessage.setBackground(Color.red);
			labelMessage.setText("Happy Father Day!! ");
			
	String title = "Greetings from CS120"; // Shown in title bar of dialog box.
	String message = "Happy Early Father Day!!";
	JOptionPane.showMessageDialog(null, message, title,JOptionPane.INFORMATION_MESSAGE);	
			
		}//close else
}//close actionPerformed
}//close investment class
