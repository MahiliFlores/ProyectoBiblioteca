package Interface;
import java.util.List;

import Dominio.Libros;
public interface Metodos2 {
	
	//Definicio de metodos 
	//public void guardar(Libros libro);
	//public List<Libros> mostrar();
    //void  buscarautor (String  autor);
  	//void editarprecio(String titulo, Libros libro);
	//void buscartitulo(String titulo);
	//void eliminartitulo(String titulo);
	//void eliminartitulo();
	
	public Libros buscartitulo(String titulo);
	public List<Libros>buscartitulo(String autor);
	
	
	;
}
