package Main;

import java.util.Scanner;

import Dominio.Libros;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner lectura = null; //para lectura de datos
		
		//Pedir al usuario que ingrece los datos de los atributos
		String titulo = null;
	    int anioPubli;
	    String autor;
		int numPag,menuPrin, indice;
	    float precio;
	    
	    Libros libro;
	    
	    LogicaMetodos imp = new LogicaMetodos(); //Instancia de clase 
	    
	    //Creacion de do para realizar menu
	    do {
	    	System.out.println("MENU PRINCIPAL");
	    	System.out.println("1- Alta");
	    	System.out.println("2- Mostrar");
	    	System.out.println("3- Buscar");
	    	System.out.println("4- Editar");
	    	System.out.println("5- Eliminar");
	    	System.out.println("6- Buscar por titulo");
	    	System.out.println("7- Buscar por autor");
	    	System.out.println("8- Editar precio buscando por titulo");
	    	System.out.println("9- Eliminar por titulo");
	    	System.out.println("10- Salir");
	    	lectura = new Scanner(System.in);
	    	menuPrin = lectura.nextInt();
	    	
	    	switch (menuPrin) {
	    	case 1:
	    		try {
	    			System.out.println("Ingrese el titulo: ");
	    			lectura = new Scanner(System.in);
	    			titulo = lectura.nextLine();
	    			
	    			System.out.println("Ingrese el año de publicacion: ");
	    			lectura = new Scanner(System.in);
	    			anioPubli = lectura.nextInt();
	    			
	    			System.out.println("Ingrese el nombre del autor: ");
	    			lectura = new Scanner(System.in);
	    			autor = lectura.nextLine();
	    			
	    			System.out.println("Ingrese el numero de páginas: ");
	    			lectura = new Scanner(System.in);
	    			numPag = lectura.nextInt();
	    			
	    			System.out.println("Ingrese el precio: ");
	    			lectura = new Scanner(System.in);
	    			precio = lectura.nextFloat();
	    			
	    			//Creacion del objeto 
	    			libro = new Libros (titulo, anioPubli, autor, numPag, precio);
	    			
	    			//Agregar a la lista
	    			imp.guardar(libro);
	    			
	    		}catch(Exception e) {
	    			
	    			System.out.println("Error al guardar registro" + e.getMessage());
	    			
	    		}
	    			    		
	    		break;
	    		
	    		
	    	case 2:
	    		//System.out.println(imp.mostrar()); //El valor de retorno se puede manipular para mostrar un mensaje de que no hay registros en la lista 
	    		if(imp.mostrar().size()>0) //Para saber si hay registros en la lista se utiliza esta funcion donde si tmaño es mayor a 0
	    		System.out.println(imp.mostrar()); //Es porque hay registros y se muestran los datos
	    		
	    		else 
	    			System.out.println("No hay registros"); //Sino hay registros se muestra el mensaje 
	    		
	    		break;
	    		
	    		
	    		
	    	case 3:
	    		
	    		try {
	    		System.out.println("Ingrese el numero de indice a buscar: ");
	    		lectura = new Scanner(System.in);
	    		indice = lectura.nextInt();
	    		
	    		//Busqueda
	    		libro = imp.buscar(indice);
	    		System.out.println("Se encontró el indice:  "+libro);
	    		} catch (Exception e) {
	    		
	    		System.out.println("No se encontro el indice buscado");
	    		
	    		}break;
	    		
	    		
	    		
	    	    case 4:
	    	    	try {
	    	    		System.out.println("Ingrese el indice del libro a editar: ");
	    	    		lectura = new Scanner(System.in);
	    	    		indice = lectura.nextInt();
	    	    		
	    	    		//Buscar para editat
	    	    		libro = imp.buscar(indice);
	    	    		System.out.println("Se encontro " + libro.getTitulo()); //Muestra solo el titulo del libro
						
	    	    		
	    	    		//Edita autor
	    	    		System.out.println("Ingrese el nuevo nombre de autor:");
	    	    		lectura = new Scanner(System.in);
	    	    		autor = lectura.nextLine();
	    	    		
	    	    		//Actualiza el objeto
	    	    		libro.setAutor(autor);
	    	    		
	    	    		//Actualiza en la lista el dato 
	    	    		imp.editar(indice, libro);
	    	    		System.out.println("Se editó correctamente");
					} catch (Exception e) {
						// TODO: handle exception
						
						System.out.println("El indice ingresado no existe");
						
					}
	    		break;
	    		
	    	case 5:
	    		try {
	    			
	    			System.out.println("Ingrese el indice a eliminar: ");
	    			lectura = new Scanner(System.in);
	    			indice = lectura.nextInt();
	    			
	    			//Eliminacion
	    			imp.eliminar(indice);
	    			System.out.println("Se ha eliminado correctamente");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("El indice ingresado no existe");
				}
	    		break;
	    		
	    	case 6:
	    		try {
	    			System.out.println("Ingrese el titulo del libro a buscar: ");
	    			lectura = new Scanner(System.in);
	    			titulo = lectura.nextLine();
	    			
	    			//Realizacion de busqueda
	    			libro = imp.buscartitulo(titulo);
		    		System.out.println("Se encontró el titulo:  "+libro);
		    		} catch (Exception e) {
		    		
		    		System.out.println("No se encontro el indice buscado");
					
								}
	    		break;
	    		
	    	case 7:
	    		try {
	    			
	    			System.out.println("Ingrese el autor del libro a buscar: ");
	    			lectura = new Scanner(System.in);
	    			autor = lectura.nextLine();
	    			
	    			//Realizacion de busqueda
	    			libro = imp.buscartitulo(titulo);
	    			System.out.println("Se encontró el autor: "+libro);
	    			
	    			
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No se encontró autor");
					
				}
	    		
	    		break;
	    		
	    		
	    		
	    	case 8:
	    		try {
	    			System.out.println("Ingrese el titulo del precio a editar:");
	    			lectura = new Scanner(System.in);
	    			titulo = lectura.nextLine();
	    			
	    			//Realizacion de busqueda
	    			libro = imp.buscartitulo(titulo);
    	    		System.out.println("Se encontro " + libro.getTitulo());
    	    		
    	    		//editar precio
    	    		System.out.println("Ingrese el nuevo precio del libro:");
    	    		lectura = new Scanner(System.in);
    	    		precio = lectura.nextInt();
    	    		
    	    		//Actualiza el objeto
    	    		libro.setPrecio(precio);
    	    		
    	    		//Actualiza en la lista el dato 
    	    		imp.editarprecio(titulo, libro);
    	    		System.out.println("Se editó correctamente");
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No se encontro el titulo");
					
				}
	    		break;
	    		
	    		
	    	case 9:
	    		try {
	    			
	    			System.out.println("Ingrese el nombre del titulo a eliminar: ");
	    			lectura =new Scanner(System.in);
	    			titulo = lectura.nextLine();
	    			
	    			//Realizacion de eliminacion por titulo
	    			
	    			imp.eliminartitulo(titulo);
	    			System.out.println("Se ha eliminado correctamente");
	    			
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("No se encontro el titulo:");
				}
	    		break;
	    	case 10:
	    		break;
	    		
	    		
	    		    		
	    		
	    	}
	    	
	    	
	    	
	    		    	
	    }while(menuPrin <10);
		
				
	}

}
