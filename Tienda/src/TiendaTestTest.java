import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TiendaTestTest {
	
	@Parameters
	
	public static Iterable<Object[]> getData() {
		List<Object[]> listaProductos = new ArrayList();
		listaProductos.add(new Object[] {"zanahoria", "zanahoria"});
		listaProductos.add(new Object[] {"sandia", "sandia"});
		listaProductos.add(new Object[] {"turron", "turron"});
		listaProductos.add(new Object[] {"chuches", "chuches"});
		return listaProductos;
	}
	
	private String producto,esperado;
	
	public TiendaTestTest(String producto , String esperado) {	
		this.producto = producto;
		this.esperado = esperado;
	}
	
	@Test
	public void testAñadirProducto() throws InterruptedException {
		System.out.println("test3()");
		Tienda tienda = new Tienda();
		String esperado = "";
		String resultado = "";
		assertEquals(esperado, resultado);
	}

}
