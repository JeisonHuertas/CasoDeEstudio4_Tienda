
package com.interfaz;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import com.mundo.CDecoracion;
import com.mundo.CElectrodomesticos;
import com.mundo.CTecnologia;
import com.mundo.Producto;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Modificar extends JPanel {
	private JTextField txtValorDeVenta;
	private JTextField txtCantidad;
	private JTextField txtCantidadVendida;
	private Aplicacion principal;
	private JComboBox comboBoxModificar;
	private JComboBox comboBoxVender;
	private JTextField txtValorInversion;
	/**
	 * Create the panel.
	 */
	public Modificar(Aplicacion principal) {
		this();
		this.principal = principal;
	}
	public Modificar() {
		setLayout(null);
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(188, 143, 143));
		panel_1_1.setBounds(0, 0, 743, 130);
		add(panel_1_1);
		
		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setForeground(Color.WHITE);
		lblModificar.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblModificar.setBounds(315, 45, 137, 46);
		panel_1_1.add(lblModificar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(560, 11, 122, 108);
		panel_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Modificar el precio de venta");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(113, 154, 170, 14);
		add(lblNewLabel_1);
		
		txtValorDeVenta = new JTextField();
		txtValorDeVenta.setBounds(171, 313, 123, 28);
		add(txtValorDeVenta);
		txtValorDeVenta.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor de venta");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(36, 313, 97, 28);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cantidad");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(36, 352, 69, 28);
		add(lblNewLabel_2_1);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(171, 352, 123, 28);
		add(txtCantidad);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionUsuario = (String)comboBoxModificar.getSelectedItem();
				modificarPrecioDeVenta(principal.darProductos());
				int cantidad = Integer.parseInt(txtCantidad.getText());
				principal.calcularInversionTotal(cantidad, seleccionUsuario);
				principal.actualizar();
			}
		});
		btnModificar.setFont(new Font("Arial", Font.BOLD, 12));
		btnModificar.setBounds(127, 391, 97, 38);
		add(btnModificar);
		
		comboBoxModificar = new JComboBox();
		comboBoxModificar.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxModificar.setBounds(171, 214, 144, 38);
		comboBoxModificar.addItem("Estufas");
		comboBoxModificar.addItem("Neveras");
		comboBoxModificar.addItem("Lavadoras");
		comboBoxModificar.addItem("Televisores");
		comboBoxModificar.addItem("Celulares");
		comboBoxModificar.addItem("Telefonos");
		comboBoxModificar.addItem("Cuadros");
		comboBoxModificar.addItem("Mesas");
		comboBoxModificar.addItem("Relojes");
		
		add(comboBoxModificar);
		
		JLabel lblNewLabel_2_2 = new JLabel("Seleccione el producto");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(36, 214, 144, 38);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("A\u00F1adir ventas");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(545, 154, 97, 14);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Seleccione el producto");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(435, 214, 144, 38);
		add(lblNewLabel_2_2_1);
		
		comboBoxVender = new JComboBox();
		comboBoxVender.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxVender.setBounds(572, 214, 144, 38);
		comboBoxVender.addItem("Estufas");
		comboBoxVender.addItem("Neveras");
		comboBoxVender.addItem("Lavadoras");
		comboBoxVender.addItem("Televisores");
		comboBoxVender.addItem("Celulares");
		comboBoxVender.addItem("Telefonos");
		comboBoxVender.addItem("Cuadros");
		comboBoxVender.addItem("Mesas");
		comboBoxVender.addItem("Relojes");
		add(comboBoxVender);
		
		JLabel lblNewLabel_2_3 = new JLabel("Cantidad Vendida");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_3.setBounds(435, 291, 127, 28);
		add(lblNewLabel_2_3);
		
		txtCantidadVendida = new JTextField();
		txtCantidadVendida.setColumns(10);
		txtCantidadVendida.setBounds(572, 291, 123, 28);
		add(txtCantidadVendida);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventasRealizadas(principal.darProductos());
				principal.actualizar();
			}
		});
		btnAgregar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAgregar.setBounds(523, 369, 97, 38);
		add(btnAgregar);
		
		JLabel lblNewLabel_2_4 = new JLabel("Valor de Inversion");
		lblNewLabel_2_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_4.setBounds(36, 274, 111, 28);
		add(lblNewLabel_2_4);
		
		txtValorInversion = new JTextField();
		txtValorInversion.setColumns(10);
		txtValorInversion.setBounds(171, 274, 123, 28);
		add(txtValorInversion);

	}
	public void modificarPrecioDeVenta(Producto[][] producto) {
		String seleccionUsuario = (String)comboBoxModificar.getSelectedItem();
		int nuevoPrecio =Integer.parseInt(txtValorDeVenta.getText());
		 int cantidad = Integer.parseInt(txtCantidad.getText());
		 int valorInversion = Integer.parseInt(txtValorInversion.getText());
		
		for(int i=0; i<producto.length; i++) {
			for(int j=0; j<producto[i].length; j++) {
				if (seleccionUsuario == producto[i][j].darNombre()) {
					if (nuevoPrecio > producto[i][j].darValorInversion()+(producto[i][j].darValorInversion()*2/100 ) && nuevoPrecio > valorInversion) {
						producto[i][j].modificarValorInversion(valorInversion);
						producto[i][j].aumentarCantidad(cantidad);
						 producto[i][j].modificarValorDeVenta(nuevoPrecio);
					}else {
						JOptionPane.showMessageDialog(null, "El valor que desea cambiar no cumple con los requisitos", "warning", JOptionPane.WARNING_MESSAGE);
					}
					
				}
			}
		}
	}
	public void ventasRealizadas(Producto[][] producto) {
		 String seleccionUsuario = (String)comboBoxVender.getSelectedItem();
		 int cantidadVendida = Integer.parseInt(txtCantidadVendida.getText());
		 
		 for(int i=0; i<producto.length; i++) {
				for(int j=0; j<producto[i].length; j++) {
					if (seleccionUsuario == producto[i][j].darNombre()) {
						if (producto[i][j].darCantidad() > 0 && producto[i][j].darCantidad() > cantidadVendida  ) {
							producto[i][j].disminuirCantidad(cantidadVendida);
							principal.modificarNumeroVentas(producto,i,j,cantidadVendida);
						}else {
							JOptionPane.showMessageDialog(null, "No tiene suficientes productos", "warning", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
	}

}
