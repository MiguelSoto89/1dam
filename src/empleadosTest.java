import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class empleadosTest {
	
	private empleados emp1;
	private int resultado;
	private String resMay;
	
	@Before
	public void creaEmpleado() {
		emp1 = new empleados(1, "a", "a", "a", 6);
	}
	
	@After
	public void borracadena() {
		emp1 = null;
	}

	@Test
	public void testNombre() {
		resultado = emp1.numero_elementos(emp1.getNombre());
		assertEquals(resultado, 1);
	}
	
	@Test
	public void testApellido() {
		resMay = emp1.cad_mayus(emp1.getApp());
		assertEquals(resMay, "A");
	}
	
	@Test
	public void testID() {
		resultado = emp1.IDxCinco(emp1.getID());
		assertEquals(resultado, 5);
	}
	
}
