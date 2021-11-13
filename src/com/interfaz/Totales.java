package com.interfaz;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import com.mundo.CDecoracion;
import com.mundo.CElectrodomesticos;
import com.mundo.CTecnologia;

public class Totales extends JPanel {
	private JTextField txtTotalInversionRealizada;
	private JTextField txtNumeroVentas;
	private JTextField txtDineroVentas;
	private Aplicacion principal;
	private int inversionTotal;
	private int numeroVentas;
	private int totalVentas;
	/**
	 * Create the panel.
	 */
	public Totales(Aplicacion principal) {
		this.principal = principal;
		setLayout(null);
		this.inversionTotal = 0;
		this.numeroVentas = 0;
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(173, 216, 230));
		panel_1_1.setBounds(0, 0, 743, 130);
		add(panel_1_1);
		
		JLabel lblTotales = new JLabel("Totales");
		lblTotales.setForeground(Color.WHITE);
		lblTotales.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
		lblTotales.setBounds(307, 43, 122, 46);
		panel_1_1.add(lblTotales);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(560, 11, 122, 108);
		panel_1_1.add(lblNewLabel);
		
		txtTotalInversionRealizada = new JTextField();
		txtTotalInversionRealizada.setEditable(false);
		txtTotalInversionRealizada.setBounds(373, 189, 110, 29);
		add(txtTotalInversionRealizada);
		txtTotalInversionRealizada.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Inversion Realizada");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(222, 190, 117, 26);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total numero de Ventas");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(222, 244, 137, 26);
		add(lblNewLabel_1_1);
		
		txtNumeroVentas = new JTextField();
		txtNumeroVentas.setEditable(false);
		txtNumeroVentas.setColumns(10);
		txtNumeroVentas.setBounds(373, 243, 110, 29);
		add(txtNumeroVentas);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Total dinero de Ventas");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(222, 292, 137, 26);
		add(lblNewLabel_1_1_1);
		
		txtDineroVentas = new JTextField();
		txtDineroVentas.setEditable(false);
		txtDineroVentas.setColumns(10);
		txtDineroVentas.setBounds(373, 291, 110, 29);
		add(txtDineroVentas);
		actualizar();
	}
	public void actualizar() {
		txtTotalInversionRealizada.setText(Integer.toString(inversionTotal));
		txtNumeroVentas.setText(Integer.toString(numeroVentas));
		txtDineroVentas.setText(Integer.toString(totalVentas));
	}
	public void modificarInversionTotal(CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect) {
		int tInversionElectrodomesticos = 0;
		int tInversionDecoracion = 0;
		int tInversionTecnologia = 0;
		for (int i = 0; i<3; i++) {
			tInversionDecoracion += arrayDeco[i].darValorInversion()*arrayDeco[i].darCantidad();
			tInversionTecnologia += arrayTec[i].darValorInversion()*arrayTec[i].darCantidad();
			tInversionElectrodomesticos += arrayElect[i].darValorInversion()*arrayElect[i].darCantidad();
		}
		inversionTotal = tInversionElectrodomesticos + tInversionDecoracion + tInversionTecnologia;
	}
	public void modificarNumeroVentas(int numeroVentas) {
		this.numeroVentas +=  numeroVentas;
	}
	public void totalVentas(String clase,int producto,int cantidadVendida,CTecnologia[] arrayTec, CDecoracion[] arrayDeco, CElectrodomesticos[] arrayElect ) {
		 if(clase == "Electrodomesticos" && arrayElect[producto].darCantidad() > 0 ) {
			 this.totalVentas += cantidadVendida * arrayElect[producto].darValorVenta();
		 }else if(clase == "Decoracion" && arrayDeco[producto].darCantidad() > 0) {
			 this.totalVentas += cantidadVendida * arrayDeco[producto].darValorVenta();
		 }else if(clase == "Tecnologia" && arrayTec[producto].darCantidad() > 0) {
			 this.totalVentas += cantidadVendida * arrayTec[producto].darValorVenta();
		 }
	}
}
