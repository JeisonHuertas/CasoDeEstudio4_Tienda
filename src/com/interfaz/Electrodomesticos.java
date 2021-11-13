package com.interfaz;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.mundo.CElectrodomesticos;

public class Electrodomesticos extends JPanel {
	private JTextField txtValorVentaEstufa;
	private JTextField txtCantidadEstufas;
	private JTextField txtValorVentaNeveras;
	private JTextField txtCantidadNeveras;
	private JTextField txtValorVentaLavadoras;
	private JTextField txtCantidadLavadoras;
	private Aplicacion principal;
	
	
	/**
	 * Create the panel.
	 */
	public Electrodomesticos(Aplicacion principal) {
		this.principal = principal;
		setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(123, 104, 238));
		panel_1_1.setBounds(0, 0, 743, 130);
		add(panel_1_1);
		
		JLabel lblElectrodomesticos = new JLabel("Electrodom\u00E9sticos");
		lblElectrodomesticos.setForeground(Color.WHITE);
		lblElectrodomesticos.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblElectrodomesticos.setBounds(55, 45, 304, 46);
		panel_1_1.add(lblElectrodomesticos);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Electrodomesticos.class.getResource("/com/imagenes/electrodomesticos (1).png")));
		lblNewLabel.setBounds(560, 11, 122, 108);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Electrodomesticos.class.getResource("/com/imagenes/horno (1).png")));
		lblNewLabel_1.setBounds(47, 167, 122, 108);
		add(lblNewLabel_1);
		
		txtValorVentaEstufa = new JTextField();
		txtValorVentaEstufa.setEditable(false);
		txtValorVentaEstufa.setBounds(179, 173, 142, 26);
		add(txtValorVentaEstufa);
		txtValorVentaEstufa.setColumns(10);
		
		txtCantidadEstufas = new JTextField();
		txtCantidadEstufas.setEditable(false);
		txtCantidadEstufas.setColumns(10);
		txtCantidadEstufas.setBounds(179, 235, 142, 26);
		add(txtCantidadEstufas);
		
		JLabel lblNewLabel_2 = new JLabel("Valor de venta");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(183, 148, 94, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(179, 210, 78, 14);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Electrodomesticos.class.getResource("/com/imagenes/nevera-inteligente (1).png")));
		lblNewLabel_1_1.setBounds(396, 167, 122, 108);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Estufas");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(60, 141, 78, 14);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Valor de venta");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(544, 148, 94, 14);
		add(lblNewLabel_2_3);
		
		txtValorVentaNeveras = new JTextField();
		txtValorVentaNeveras.setEditable(false);
		txtValorVentaNeveras.setColumns(10);
		txtValorVentaNeveras.setBounds(540, 173, 142, 26);
		add(txtValorVentaNeveras);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cantidad");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(540, 210, 78, 14);
		add(lblNewLabel_2_1_1);
		
		txtCantidadNeveras = new JTextField();
		txtCantidadNeveras.setEditable(false);
		txtCantidadNeveras.setColumns(10);
		txtCantidadNeveras.setBounds(540, 235, 142, 26);
		add(txtCantidadNeveras);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Neveras");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setBounds(412, 141, 78, 14);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Electrodomesticos.class.getResource("/com/imagenes/lavad.png")));
		lblNewLabel_1_1_1.setBounds(230, 351, 122, 108);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor de venta");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(366, 333, 94, 14);
		add(lblNewLabel_2_4);
		
		txtValorVentaLavadoras = new JTextField();
		txtValorVentaLavadoras.setEditable(false);
		txtValorVentaLavadoras.setColumns(10);
		txtValorVentaLavadoras.setBounds(362, 358, 142, 26);
		add(txtValorVentaLavadoras);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Cantidad");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(362, 395, 78, 14);
		add(lblNewLabel_2_1_2);
		
		txtCantidadLavadoras = new JTextField();
		txtCantidadLavadoras.setEditable(false);
		txtCantidadLavadoras.setColumns(10);
		txtCantidadLavadoras.setBounds(362, 420, 142, 26);
		add(txtCantidadLavadoras);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Lavadoras");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setBounds(247, 326, 78, 14);
		add(lblNewLabel_2_2_2);
	}
	public void actualizar(CElectrodomesticos[] array) {
		txtValorVentaEstufa.setText(formatearValorEntero(array[0].darValorVenta()));
		txtValorVentaNeveras.setText(formatearValorEntero(array[1].darValorVenta()));
		txtValorVentaLavadoras.setText(formatearValorEntero(array[2].darValorVenta()));
		txtCantidadEstufas.setText(formatearValorEntero(array[0].darCantidad()));
		txtCantidadNeveras.setText(formatearValorEntero(array[1].darCantidad()));
		txtCantidadLavadoras.setText(formatearValorEntero(array[2].darCantidad()));
		
	}
	private String formatearValorEntero(int valor) {
		return Integer.toString(valor);
	}
}
