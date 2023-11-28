import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class IMC {

	public static void main(String[] args) {
		JFrame frame = new JFrame("IMC");
		JPanel panel = new JPanel();
		
		JLabel titulo = new JLabel("Calculadora de IMC");
		JLabel altura = new JLabel("Digite sua altura: ");
		JLabel peso = new JLabel("Digite sua peso: ");
		
		JTextField height = new JTextField();
		JTextField weight = new JTextField();
		
		JButton calcular = new JButton("Calcular");
		
		JLabel resultado = new JLabel();
		JLabel imcMedia = new JLabel();
		JLabel aviso = new JLabel("*Classificação segundo a OMS*");
		
		panel.setLayout(null);
		altura.setBounds(35, 55, 100, 30);
		height.setBounds(150, 60, 100, 20);
		peso.setBounds(35, 85, 100, 30);
		weight.setBounds(150, 90, 100, 20);
		calcular.setBounds(100, 130, 100, 30);
		titulo.setBounds(80, 20, 200, 30);
		resultado.setBounds(95, 170, 200, 30);
		aviso.setBounds(56, 260, 300, 30);
		
		calcular.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	double alturaValor = Double.valueOf(height.getText());
	            	double pesoValor = Double.valueOf(weight.getText());
	            	
	            	double imc = pesoValor / (alturaValor * 2);
	            	resultado.setText("Seu IMC é:  " + String.valueOf(imc));
	            	
	            	if (imc < 18.5) {
	            		imcMedia.setText("Abaixo do peso normal");
	            		imcMedia.setBounds(85, 200, 200, 30);
	            	}
	            	else if (imc >= 18.5 && imc <=24.9) {
	            		imcMedia.setText("Peso normal");
	            		imcMedia.setBounds(115, 200, 200, 30);
	            	}
	            	else if (imc >= 25.0 && imc <= 29.9) {
	            		imcMedia.setText("Excesso de Peso");
	            		imcMedia.setBounds(102, 200, 200, 30);
	            	}
	            	else if (imc >= 30.0 && imc <= 34.9) {
	            		imcMedia.setText("Obesidade I");
	            		imcMedia.setBounds(115, 200, 200, 30);
	            	}
	            	else if (imc >= 35.0 && imc <= 39.9) {
	            		imcMedia.setText("Obesidade II");
	            		imcMedia.setBounds(112, 200, 200, 30);
	            	}
	            	else {
	            		imcMedia.setText("Obesidade III");
	            		imcMedia.setBounds(111, 200, 200, 30);
	            	}
	            }});
		
		panel.add(altura);
		panel.add(height);
		panel.add(peso);
		panel.add(weight);
		panel.add(calcular);
		panel.add(titulo);
		panel.add(resultado);
		panel.add(imcMedia);
		panel.add(aviso);
		
		frame.add(panel);
		frame.setSize(300, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
