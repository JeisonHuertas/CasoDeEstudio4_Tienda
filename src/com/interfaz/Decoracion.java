package com.interfaz;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import com.mundo.CDecoracion;
import com.mundo.CElectrodomesticos;
import com.mundo.Producto;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Decoracion extends JPanel {
	private JTextField txtValorVentaCuadros;
	private JTextField txtCantidadCuadros;
	private JTextField txtValorVentaMesas;
	private JTextField txtCantidadMesas;
	private JTextField txtValorVentaRelojes;
	private JTextField txtCantidadRelojes;

	/**
	 * Create the panel.
	 */
	public Decoracion() {

		setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(112, 128, 144));
		panel_1_1.setBounds(0, 0, 743, 130);
		add(panel_1_1);
		
		JLabel lblDecoracin = new JLabel("Decoraci\u00F3n");
		lblDecoracin.setForeground(Color.WHITE);
		lblDecoracin.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblDecoracin.setBounds(55, 45, 304, 46);
		panel_1_1.add(lblDecoracin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Decoracion.class.getResource("/com/imagenes/decoracion-de-la-casa (1).png")));
		lblNewLabel.setBounds(560, 11, 122, 108);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Decoracion.class.getResource("/com/imagenes/cuadro (1).png")));
		lblNewLabel_1.setBounds(62, 175, 122, 108);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cuadros");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(75, 149, 78, 14);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2 = new JLabel("Valor de venta");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(198, 156, 106, 14);
		add(lblNewLabel_2);
		
		txtValorVentaCuadros = new JTextField();
		txtValorVentaCuadros.setEditable(false);
		txtValorVentaCuadros.setColumns(10);
		txtValorVentaCuadros.setBounds(194, 181, 142, 26);
		add(txtValorVentaCuadros);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(194, 218, 78, 14);
		add(lblNewLabel_2_1);
		
		txtCantidadCuadros = new JTextField();
		txtCantidadCuadros.setEditable(false);
		txtCantidadCuadros.setColumns(10);
		txtCantidadCuadros.setBounds(194, 243, 142, 26);
		add(txtCantidadCuadros);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Mesas");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setBounds(427, 149, 78, 14);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon(Decoracion.class.getResource("/com/imagenes/mesa-circular (1).png")));
		lblNewLabel_1_1.setBounds(411, 175, 122, 108);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Valor de venta");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(559, 156, 96, 14);
		add(lblNewLabel_2_3);
		
		txtValorVentaMesas = new JTextField();
		txtValorVentaMesas.setEditable(false);
		txtValorVentaMesas.setColumns(10);
		txtValorVentaMesas.setBounds(555, 181, 142, 26);
		add(txtValorVentaMesas);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cantidad");
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(555, 218, 78, 14);
		add(lblNewLabel_2_1_1);
		
		txtCantidadMesas = new JTextField();
		txtCantidadMesas.setEditable(false);
		txtCantidadMesas.setColumns(10);
		txtCantidadMesas.setBounds(555, 243, 142, 26);
		add(txtCantidadMesas);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Relojes");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_2.setBounds(262, 334, 78, 14);
		add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(Decoracion.class.getResource("/com/imagenes/reloj (1).png")));
		lblNewLabel_1_1_1.setBounds(245, 359, 122, 108);
		add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor de venta");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(381, 341, 96, 14);
		add(lblNewLabel_2_4);
		
		txtValorVentaRelojes = new JTextField();
		txtValorVentaRelojes.setEditable(false);
		txtValorVentaRelojes.setColumns(10);
		txtValorVentaRelojes.setBounds(377, 366, 142, 26);
		add(txtValorVentaRelojes);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Cantidad");
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(377, 403, 78, 14);
		add(lblNewLabel_2_1_2);
		
		txtCantidadRelojes = new JTextField();
		txtCantidadRelojes.setEditable(false);
		txtCantidadRelojes.setColumns(10);
		txtCantidadRelojes.setBounds(377, 428, 142, 26);
		add(txtCantidadRelojes);

	}
	public void actualizar(Producto[] arrayDeco) {
		txtValorVentaCuadros.setText(formatearValorEntero(arrayDeco[0].darValorVenta()));
		txtValorVentaMesas.setText(formatearValorEntero(arrayDeco[1].darValorVenta()));
		txtValorVentaRelojes.setText(formatearValorEntero(arrayDeco[2].darValorVenta()));
		txtCantidadCuadros.setText(formatearValorEntero(arrayDeco[0].darCantidad()));
		txtCantidadMesas.setText(formatearValorEntero(arrayDeco[1].darCantidad()));
		txtCantidadRelojes.setText(formatearValorEntero(arrayDeco[2].darCantidad()));
	}
	private String formatearValorEntero(int valor) {
		return Integer.toString(valor);
	}

}
