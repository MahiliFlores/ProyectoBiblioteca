package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Libros;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {
	private List<Libros> lista = new ArrayList<Libros>();
	

	//Validacion para verificar que el titulo no se repita 
	@Override
	public void guardar(Libros libro) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for (Libros l: lista) {
			if(l.getTitulo().equals(libro.getTitulo())){
				System.out.println("Ese libro ya existe");
				bandera = true;
				break;
				
			}
		}
		
		if (!bandera) {
			lista.add(libro);
		    System.out.println("Guardado correctamente");
		    
		}
	}

	@Override
	public List<Libros> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Libros buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Libros libro) {
		// TODO Auto-generated method stub
		lista.set(indice, libro);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}
	
	@Override
	public void buscartitulo (String titulo) {
		// TODO Auto-generated method stub
		//lista.get(titulo);
		for (Libros l: lista) {
			
		}
	
}
	
	@Override
	public void buscarautor (String autor) {
		// TODO Auto-generated method stub
		lista.get(titulo);
	

}
	
	@Override
	public void editarprecio ( String titulo, Libros libro) {
		int precio;
		// TODO Auto-generated method stub
		lista.set(precio, libro);
		
	
}



	@Override
	public void eliminartitulo() {
		// TODO Auto-generated method stub
		lista.remove(titulo);
		
	}
}