package Libros;

import java.util.ArrayList;

public class Fichero {

	public static void main(String[] args) {
		ArrayList<Libro>lista=new ArrayList<Libro>();
		
		lista.add(new Libro(12345678, "El Pirata Barba Roja", "JR Walking", 532));
		lista.add(new Libro(98765432, "El Ambulante", "Juan Gaitan", 800));
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
	
		if(lista.get(0).getPaginas()>lista.get(1).getPaginas()){
            System.out.println(lista.get(0).getTitulo()+" tiene más páginas");
        }else{
            System.out.println(lista.get(1).getTitulo()+" tiene más páginas");
        }
        

	}

}
