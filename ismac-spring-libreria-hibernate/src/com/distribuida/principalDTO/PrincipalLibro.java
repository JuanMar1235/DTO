package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.AutorService;
import com.distribuida.dto.CategoriaService;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;


public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroService libroService =context.getBean("libroServiceImpl", LibroService.class);
				
		//CRU
		
				//libroService.add(0,"Pinocho8","niles8",2008,"2th","español",new Date(),"ficcion","pasra blanda","768-123456789","5","portada","fisica", 22.22, 1, 1);
				
		/////////UP
				
				
				
				libroService.up(89,"geni","tales",200,"2th","español",new Date(),"cuento","pasta blanda","768-123456789","5","portada","infantil", 40.22,1,1);
				
				//BORRADO
				//libroService.del(88);
				
				
				//FindAll
				List<Libro> libros =libroService.findAll();
				
				for (Libro item : libros) {
					
					System.out.println(item);
				}
				
				
				// findOne
				
						//Libro libro1 = libroService.findOne(1);
						//System.out.println(libro1.toString());
				context.close();
				
				

	}

}
