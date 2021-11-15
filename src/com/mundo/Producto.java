package com.mundo;

public  class Producto {
		protected int valorInversion;
		protected int valorVenta;
		protected int cantidad;
		protected int codigo;
		protected String nombre;
		
		public Producto (String nombre, int valorInversion, int valorVenta, int cantidad, int codigo) {
			this.nombre = nombre;
			this.valorInversion = valorInversion;
			this.valorVenta = valorVenta;
			this.cantidad = cantidad;
			this.codigo = codigo;
		}
		public void modificarValorDeVenta(int nuevoValorDeVenta) {
			this.valorVenta = nuevoValorDeVenta;
		}
		public  int darValorVenta() {
			return valorVenta;
		}
		public  int darCantidad() {
			return cantidad;
		}
		public int darValorInversion() {
			return valorInversion;
		}
		public String darNombre() {
			return nombre;
		}
		public void aumentarCantidad(int nuevaCantidad) {
			this.cantidad += nuevaCantidad;
		}
		public void disminuirCantidad(int ventaCantidad) {
			this.cantidad -= ventaCantidad;
		}
		public void modificarValorInversion(int nuevoValor) {
			this.valorInversion = nuevoValor;
		}
}
