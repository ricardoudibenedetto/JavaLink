package ejercicio05;

public class TarjetaBaja {
 private double saldoInicial;
 private int viajeSubte;
 private int viajeColectivo;
 public TarjetaBaja(double saldoinicial)
 {
	 this.saldoInicial = saldoinicial;
	 this.viajeColectivo = 0;
	 this.viajeSubte = 0;
 }
 
 public double obtenerSaldo() {
	 return this.saldoInicial;
 }
 
 public void cargar(double monto) {
	 this.saldoInicial += monto;
 }
 
 public void pagarViajeEnColectivo() {
	 this.saldoInicial -= 27;
	 this.viajeColectivo += this.contarViajeEnColectivo();
 }
 
 public void pagarViajeEnSubte()
 {
	 this.saldoInicial -= 20;
	 this.viajeSubte += this.contarViajeEnSubte();
 }
 
 public int contarViajes()
 {
	 return this.viajeColectivo + this.viajeSubte;
 }
 public int contarViajeEnColectivo() {
	 return this.viajeColectivo + 1;
 }
 
 public int contarViajeEnSubte()
 {
	 return this.viajeSubte +1;
 }
}
