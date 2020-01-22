import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
//import java.awt.BorderLayout.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
//import javax.swing.JEditorPane;
//import javax.swing.DropMode;
import java.awt.SystemColor;
import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.event.*;
//import java.awt.Window.Type;
import java.lang.Math;
import java.text.MessageFormat;
public class calculator_project_frame {

	private JFrame frmSimpleCalculator;
	
	String result="",operator,sign_operator,cosign_operator,ans_operator,n1="",n2="",n3="";
	Double num1,num2,num3,answer=0.0,cosignFunctionResult=0.0;
	static Double ANS=0.0;
	String text,pattern;
	
	private JTextField textField;
	//private JLabel label_1;
	//private JLabel label_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_project_frame window = new calculator_project_frame();
					window.frmSimpleCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator_project_frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSimpleCalculator = new JFrame();
		frmSimpleCalculator.setTitle("Simple Calculator");
		frmSimpleCalculator.setResizable(false);
		frmSimpleCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\javacalculator-master\\src\\calculator-icon_2031494.png"));
		frmSimpleCalculator.setForeground(new Color(51, 0, 51));
		frmSimpleCalculator.setBackground(new Color(0, 0, 51));
		frmSimpleCalculator.getContentPane().setBackground(new Color(0, 139, 139));
		frmSimpleCalculator.setBounds(100, 100, 426, 587);
		frmSimpleCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSimpleCalculator.getContentPane().setLayout(null);
		
		
		JLabel lblFxsimpleCalculatorPlus = new JLabel(" fx-simple calculator plus");
		lblFxsimpleCalculatorPlus.setBounds(10, 11, 396, 14);
		frmSimpleCalculator.getContentPane().add(lblFxsimpleCalculatorPlus);
		
		
		JButton Zero_button = new JButton("0");
		Zero_button.setForeground(new Color(0, 153, 153));
		Zero_button.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		Zero_button.setBounds(10, 486, 89, 38);
		frmSimpleCalculator.getContentPane().add(Zero_button);
		
		
		JButton dot = new JButton(".");
		dot.setForeground(new Color(0, 153, 153));
		dot.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		dot.setBounds(109, 486, 89, 38);
		frmSimpleCalculator.getContentPane().add(dot);
		
		
		JButton equel = new JButton("=");
		equel.setForeground(new Color(0, 153, 153));
		equel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		equel.setBounds(307, 486, 99, 38);
		frmSimpleCalculator.getContentPane().add(equel);
		
		
		JButton button_1 = new JButton("1");
		button_1.setForeground(new Color(0, 153, 153));
		button_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_1.setBounds(10, 437, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_1);
		
		
		JButton button_2 = new JButton("2");
		button_2.setForeground(new Color(0, 153, 153));
		button_2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_2.setBounds(110, 437, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_2);
		
		
		JButton button_3 = new JButton("3");
		button_3.setForeground(new Color(0, 153, 153));
		button_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_3.setBounds(209, 437, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_3);
		
		
		JButton button_4 = new JButton("4");
		button_4.setForeground(new Color(0, 153, 153));
		button_4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_4.setBounds(10, 388, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_4);
		
		
		JButton button_5 = new JButton("5");
		button_5.setForeground(new Color(0, 153, 153));
		button_5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_5.setBounds(110, 388, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_5);
		
		
		JButton button_6 = new JButton("6");
		button_6.setForeground(new Color(0, 153, 153));
		button_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_6.setBounds(209, 388, 89, 38);
		button_6.setBackground(UIManager.getColor("Button.background"));
		frmSimpleCalculator.getContentPane().add(button_6);
		
		
		JButton button_7 = new JButton("7");
		button_7.setForeground(new Color(0, 153, 153));
		button_7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_7.setBounds(10, 339, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_7);
		
		
		JButton button_8 = new JButton("8");
		button_8.setForeground(new Color(0, 153, 153));
		button_8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_8.setBounds(110, 339, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_8);
		
		
		JButton button_9 = new JButton("9");
		button_9.setForeground(new Color(0, 153, 153));
		button_9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		button_9.setBounds(209, 339, 89, 38);
		frmSimpleCalculator.getContentPane().add(button_9);
		
		
		JButton sum = new JButton("+");
		sum.setForeground(new Color(0, 0, 51));
		sum.setBackground(new Color(51, 51, 102));
		sum.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		sum.setBounds(317, 437, 89, 38);
		frmSimpleCalculator.getContentPane().add(sum);
		
		
		JButton subtructor = new JButton("-");
		subtructor.setForeground(new Color(0, 0, 51));
		subtructor.setBackground(new Color(51, 51, 102));
		subtructor.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		subtructor.setBounds(317, 388, 89, 38);
		frmSimpleCalculator.getContentPane().add(subtructor);
		
		
		JButton multiplier = new JButton("*");
		multiplier.setForeground(new Color(0, 0, 51));
		multiplier.setBackground(new Color(51, 51, 102));
		multiplier.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		multiplier.setBounds(317, 339, 89, 38);
		frmSimpleCalculator.getContentPane().add(multiplier);
		
		
		JButton division = new JButton("/");
		division.setForeground(new Color(0, 0, 51));
		division.setBackground(new Color(51, 51, 102));
		division.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		division.setBounds(317, 279, 89, 38);
		frmSimpleCalculator.getContentPane().add(division);
		
		
		JButton persentise = new JButton("%");
		persentise.setForeground(new Color(0, 0, 51));
		persentise.setBackground(new Color(51, 51, 102));
		persentise.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		persentise.setBounds(317, 227, 89, 38);
		frmSimpleCalculator.getContentPane().add(persentise);
		
		
		JButton first_bracket_start = new JButton("(");
		first_bracket_start.setForeground(new Color(0, 0, 51));
		first_bracket_start.setBackground(new Color(51, 102, 153));
		first_bracket_start.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		first_bracket_start.setBounds(10, 227, 70, 38);
		frmSimpleCalculator.getContentPane().add(first_bracket_start);
		
		
		JButton first_bracket_end = new JButton(")");
		first_bracket_end.setForeground(new Color(0, 0, 51));
		first_bracket_end.setBackground(new Color(51, 102, 153));
		first_bracket_end.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		first_bracket_end.setBounds(87, 227, 70, 38);
		frmSimpleCalculator.getContentPane().add(first_bracket_end);
		
		
		JButton x_to_the_power_y = new JButton("x^Y");
		x_to_the_power_y.setForeground(new Color(0, 0, 51));
		x_to_the_power_y.setBackground(new Color(51, 102, 153));
		x_to_the_power_y.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		x_to_the_power_y.setBounds(109, 279, 89, 38);
		frmSimpleCalculator.getContentPane().add(x_to_the_power_y);
		
		
		JButton x_square = new JButton("x^2");
		x_square.setForeground(new Color(0, 0, 51));
		x_square.setBackground(new Color(51, 102, 153));
		x_square.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		x_square.setBounds(10, 279, 89, 38);
		frmSimpleCalculator.getContentPane().add(x_square);
		
		
		JButton sqrtRoot = new JButton("Sqrt");
		sqrtRoot.setForeground(new Color(0, 0, 51));
		sqrtRoot.setBackground(new Color(51, 102, 153));
		sqrtRoot.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		sqrtRoot.setBounds(209, 279, 89, 38);
		frmSimpleCalculator.getContentPane().add(sqrtRoot);
		
		
		JButton PI = new JButton("PI");
		PI.setForeground(new Color(0, 0, 51));
		PI.setBackground(new Color(51, 102, 153));
		PI.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		PI.setBounds(164, 227, 70, 38);
		frmSimpleCalculator.getContentPane().add(PI);
		
		
		JLabel lblNayem = new JLabel("Nayem Hossain");
		lblNayem.setBounds(10, 127, 190, 37);
		lblNayem.setFont(new Font("Lucida Handwriting", Font.ITALIC, 20));
		frmSimpleCalculator.getContentPane().add(lblNayem);
			
		
		JButton sin = new JButton("sin");
		sin.setForeground(new Color(153, 204, 255));
		sin.setBackground(new Color(0, 51, 102));
		sin.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		sin.setBounds(10, 178, 80, 38);
		frmSimpleCalculator.getContentPane().add(sin);
		
		
		JButton cos = new JButton("cos");
		cos.setForeground(new Color(153, 204, 255));
		cos.setBackground(new Color(0, 51, 102));
		cos.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		cos.setBounds(96, 178, 70, 38);
		frmSimpleCalculator.getContentPane().add(cos);
		
		
		JButton tan = new JButton("tan");
		tan.setForeground(new Color(153, 204, 255));
		tan.setBackground(new Color(0, 51, 102));
		tan.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		tan.setBounds(173, 178, 70, 38);
		frmSimpleCalculator.getContentPane().add(tan);
		
		
		JButton X_factorial = new JButton("X!");
		X_factorial.setForeground(new Color(153, 204, 255));
		X_factorial.setBackground(new Color(0, 51, 102));
		X_factorial.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		X_factorial.setBounds(327, 178, 80, 38);
		frmSimpleCalculator.getContentPane().add(X_factorial);
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 30, 395, 38);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		label_1.setBackground(Color.BLACK);
		frmSimpleCalculator.getContentPane().add(label_1);
		
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(10, 70, 396, 46);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		frmSimpleCalculator.getContentPane().add(label_2);
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 57));
		textField.setBounds(10, 30, 396, 87);
		frmSimpleCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton AC_clr = new JButton("AC");
		AC_clr.setForeground(new Color(255, 204, 255));
		AC_clr.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		AC_clr.setBackground(new Color(102, 51, 102));
		AC_clr.setBounds(317, 129, 89, 38);
		frmSimpleCalculator.getContentPane().add(AC_clr);
		
		
		JButton btnDel = new JButton("DEL");
		btnDel.setForeground(new Color(255, 204, 255));
		btnDel.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnDel.setBackground(new Color(102, 51, 102));
		btnDel.setBounds(218, 129, 89, 38);
		frmSimpleCalculator.getContentPane().add(btnDel);
		
		
		JButton btnLog = new JButton("ln");
		btnLog.setForeground(new Color(153, 204, 255));
		btnLog.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnLog.setBackground(new Color(0, 51, 102));
		btnLog.setBounds(251, 178, 70, 38);
		frmSimpleCalculator.getContentPane().add(btnLog);
		
		JButton btnAns = new JButton("Ans.");
		btnAns.setForeground(new Color(0, 153, 153));
		btnAns.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnAns.setBounds(208, 486, 90, 38);
		frmSimpleCalculator.getContentPane().add(btnAns);
		
		JButton btnEXP = new JButton("e^X");
		btnEXP.setForeground(new Color(0, 0, 51));
		btnEXP.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnEXP.setBackground(new Color(51, 102, 153));
		btnEXP.setBounds(241, 227, 70, 38);
		frmSimpleCalculator.getContentPane().add(btnEXP);
		
		
		Zero_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result=label_1.getText()+0;
				label_1.setText(result);
				n1=n1+0;
				n2=n2+0;
				n3=n3+0;
			}
		});
		
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(!label_1.getText().contains("."))
				{
					label_1.setText(label_1.getText()+dot.getText());
				}*/
	
				String in_number = label_1.getText()+'.';
				label_1.setText(in_number);
				n1=n1+'.';
				n2=n2+'.';
				n3=n3+'.';
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result=label_1.getText()+1;
				label_1.setText(result);
				n1=n1+1;
				n2=n2+1;
				n3=n3+1;
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				result = label_1.getText()+2;
				label_1.setText(result);
				n1=n1+2;
				n2=n2+2;
				n3=n3+2;
			}
		});
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = label_1.getText()+3;
				label_1.setText(result);
				n1=n1+3;
				n2=n2+3;
				n3=n3+3;
			}
		});
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				result = label_1.getText()+4;
				label_1.setText(result);
				n1=n1+4;
				n2=n2+4;
				n3=n3+4;
			}
		});
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            
				result = label_1.getText()+5;
				label_1.setText(result);
				n1=n1+5;
				n2=n2+5;
				n3=n3+5;
			}
		});
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = label_1.getText()+6;
				label_1.setText(result);
				n1=n1+6;
				n2=n2+6;
				n3=n3+6;
			}
		});
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = label_1.getText()+7;
				label_1.setText(result);
				n1=n1+7;
				n2=n2+7;
				n3=n3+7;
			}
		});
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = label_1.getText()+8;
				label_1.setText(result);
				n1=n1+8;
				n2=n2+8;
				n3=n3+8;
			}
		});
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result = label_1.getText()+9;
				label_1.setText(result);
				n1=n1+9;
				n2=n2+9;
				n3=n3+9;
			}
		});
		
    sum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// num1=Double.parseDouble(n3);
				// n3="0";
		 if(sign_operator=="sin") {
					operator="++";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sin(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					//num2=Double.parseDouble(n2);
					n1="0";
					n2="0";
					result = result+"+";
					label_1.setText(result);
				}
		 else if(sign_operator=="cos") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(Math.cos(Math.toRadians(num1)));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="tan") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(Math.tan(Math.toRadians(num1)));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="ln") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(Math.log(num1));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="sqrt") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(Math.sqrt(num1));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="!") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					   int fact=1;
					 
					   for(int i=1;i<=num1;i++)
						{
							fact=fact*i;
						}
					 cosignFunctionResult=(double)fact;//type casting from integer to double
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="%") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(num1/100);
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="^2") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=(Math.pow(num1,2));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="^") {
				operator="++";
				if(answer==0.0) {
					 num3=Double.parseDouble(n2);
					 n2="0";
					 cosignFunctionResult=(Math.pow(num1,num3));
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else if(sign_operator=="e^X") {
				operator="++";
				if(answer==0.0) {
					 num1=Double.parseDouble(n1);
					 cosignFunctionResult=Math.exp(num1);
					 num1=cosignFunctionResult;
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
		 else {
				operator="+";
				if(answer==0.0) {
					num1=Double.parseDouble(n1);
				}
				else {
					num1=answer;
				}
				
				//num2=Double.parseDouble(n2);
				n1="0";
				n2="0";
				result = result+"+";
				label_1.setText(result);
			}
			/*operator="+";
			if(answer==0.0) {
				num1=Double.parseDouble(n1);
			}
			else {
				num1=answer;
			}
			num2=Double.parseDouble(n2);
			n1="0";
			n2="0";
			result= result+"+";
			label_1.setText(result);*/
		}
	});
		
	subtructor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sign_operator=="sin") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sin(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					//num2=Double.parseDouble(n2);
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
				else if(sign_operator=="cos") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.cos(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="tan") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.tan(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="ln") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.log(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="sqrt") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sqrt(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="!") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						   int fact=1;
						 
						   for(int i=1;i<=num1;i++)
							{
								fact=fact*i;
							}
						 cosignFunctionResult=(double)fact;//type casting from integer to double
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="%") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(num1/100);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="^2") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.pow(num1,2));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="^") {
					operator="--";
					if(answer==0.0) {
						 num3=Double.parseDouble(n2);
						 n2="0";
						 cosignFunctionResult=(Math.pow(num1,num3));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			 else if(sign_operator=="e^X") {
					operator="--";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=Math.exp(num2);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"-";
					label_1.setText(result);
				}
			else {
				   operator="-";
				if(answer==0.0) {
					num1=Double.parseDouble(n1);
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"-";
				label_1.setText(result);
			}
		}
	});
		
	multiplier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(sign_operator=="sin") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sin(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					//num2=Double.parseDouble(n2);
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
				else if(sign_operator=="cos") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.cos(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="tan") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.tan(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="ln") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.log(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="sqrt") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sqrt(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="!") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						   int fact=1;
						 
						   for(int i=1;i<=num1;i++)
							{
								fact=fact*i;
							}
						 cosignFunctionResult=(double)fact;//type casting from integer to double
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="%") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(num1/100);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="^2") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.pow(num1,2));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="^") {
					operator="**";
					if(answer==0.0) {
						 num3=Double.parseDouble(n2);
						 n2="0";
						 cosignFunctionResult=(Math.pow(num1,num3));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
			 else if(sign_operator=="e^X") {
					operator="**";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=Math.exp(num2);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"*";
					label_1.setText(result);
				}
				
			else {
				   operator="*";
				if(answer==0.0) {
					num1=Double.parseDouble(n1);
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"*";
				label_1.setText(result);
			}

			}
		});
		
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(sign_operator=="sin") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sin(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					//num2=Double.parseDouble(n2);
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
				else if(sign_operator=="cos") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.cos(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="tan") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.tan(Math.toRadians(num1)));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="ln") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.log(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="sqrt") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.sqrt(num1));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="!") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						   int fact=1;
						 
						   for(int i=1;i<=num1;i++)
							{
								fact=fact*i;
							}
						 cosignFunctionResult=(double)fact;//type casting from integer to double
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="%") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(num1/100);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="^2") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=(Math.pow(num1,2));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="^") {
					operator="//";
					if(answer==0.0) {
						 num3=Double.parseDouble(n2);
						 n2="0";
						 cosignFunctionResult=(Math.pow(num1,num3));
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
			 else if(sign_operator=="e^X") {
					operator="//";
					if(answer==0.0) {
						 num1=Double.parseDouble(n1);
						 cosignFunctionResult=Math.exp(num2);
						 num1=cosignFunctionResult;
					}
					else {
						num1=answer;
					}
					n1="0";
					n2="0";
					result = result+"/";
					label_1.setText(result);
				}
				
			else {
				   operator="/";
				if(answer==0.0) {
					num1=Double.parseDouble(n1);
				}
				else {
					num1=answer;
				}
				n1="0";
				n2="0";
				result = result+"/";
				label_1.setText(result);
			 }

		   }
		});
		
		persentise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_operator="%";
				result = label_1.getText()+"%";
				 label_1.setText(result);
			     num2=Double.parseDouble(n1);
			 // n1="0";
			 /* double percent= Double.parseDouble(String.valueOf(label_1.getText()));
				percent = (percent/100);
				label_2.setText(String.valueOf(percent));*/
			}
		});
		
		first_bracket_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = label_1.getText()+'(';
				label_1.setText(result);
			}
		});
		
		first_bracket_end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = label_1.getText()+')';
				label_1.setText(result);
			}
		});
		
		sqrtRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_operator="sqrt";
			 //  label_1.setText("sqrt(");
				 result = label_1.getText()+"sqrt(";
				 label_1.setText(result);
			}
		});
		
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sign_operator="ln";
				
				// label_1.setText("ln(");
				    result = label_1.getText()+"ln(";
					label_1.setText(result);
					
					//n1=n1+Math.log(num2);
					//n2=n2+Math.log(num2);
			//  num2=Double.parseDouble(n2);
			//	n2=n2+Math.log(num2);
			//  n2="0";
			/* double log= Double.parseDouble(String.valueOf(label_1.getText()));
				log = Math.log(log);
				label_2.setText(String.valueOf(log));*/
			}
		});
		
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sign_operator="sin";
				 result = label_1.getText()+"sin(";
				 label_1.setText(result);
				
					
				// label_1.setText("sin(");
			   //  num2=Double.parseDouble(n2);
			   //  n2="0";
			 /* double sin= Double.parseDouble(String.valueOf(label_1.getText()));
				sin = Math.sin(sin);
				label_2.setText(String.valueOf(sin));*/
			}
		});
		
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			/*	operator="cosine";
				result = label_1.getText()+"cosine(";
				label_1.setText(result);
				result="0";
				n1="0";*/
				
				sign_operator="cos";
				 result = label_1.getText()+"cos(";
				 label_1.setText(result);
				//  label_1.setText("cos(");
			   //  num2=Double.parseDouble(n2);
			  //  n2="0";
					
			//	double cosine= Double.parseDouble(String.valueOf(label_1.getText()));
			//	cosine = Math.cos(cosine);
			//  label_2.setText(String.valueOf(cosine));
			}
		});
		
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 sign_operator="tan";
				 result = label_1.getText()+"tan(";
				 label_1.setText(result);
				// label_1.setText("tan(");
			   //   num2=Double.parseDouble(n2);
			  //   n2="0";
				 
			 //  double tan= Double.parseDouble(String.valueOf(label_1.getText()));
			 //  tan = Math.tan(tan);
			 //  label_2.setText(String.valueOf(tan));*/
			}
		});
		
		x_to_the_power_y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ans_operator=="ans") {
					sign_operator="^";
					result = label_2.getText()+"^";
					label_1.setText(result);
					num1=Double.parseDouble(n2);
					n2="0";
		    	   }
				else {
					sign_operator="^";
					 result = label_1.getText()+"^";
					 label_1.setText(result);
				     num1=Double.parseDouble(n2);
					 n2="0";
					}
				
				/*double x= Double.parseDouble(String.valueOf(label_1.getText()));
				x = Math.pow(x,x);
				label_2.setText(String.valueOf(x));*/
			}
		});
		
		x_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ans_operator=="ans") {
					sign_operator="^2";
					result = label_2.getText()+"^2";
					label_1.setText(result);
		    	   }
				else {
				   sign_operator="^2";
				   result = label_1.getText()+"^2";
				   label_1.setText(result);
				}
			    // num2=Double.parseDouble(n1);
				// n1="0";
				/*double square= Double.parseDouble(String.valueOf(label_1.getText()));
				square = (square*square);
				label_2.setText(String.valueOf(square));*/
			}
		});
		
		PI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   /*double pi;
				pi= 3.141592654;
				label_1.setText(String.valueOf(pi));*/
				
				result = label_1.getText()+3.141592654;
				label_1.setText(result);
				n1=n1+3.141592654;
				n2=n2+3.141592654;
				
			}
		});
		btnEXP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  sign_operator="e^X";
				  result = label_1.getText()+"e^";
				  label_1.setText(result);
			   //  num1=Double.parseDouble(n1);
			   //  n1="0";
			}
		});
		
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String delete=null;
				
				if(label_1.getText().length()>0)
				{
					StringBuilder strB = new StringBuilder(label_1.getText());
					strB.deleteCharAt(label_1.getText().length()-1);
					delete=strB.toString();
					label_1.setText(delete);
				}
			}
		});
		
		X_factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				 sign_operator="!";
				 result = label_1.getText()+" !";
				 label_1.setText(result);
			     num2=Double.parseDouble(n1);
			 
			 // n1="0";
			 /* int fact=1;
				int n= Integer.parseInt(String.valueOf(label_1.getText()));
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				label_2.setText(String.valueOf(fact));
			 */
				
			}
		});
		
  equel.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
				
     num2=Double.parseDouble(n2);

        if(operator=="++") {
	           answer=num1+num2;
	           ANS=answer;
	           result= String.format("%.10f", answer);
	           label_2.setText(result);
        }	
        else if(operator=="--") {
	           answer=num1-num2;
	           ANS=answer;
	           result= String.format("%.10f", answer);
	           label_2.setText(result);
        }
        else if(operator=="**") {
	           answer=num1*num2;
	           ANS=answer;
	           result= String.format("%.10f", answer);
	           label_2.setText(result);
        }
        else if(operator=="//") {
	           answer=num1/num2;
	           ANS=answer;
	           result= String.format("%.10f", answer);
	           label_2.setText(result);
        }
       else if (operator=="+") {
					
				 if(operator=="+" && sign_operator=="ln") {
					   answer=num1+(Math.log(num2));
					   ANS=answer;
					   result= String.format("%.10f", answer);
					   label_2.setText(result); 
					        /*    n2=""+Math.sqrt(Double.parseDouble(n2));
						          num2=Double.parseDouble(n2);
						          num2=Math.sqrt(num2);
					              answer=num1+num2;
					              result= String.format("%.10f", answer);
					              label_2.setText(result); */
					    
				}
				 else if(operator=="+" && sign_operator=="sin") {
					   answer=num1+(Math.sin(Math.toRadians(num2)));
					   ANS=answer;
					   result= String.format("%.10f", answer);
					   label_2.setText(result); 
			    }
				 else if(operator=="+" && sign_operator=="cos") {
				       answer=num1+(Math.cos(Math.toRadians(num2)));
				       ANS=answer;
				       result= String.format("%.10f", answer);
				       label_2.setText(result); 
			     } 
				 else if(operator=="+" && sign_operator=="tan") {
				      answer=num1+(Math.tan(Math.toRadians(num2)));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="+" && sign_operator=="sqrt") {
				      answer=num1+(Math.sqrt(num2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="+" && sign_operator=="%") {
				      answer=num1+(num2/100);
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="+" && sign_operator=="!") {
					
					   int fact=1;
					 
					   for(int i=1;i<=num2;i++)
						{
							fact=fact*i;
						}
					   answer=(double)fact; //type casting from int to double
					   answer=num1+answer;
					   ANS=answer;
					   result= String.format("%.10f", answer);
					   label_2.setText(result);
			     }
				 else if(operator=="+" && sign_operator=="^2") {
				      answer=num1+(Math.pow(num2,2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="+" && sign_operator=="^") {
				      answer=num1+(Math.pow(num1,num2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="+" && sign_operator=="e^X") {
					  answer=Math.exp(num2);
				      answer=num1+answer;
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				
				 else {
					answer=num1+num2;
					ANS=answer;
					result= String.format("%.10f", answer);
					label_2.setText(result);
					
					//num1=Double.parseDouble(result);
					//copy_result=Double.parseDouble(result);
				  }
					
        }

else if (operator=="-") {
					
					 if(operator=="-" && sign_operator=="ln") {
							answer=num1-Math.log(num2);
							ANS=answer;
							result= String.format("%.10f", answer);
							label_2.setText(result); 
					}
					 else if(operator=="-" && sign_operator=="sin") {
						   answer=num1-Math.sin(Math.toRadians(num2));
						   ANS=answer;
						   result= String.format("%.10f", answer);
						   label_2.setText(result); 
				    }
					 else if(operator=="-" && sign_operator=="cos") {
					       answer=num1-Math.cos(Math.toRadians(num2));
					       ANS=answer;
					       result= String.format("%.10f", answer);
					       label_2.setText(result); 
				     } 
					 else if(operator=="-" && sign_operator=="tan") {
					      answer=num1-Math.tan(Math.toRadians(num2));
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="-" && sign_operator=="sqrt") {
					      answer=num1-Math.sqrt(num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="-" && sign_operator=="%") {
					      answer=num1-(num2/100);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="-" && sign_operator=="!") {
						
						   int fact=1;
						 
						   for(int i=1;i<=num2;i++)
							{
								fact=fact*i;
							}
						   answer=(double)fact; //type casting from int to double
						   answer=num1-answer;
						   ANS=answer;
						   result= String.format("%.10f", answer);
						   label_2.setText(result);
				     }
					 else if(operator=="-" && sign_operator=="^2") {
					      answer=num1-Math.pow(num2,2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="-" && sign_operator=="^") {
					      answer=num1-Math.pow(num1,num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="-" && sign_operator=="e^X") {
					      answer=num1-Math.exp(num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else {
					        answer=num1-num2;
				        	ANS=answer;
					        result= String.format("%.10f", answer);
					        label_2.setText(result);
					        //copy_result=Double.parseDouble(result);
					 }
        }
			
else if (operator=="*") {
					
					 if(operator=="*" && sign_operator=="ln") {
							answer=num1*Math.log(num2);
							ANS=answer;
							result= String.format("%.10f", answer);
							label_2.setText(result); 
					}
					 else if(operator=="*" && sign_operator=="sin") {
						   answer=num1*Math.sin(Math.toRadians(num2));
						   ANS=answer;
						   result= String.format("%.10f", answer);
						   label_2.setText(result); 
				    }
					 else if(operator=="*" && sign_operator=="cos") {
					       answer=num1*Math.cos(Math.toRadians(num2));
					       ANS=answer;
					       result= String.format("%.10f", answer);
					       label_2.setText(result); 
				     } 
					 else if(operator=="*" && sign_operator=="tan") {
					      answer=num1*Math.tan(Math.toRadians(num2));
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="*" && sign_operator=="sqrt") {
					      answer=num1*Math.sqrt(num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="*" && sign_operator=="%") {
					      answer=num1*(num2/100);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="*" && sign_operator=="!") {
						
						   int fact=1;
						 
						   for(int i=1;i<=num2;i++)
							{
								fact=fact*i;
							}
						   answer=(double)fact; //type casting from int to double
						   answer=num1*answer;
						   ANS=answer;
						   result= String.format("%.10f", answer);
						   label_2.setText(result);
				     }
					 else if(operator=="*" && sign_operator=="^2") {
					      answer=num1*Math.pow(num2,2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="*" && sign_operator=="^") {
					      answer=num1*Math.pow(num1,num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else if(operator=="*" && sign_operator=="e^X") {
					      answer=num1*Math.exp(num2);
					      ANS=answer;
					      result= String.format("%.10f", answer);
					      label_2.setText(result); 
				     }
					 else {
					        answer=num1*num2;
					        ANS=answer;
					        result= String.format("%.10f", answer);
					        label_2.setText(result);
					 }
       }

else if (operator=="/") {
					
				if(operator=="/" && sign_operator=="ln") {
						answer=num1/(Math.log(num2));
						ANS=answer;
						result= String.format("%.10f", answer);
						label_2.setText(result); 
				}
				 else if(operator=="/" && sign_operator=="sin") {
					   answer=num1/(Math.sin(Math.toRadians(num2)));
					   ANS=answer;
					   result= String.format("%.10f", answer);
					   label_2.setText(result); 
			    }
				 else if(operator=="/" && sign_operator=="cos") {
				       answer=num1/(Math.cos(Math.toRadians(num2)));
				       ANS=answer;
				       result= String.format("%.10f", answer);
				       label_2.setText(result); 
			     } 
				 else if(operator=="/" && sign_operator=="tan") {
				      answer=num1/(Math.tan(Math.toRadians(num2)));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="/" && sign_operator=="sqrt") {
				      answer=num1/(Math.sqrt(num2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="/" && sign_operator=="%") {
				      answer=num1/((num2/100));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="/" && sign_operator=="!") {
					
					   int fact=1;
					 
					   for(int i=1;i<=num2;i++)
						{
							fact=fact*i;
						}
					   answer=(double)fact; // type casting from int to double
					   answer=num1/answer;
					   ANS=answer;
					   result= String.format("%.10f", answer);
					   label_2.setText(result);
			     }
				 else if(operator=="/" && sign_operator=="^2") {
				      answer=num1/(Math.pow(num2,2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="/" && sign_operator=="^") {
				      answer=num1/(Math.pow(num1,num2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else if(operator=="/" && sign_operator=="e^X") {
				      answer=num1/(Math.exp(num2));
				      ANS=answer;
				      result= String.format("%.10f", answer);
				      label_2.setText(result); 
			     }
				 else {
				        answer=num1/num2;
				        ANS=answer;
				        result= String.format("%.10f", answer);
				        label_2.setText(result);
				 }
      }
			
else if (sign_operator=="sin") {
	
	    /*  if(sign_operator=="sin" && cosign_operator=="++") {
	    	 
	    	       // num1=Double.parseDouble(n2);
	    	    //    num2=Double.parseDouble(n2);
	    	        
	    	  answer=Math.sin(Math.toRadians(num2)) + num1;
		           // answer=answer;
		            ANS=answer;
		            result= String.format("%.10f", answer);
		            label_2.setText(result);
	}
	       else {*/
					answer=Math.sin(Math.toRadians(num2));
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
				//}
    }
else if (sign_operator=="cos") {
					answer=Math.cos(Math.toRadians(num2));	
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
				}
else if (sign_operator=="tan") {
					answer=Math.tan(Math.toRadians(num2));
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
					
				}
       else if (sign_operator=="ln") {
	                answer=Math.log(num2);
	                ANS=answer;
	                result= String.format("%.10f", answer);
                    label_2.setText(result);
               }
       else if ((sign_operator=="sqrt")) {
					answer=Math.sqrt(num2);	
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);	
				}					
       else if (sign_operator=="%") {
					answer=num2/100;
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
				}
       else if (sign_operator=="^") {
					answer=Math.pow(num1, num2);
					ANS=answer;
					result= String.format("%.6f", answer);
				    label_2.setText(result);
				}
       else if (sign_operator=="^2") {
					answer=Math.pow(num2, 2);
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
				}
       else if (sign_operator=="e^X") {
					answer=Math.exp(num2);
					ANS=answer;
					result= String.format("%.10f", answer);
				    label_2.setText(result);
				}
       else if (sign_operator=="!") {
	
				int fact=1;
				//  int n= Integer.parseInt(String.valueOf(label_1.getText()));
				for(int i=1;i<=num2;i++)
				{
					fact=fact*i;
				}
				answer=(double)fact; //type casting from int to double
				ANS=answer;
				//label_2.setText(String.valueOf(fact));
				result= String.format("%.10f", answer);
			    label_2.setText(result);
				}
       else {
    	   text=label_1.getText();
    	   pattern="++";
             }
        
        
        
		   }
     });
		
	btnAns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sign_operator=="sqrt") {
					ans_operator="ans";
					result = "sqrt("+ANS;
					label_1.setText(result);
					n1=n1+ANS;
					n2=n2+ANS;
				}
				else {
					ans_operator="ans";
					result = label_1.getText()+ANS;
					label_2.setText(result);
					n1=n1+ANS;
					n2=n2+ANS;
				}
				
			    // 	 answer=ANS;
			    //   num1=answer;
				//	 result =String.format("%.6f",answer);
				//	 label_2.setText(result);
				/*   operator="+";
						if(answer==0.0) {
							num1=Double.parseDouble(n1);
						}
						//num1=Double.parseDouble(n1);
						else {
							num1=answer;
						}
						num2=Double.parseDouble(n2);
						n1="0";
						n2="0";
						result = result+"+";
					
						label_1.setText(result);*/
			}
	});
		
	AC_clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				label_1.setText("");
				label_2.setText("");
				operator="";
				sign_operator="";
				cosign_operator="";
				ans_operator="";
				result="";
				n1="";
				n2="";
				n3="";
				cosignFunctionResult=0.0;
				answer=0.0;
				num1=0.0;
				num2=0.0;
				num3=0.0;
				
				
			}
		});
		
	}
}
