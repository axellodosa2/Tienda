import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TiendaTest {


		
		
	
	static Tienda tienda ;
	
	@BeforeClass
	public static void beforeClass() throws InterruptedException {
		System.out.println("beforeClass()");
		tienda = new Tienda();
	}
	
	
	@Before
	
	public void before() throws InterruptedException {
		System.out.println("before()");
		tienda = new Tienda();
		int numProducto = tienda.numProductos();
	}
	
	@Test
	public void testNumProductos() {
	
		System.out.println("test1()");
		int resultado = tienda.numProductos();
		int esperado = 7;
		assertEquals(esperado, resultado);
	}
	
	@Test(expected = IndexOutOfBoundsException.class) 
		public void vacio() {
			System.out.println("test2()");
			tienda.limpiarTienda();
			
			String producto = tienda.getPrimerProducto();
			
		}
	
	@Test(timeout = 1000) 
		public void timeout() throws InterruptedException {
			System.out.println("timeout()");
			tienda.inicializarProductos();
	}
		
	
	@AfterClass
		
	public static void afterClass() {
		
			System.out.println("afterClass()");
			tienda.limpiarTienda();
	}
		
	
	@After
	public void after() throws InterruptedException {
		System.out.println("after()");
		tienda.limpiarTienda();
		tienda.inicializarProductos();
		
	}
	
	@Test
	public void testAñadirProducto() {
		System.out.println("test3()");
		
		int resultado = tienda.numProductos();
		int esperado = 7;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void tiendaAbierta() {
		System.out.println("test4()");
		
		assertTrue(tienda.getEstado());
		
	}
	

}
