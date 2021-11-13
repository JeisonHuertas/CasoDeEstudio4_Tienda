package com.interfaz;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.mundo.CElectrodomesticos;
import com.mundo.CTecnologia;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Tecnologia extends JPanel {
	private JTextField txtValorVentaTelevisores;
	private JTextField txtCantidadTelevisores;
	private JTextField txtValorVentaTelefonos;
	private JTextField txtCantidadTelefonos;
	private JTextField txtValorVentaCelulares;
	private JTextField txtCantidadCelulares;
	private Aplicacion principal;
	

	/**
	 * Create the panel.
	 */
	public Tecnologia(Aplicacion principal) {
		this.principal = principal;
		setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(30, 144, 255));
		panel_1_1.setBounds(0, 0, 743, 130);
		add(panel_1_1);
		
		JLabel lblTecnologa = new JLabel("Tecnolog\u00EDa");
		lblTecnologa.setForeground(Color.WHITE);
		lblTecnologa.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblTecnologa.setBounds(55, 45, 304, 46);
		panel_1_1.add(lblTecnologa);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Tecnologia.class.getResource("/com/imagenes/ordenador-portatil (1).png")));
		lblNewLabel.setBounds(560, 11, 122, 108);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Tecnologia.class.getResource("/com/imagenes/monitor-de-tv (1).png")));
		lblNewLabel_1.setBounds(58, 184, 122, 108);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Televisores");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(71, 158, 78, 14);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("Valor de venta");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(194, 165, 96, 14);
		add(lblNewLabel_2);
		
		txtValorVentaTelevisores = new JTextField();
		txtValorVentaTelevisores.setEditable(false);
		txtValorVentaTelevisores.setColumns(10);
		txtValorVentaTelevisores.setBounds(190, 190, 142, 26);
		add(txtValorVentaTelevisores);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(190, 227, 78, 14);
		add(lblNewLabel_2_1);
		
		txtCantidadTelevisores = new JTextField();
		txtCantidadTelevisores.setEditable(false);
		txtCantidadTelevisores.setColumns(10);
		txtCantidadTelevisores.setBounds(190, 252, 142, 26);
		add(txtCantidadTelevisores);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Telefonos");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setBounds(423, 158, 78, 14);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Tecnologia.class.getResource("/com/imagenes/llamada-telefonica (1).png")));
		lblNewLabel_1_1.setBounds(407, 177, 122, 115);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Valor de venta");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(555, 165, 110, 14);
		add(lblNewLabel_2_3);
		
		txtValorVentaTelefonos = new JTextField();
		txtValorVentaTelefonos.setEditable(false);
		txtValorVentaTelefonos.setColumns(10);
		txtValorVentaTelefonos.setBounds(551, 190, 142, 26);
		add(txtValorVentaTelefonos);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cantidad");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(551, 227, 78, 14);
		add(lblNewLabel_2_1_1);
		
		txtCantidadTelefonos = new JTextField();
		txtCantidadTelefonos.setEditable(false);
		txtCantidadTelefonos.setColumns(10);
		txtCantidadTelefonos.setBounds(551, 252, 142, 26);
		add(txtCantidadTelefonos);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Celulares");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setBounds(258, 343, 78, 14);
		add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Tecnologia.class.getResource("/com/imagenes/telefono-celular (1).png")));
		lblNewLabel_1_1_1.setBounds(241, 368, 122, 108);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor de venta");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(377, 350, 96, 14);
		add(lblNewLabel_2_4);
		
		txtValorVentaCelulares = new JTextField();
		txtValorVentaCelulares.setEditable(false);
		txtValorVentaCelulares.setColumns(10);
		txtValorVentaCelulares.setBounds(373, 375, 142, 26);
		add(txtValorVentaCelulares);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Cantidad");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(373, 412, 78, 14);
		add(lblNewLabel_2_1_2);
		
		txtCantidadCelulares = new JTextField();
		txtCantidadCelulares.setEditable(false);
		txtCantidadCelulares.setColumns(10);
		txtCantidadCelulares.setBounds(373, 437, 142, 26);
		add(txtCantidadCelulares);

	}
	public void actualizar(CTecnologia[] array) {
		txtValorVentaTelevisores.setText(formatearValorEntero(array[0].darValorVenta()));
		txtValorVentaTelefonos.setText(formatearValorEntero(array[1].darValorVenta()));
		txtValorVentaCelulares.setText(formatearValorEntero(array[2].darValorVenta()));
		txtCantidadTelevisores.setText(formatearValorEntero(array[0].darCantidad()));
		txtCantidadTelefonos.setText(formatearValorEntero(array[1].darCantidad()));
		txtCantidadCelulares.setText(formatearValorEntero(array[2].darCantidad()));
	}
	private String formatearValorEntero(int valor) {
		return Integer.toString(valor);
	}

}
