package Main;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.agregarSaldo(8000);
			cb.agregarSaldo(500);
			cb.solicitarPrestamo(10000);
			cb.retirarSaldo(1500);
			cb.agregarSaldo(500);
			cb.solicitarPrestamo(4000);
			cb.obtenerPrestamo();//debe retornar 450
		} catch (Exception e) {
		}
	}

}
