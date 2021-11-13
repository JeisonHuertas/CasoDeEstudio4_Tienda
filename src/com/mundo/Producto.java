package com.mundo;

public abstract class Producto {
		protected int valorInversion;
		protected int valorVenta;
		protected int cantidad;
		protected int codigo;
		
		
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
