
import java.util.ArrayList;

public class Tienda {
	
	
	
	private static final int precio = 2;
	boolean abierto;
	static ArrayList<String> listaProductos;
	
	
	public Tienda() throws InterruptedException {
		listaProductos = new ArrayList<String>();
		inicializarProductos();
		abierto = true;
	}
	
	public void inicializarProductos() throws InterruptedException {
		añadirProducto("patatas");
		añadirProducto("huevos");
		añadirProducto("lechuga");
		añadirProducto("pan");
		añadirProducto("pescado");
		añadirProducto("galletas");
		añadirProducto("donuts");
		

	}
	public boolean getEstado() {
		return abierto;
	}
	
	public String getPrimerProducto(){
		
		return listaProductos.get(0);
	}
	
	public int numProductos() {
		return listaProductos.size();
	}
	
	public int comprarProducto(String producto, int numProductos) {
		return numProductos * precio;
	}
	
	public void robar(String producto) {
		listaProductos.remove(producto);
	}
	
	public void añadirProducto(String producto) throws InterruptedException {
		listaProductos.add(producto);
		Thread.sleep(100);
	}
	
	public void limpiarTienda() {
		listaProductos.clear();
	}
	
	public String buscarProducto(String producto) {
		String contestacion = "No se ha encontrado el producto";
		for (String producto1 : listaProductos) {
			if (producto1.equals(producto)) {
				contestacion = producto;
				break;
			}
			
		}
		return contestacion;
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

