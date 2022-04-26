package PorvaLT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtQuantidade;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora BOVINA");
		lblNewLabel.setBounds(157, 39, 114, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor da Arroba");
		lblNewLabel_1.setBounds(31, 111, 84, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Arrobas");
		lblNewLabel_2.setBounds(31, 165, 114, 14);
		contentPane.add(lblNewLabel_2);
		
		txtValor = new JTextField();
		txtValor.setBounds(217, 108, 160, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(217, 162, 160, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Total a Pagar");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtValor.getText());
				double quantidade = Double.parseDouble(txtQuantidade.getText());
				double total = valor * quantidade;
				JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + total);
			}
		});
		btnCalcular.setBounds(139, 215, 160, 23);
		contentPane.add(btnCalcular);
	}
}
