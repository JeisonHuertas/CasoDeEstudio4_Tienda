package com.interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mundo.CDecoracion;
import com.mundo.CElectrodomesticos;
import com.mundo.CTecnologia;
import com.mundo.Producto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aplicacion extends JFrame {

	private JPanel contentPane;
	private Electrodomesticos electrodomesticos;
	private Tecnologia tecnologia;
	private Decoracion decoracion;
	private Modificar modificar;
	private Totales totales;
	//constante => tamaño del arreglo
	private int NUMERO_PRODUCTOS = 3;
	//Arreglos
	private Producto[] arrayTec;
	private Producto[] arrayDeco;
	private Producto[] arrayElect;
	private Producto[][] productos;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion frame = new Aplicacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aplicacion() {
		
		arrayTec = new CTecnologia[NUMERO_PRODUCTOS ];
		arrayDeco = new CDecoracion[NUMERO_PRODUCTOS ];
		arrayElect = new CElectrodomesticos[NUMERO_PRODUCTOS ];
		productos = new Producto[NUMERO_PRODUCTOS][];

		arrayTec[0] = new CTecnologia("Televisores",0,0,0,110);
		arrayTec[1] = new CTecnologia("Telefonos",0,0,0,111);
		arrayTec[2] = new CTecnologia("Celulares",0,0,0,112);
		
		arrayDeco[0] = new CDecoracion("Cuadros",0,0,0,113);
		arrayDeco[1] = new CDecoracion("Mesas",0,0,0,114);
		arrayDeco[2] = new CDecoracion("Relojes",0,0,0,115);
		
		arrayElect[0] = new CElectrodomesticos("Estufas",0,0,0,116);
		arrayElect[1] = new CElectrodomesticos("Neveras",0,0,0,117);
		arrayElect[2] = new CElectrodomesticos("Lavadoras",0,0,0,118);
		
		productos[0] = arrayTec;
		productos[1] = arrayDeco;
		productos[2]= arrayElect;
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelOpciones = new JPanel();
		panelOpciones.setLayout(null);
		panelOpciones.setBackground(new Color(0, 102, 204));
		panelOpciones.setBounds(0, 0, 284, 543);
		contentPane.add(panelOpciones);
		
		electrodomesticos = new Electrodomesticos();
		electrodomesticos.setBounds(282, 0, 746, 543);
		contentPane.add(electrodomesticos);
		
		//Instancias de los paneles
		
		tecnologia = new Tecnologia();
		decoracion = new Decoracion();
		modificar = new Modificar(this);
		totales = new Totales(this);
		
		JLabel lblTienda = new JLabel("Tienda");
		lblTienda.setHorizontalAlignment(SwingConstants.CENTER);
		lblTienda.setForeground(Color.WHITE);
		lblTienda.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblTienda.setBackground(Color.WHITE);
		lblTienda.setBounds(61, 63, 162, 28);
		panelOpciones.add(lblTienda);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(61, 102, 162, 4);
		panelOpciones.add(lblNewLabel_1);
		
		JButton btnElectrodomesticos = new JButton("Electrodom\u00E9sticos");
		btnElectrodomesticos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tecnologia.setVisible(false);
				decoracion.setVisible(false);
				modificar.setVisible(false);
				totales.setVisible(false);
				electrodomesticos.setVisible(true);
				electrodomesticos.setBounds(282, 0, 746, 543);
				contentPane.add(electrodomesticos);
			}
		});
		btnElectrodomesticos.setForeground(Color.WHITE);
		btnElectrodomesticos.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnElectrodomesticos.setFocusable(false);
		btnElectrodomesticos.setBorder(null);
		btnElectrodomesticos.setBackground(new Color(0, 102, 204));
		btnElectrodomesticos.setBounds(0, 124, 284, 56);
		panelOpciones.add(btnElectrodomesticos);
		
		JButton btnTecnologia = new JButton("Tecnolog\u00EDa");
		btnTecnologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				electrodomesticos.setVisible(false);
				decoracion.setVisible(false);
				modificar.setVisible(false);
				totales.setVisible(false);
				tecnologia.setVisible(true);
				tecnologia.setBounds(282, 0, 746, 543);
				contentPane.add(tecnologia);
			}
		});
		btnTecnologia.setForeground(Color.WHITE);
		btnTecnologia.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnTecnologia.setFocusable(false);
		btnTecnologia.setBorder(null);
		btnTecnologia.setBackground(new Color(0, 102, 204));
		btnTecnologia.setBounds(0, 198, 284, 56);
		panelOpciones.add(btnTecnologia);
		
		JButton btnDecoracion = new JButton("Decoraci\u00F3n");
		btnDecoracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				electrodomesticos.setVisible(false);
				tecnologia.setVisible(false);
				modificar.setVisible(false);
				totales.setVisible(false);
				decoracion.setVisible(true);
				decoracion.setBounds(282, 0, 746, 543);
				contentPane.add(decoracion);
			}
		});
		btnDecoracion.setForeground(Color.WHITE);
		btnDecoracion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnDecoracion.setFocusable(false);
		btnDecoracion.setBorder(null);
		btnDecoracion.setBackground(new Color(0, 102, 204));
		btnDecoracion.setBounds(0, 278, 284, 56);
		panelOpciones.add(btnDecoracion);
		
		JButton btnModificacion = new JButton("Modificaci\u00F3n");
		btnModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				electrodomesticos.setVisible(false);
				tecnologia.setVisible(false);
				decoracion.setVisible(false);
				totales.setVisible(false);
				modificar.setVisible(true);
				modificar.setBounds(282, 0, 746, 543);
				contentPane.add(modificar);
			}
		});
		btnModificacion.setForeground(Color.WHITE);
		btnModificacion.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnModificacion.setFocusable(false);
		btnModificacion.setBorder(null);
		btnModificacion.setBackground(new Color(0, 102, 204));
		btnModificacion.setBounds(0, 355, 284, 56);
		panelOpciones.add(btnModificacion);
		
		JButton btnTotales = new JButton("Totales");
		btnTotales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				electrodomesticos.setVisible(false);
				tecnologia.setVisible(false);
				decoracion.setVisible(false);
				modificar.setVisible(false);
				totales.setVisible(true);
				totales.setBounds(282, 0, 746, 543);
				contentPane.add(totales);
			}
		});
		btnTotales.setForeground(Color.WHITE);
		btnTotales.setFont(new Font("Arial Black", Font.PLAIN, 15));
		btnTotales.setFocusable(false);
		btnTotales.setBorder(null);
		btnTotales.setBackground(new Color(0, 102, 204));
		btnTotales.setBounds(0, 427, 284, 56);
		panelOpciones.add(btnTotales);
		
		actualizar();
	}
	
	public Producto[][] darProductos() {
		return productos;
	}
	public void actualizar() {
		tecnologia.actualizar(arrayTec);
		electrodomesticos.actualizar(arrayElect);
		decoracion.actualizar(arrayDeco);
		totales.actualizar();
	}
	public void calcularInversionTotal( int cantidadAgregada, String seleccion) {
		totales.modificarInversionTotal(productos, cantidadAgregada, seleccion);
	}
	public void modificarNumeroVentas (Producto[][] productos,int i,int j,int cantidadVendida ) {
		totales.modificarNumeroVentas(cantidadVendida);
		totales.totalVentas(productos, i, j, cantidadVendida);
	}
	
}
