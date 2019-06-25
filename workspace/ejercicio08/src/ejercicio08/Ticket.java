package ejercicio08;

public class Ticket {

	int cantidadProductos;
	double monto;
	double montoConDescuento;
	public Ticket()
	{
		this.monto = 0;
		this.cantidadProductos=0;
	}
	
	public void agregarItem(int cantidad, double precioUnitario) {
		this.monto += cantidad * precioUnitario;
		this.cantidadProductos +=1;
	}
	
	public void aplicarDescuento(double porcentaje) {
		
		this.montoConDescuento = this.monto * ((100-porcentaje)/100);
	}
	
	public double calcularSubtotal() {
		return this.montoConDescuento;
	}
	
	public double calcularTotal() {
		return this.monto;
	}
	
	public int contarProductos()
	{
		return this.cantidadProductos;
	}
}
