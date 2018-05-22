package Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame
{
	JLabel lbl_num1, lbl_num2, lbl_result;
	JTextField txt_num1, txt_num2;
	JButton btn_soma, btn_sub, btn_div, btn_mult;
	double resultado; 
	
	public Calculadora() {
		super("Calculadora - TM");
		setLayout(null);
		Container tela = getContentPane();
		lbl_num1 = new JLabel("Primeiro Número");
		lbl_num2 = new JLabel("Segundo Número");
		lbl_result = new JLabel("Resultado da Operação: ");
		txt_num1 = new JTextField();
		txt_num2 = new JTextField();
		btn_soma = new JButton("Somar");
		btn_sub = new JButton("Subtrair");
		btn_div = new JButton("Dividir");
		btn_mult = new JButton("Multiplicar");
		
		lbl_num1.setBounds(20, 20, 100, 20);
		lbl_num2.setBounds(20, 50, 100, 20);
		lbl_result.setBounds(20, 230, 200, 20);
		txt_num1.setBounds(125, 20, 80, 20);
		txt_num2.setBounds(125, 50, 80, 20);
		btn_soma.setBounds(60, 80, 120, 20);
		btn_sub.setBounds(60, 120, 120, 20);
		btn_div.setBounds(60, 160, 120, 20);
		btn_mult.setBounds(60, 200, 120, 20);
		
		btn_soma.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2;	
				num1 = Double.parseDouble(txt_num1.getText());
				num2 = Double.parseDouble(txt_num2.getText());
				resultado = num1+num2;	
				lbl_result.setText("Resultado da Operação:  "+resultado);
			}});
		btn_sub.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2;	
				num1 = Double.parseDouble(txt_num1.getText());
				num2 = Double.parseDouble(txt_num2.getText());
				resultado = num1-num2;
				lbl_result.setText("Resultado da Operação:  "+resultado);
			}});
		btn_div.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2;	
				num1 = Double.parseDouble(txt_num1.getText());
				num2 = Double.parseDouble(txt_num2.getText());
				resultado = num1/num2;		
				lbl_result.setText("Resultado da Operação:  "+resultado);
			}});
		btn_mult.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2;
				num1 = Double.parseDouble(txt_num1.getText());
				num2 = Double.parseDouble(txt_num2.getText());
				resultado = num1*num2;			
				lbl_result.setText("Resultado da Operação:  "+resultado);
			}});
			
		tela.add(lbl_num1);
		tela.add(lbl_num2);
		tela.add(lbl_result);
		tela.add(txt_num1);
		tela.add(txt_num2);
		tela.add(btn_soma);
		tela.add(btn_sub);
		tela.add(btn_div);
		tela.add(btn_mult);
		
		setSize(250,300);
		setResizable(false);
		setVisible(true);
	}
    public static void main( String[] args )
    {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
