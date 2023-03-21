package Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaBancariaRico {

	@Test
	void test1() throws Exception {
		CuentaBancaria test = new CuentaBancaria();
		test.agregarSaldo(5000);
		test.solicitarPrestamo(15000);
		assertEquals(15000, test.obtenerPrestamo());
	}
	
	
	@Test
	void test2() throws Exception{  
		CuentaBancaria test = new CuentaBancaria();
		test.agregarSaldo(2000);
		test.solicitarPrestamo(12000);
		assertEquals(6000, test.obtenerPrestamo());
	}
	
	@Test
	void test3(){
		CuentaBancaria test = new CuentaBancaria();
		
		assertThrows(Exception.class, ()->test.solicitarPrestamo(2000));
		assertThrows(Exception.class, ()->test.solicitarPrestamo(4000));
		
	}

}