package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaRico {

	@Test
	void test() throws Exception {
		CuentaBancaria test = new CuentaBancaria();
		test.agregarSaldo(2000);
		test.solicitarPrestamo(12000);
		assertEquals(6000, test.obtenerPrestamo());
	}

}