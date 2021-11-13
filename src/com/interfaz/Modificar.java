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
		this.principal = principal;
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
				modificarPrecioDeVenta(principal.darTecnologia(), principal.darDecoracion(), principal.darElectrodomesticos());
				principal.totales.modificarInversionTotal(principal.darTecnologia(), principal.darDecoracion(), principal.darElectrodomesticos());
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
				ventasRealizadas(principal.darTecnologia(), principal.darDecoracion(), principal.darElectrodomesticos());
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
	public void modificarPrecioDeVenta(CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect) {
		String seleccionUsuario = (String)comboBoxModificar.getSelectedItem();
		int nuevoPrecio =Integer.parseInt(txtValorDeVenta.getText());
		
		
		if(seleccionUsuario == "Neveras") {
			modificar(nuevoPrecio,"Electrodomesticos",1,arrayTec,arrayDeco,arrayElect);
		}else if(seleccionUsuario == "Lavadoras") {
			modificar(nuevoPrecio,"Electrodomesticos",2,arrayTec,arrayDeco,arrayElect);			
		}else if(seleccionUsuario == "Estufas") {
			modificar(nuevoPrecio,"Electrodomesticos",0,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Televisores") {
			modificar(nuevoPrecio,"Tecnologia",0,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Telefonos") {
			modificar(nuevoPrecio,"Tecnologia",1,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Celulares") {
			modificar(nuevoPrecio,"Tecnologia",2,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Cuadros") {
			modificar(nuevoPrecio,"Decoracion",0,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Mesas") {
			modificar(nuevoPrecio,"Decoracion",1,arrayTec,arrayDeco,arrayElect);		
		}else if(seleccionUsuario == "Relojes") {
			modificar(nuevoPrecio,"Decoracion",2,arrayTec,arrayDeco,arrayElect);
		}
	}
	 public void modificar(int precio,String clase,int producto,CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect ) {
		 int cantidad = Integer.parseInt(txtCantidad.getText());
		 int valorInversion = Integer.parseInt(txtValorInversion.getText());
		 if (precio < precioMinimo(producto,clase, arrayTec, arrayDeco, arrayElect)) {
			 JOptionPane.showMessageDialog(null, "El valor que desea cambiar no cumple con los requisitos", "warning", JOptionPane.WARNING_MESSAGE);
		 }else {
			 if(clase == "Electrodomesticos") {
				 arrayElect[producto].modificarValorInversion(valorInversion);
				 if (precio < precioMinimo(producto,clase, arrayTec, arrayDeco, arrayElect)) {
					 JOptionPane.showMessageDialog(null, "El valor que desea cambiar no cumple con los requisitos", "warning", JOptionPane.WARNING_MESSAGE);
				 }
				 arrayElect[producto].aumentarCantidad(cantidad);
				 arrayElect[producto].modificarValorDeVenta(precio);
			 }else if(clase == "Decoracion") {
				 arrayDeco[producto].modificarValorInversion(valorInversion);
				 if (precio < precioMinimo(producto,clase, arrayTec, arrayDeco, arrayElect)) {
					 JOptionPane.showMessageDialog(null, "El valor que desea cambiar no cumple con los requisitos", "warning", JOptionPane.WARNING_MESSAGE);
				 }
				 arrayDeco[producto].aumentarCantidad(cantidad);
				 arrayDeco[producto].modificarValorDeVenta(precio);
			 }else if(clase == "Tecnologia") {
				 arrayTec[producto].modificarValorInversion(valorInversion);
				 if (precio < precioMinimo(producto,clase, arrayTec, arrayDeco, arrayElect)) {
					 JOptionPane.showMessageDialog(null, "El valor que desea cambiar no cumple con los requisitos", "warning", JOptionPane.WARNING_MESSAGE);
				 }
				 arrayTec[producto].aumentarCantidad(cantidad);
				 arrayTec[producto].modificarValorDeVenta(precio);
			 }
		 }
		 
	 }
	 public int precioMinimo(int producto,String clase,CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect) {
		 int precioMin = 0;
		 if(clase == "Electrodomesticos") {
			 precioMin = arrayElect[producto].darValorInversion()+(arrayElect[producto].darValorInversion()*2/100);
		 }else if(clase == "Decoracion") {
			 precioMin = arrayDeco[producto].darValorInversion()+(arrayElect[producto].darValorInversion()*2/100);
		 }else if(clase == "Tecnologia") {
			 precioMin = arrayTec[producto].darValorInversion()+(arrayElect[producto].darValorInversion()*2/100);
		 }
		 return precioMin;
	 }
	 public void ventasRealizadas(CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect) {
		 String seleccionUsuario = (String)comboBoxVender.getSelectedItem();
		 int cantidadVendida = Integer.parseInt(txtCantidadVendida.getText());
		 if(seleccionUsuario == "Neveras") {
				modificarCantidad("Electrodomesticos",1,arrayTec,arrayDeco,arrayElect);
				principal.totales.totalVentas("Electrodomesticos", 1, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Lavadoras") {
				modificarCantidad("Electrodomesticos",2,arrayTec,arrayDeco,arrayElect);
				principal.totales.totalVentas("Electrodomesticos", 2, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Estufas") {
				modificarCantidad("Electrodomesticos",0,arrayTec,arrayDeco,arrayElect);
				principal.totales.totalVentas("Electrodomesticos", 0, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Televisores") {
				modificarCantidad("Tecnologia",0,arrayTec,arrayDeco,arrayElect);		
				principal.totales.totalVentas("Tecnologia", 0, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Telefonos") {
				modificarCantidad("Tecnologia",1,arrayTec,arrayDeco,arrayElect);		
				principal.totales.totalVentas("Tecnologia", 1, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Celulares") {
				modificarCantidad("Tecnologia",2,arrayTec,arrayDeco,arrayElect);		
				principal.totales.totalVentas("Tecnologia", 2, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Cuadros") {
				modificarCantidad("Decoracion",0,arrayTec,arrayDeco,arrayElect);		
				principal.totales.totalVentas("Decoracion", 0, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Mesas") {
				modificarCantidad("Decoracion",1,arrayTec,arrayDeco,arrayElect);	
				principal.totales.totalVentas("Decoracion", 1, cantidadVendida, arrayTec, arrayDeco, arrayElect);
			}else if(seleccionUsuario == "Relojes") {
				modificarCantidad("Decoracion",2,arrayTec,arrayDeco,arrayElect);
				principal.totales.totalVentas("Decoracion", 2, cantidadVendida, arrayTec, arrayDeco, arrayElect);

			}
		}
	 public void modificarCantidad(String clase,int producto,CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect ) {
		 int cantidadVendida = Integer.parseInt(txtCantidadVendida.getText());
			 if(clase == "Electrodomesticos" && arrayElect[producto].darCantidad() > 0 ) {
				 arrayElect[producto].disminuirCantidad(cantidadVendida);
			 }else if(clase == "Decoracion" && arrayDeco[producto].darCantidad() > 0) {
				 arrayDeco[producto].disminuirCantidad(cantidadVendida);

			 }else if(clase == "Tecnologia" && arrayTec[producto].darCantidad() > 0) {
				 arrayTec[producto].disminuirCantidad(cantidadVendida);
			 }
			 principal.totales.modificarNumeroVentas(cantidadVendida);
		 }
	
}
