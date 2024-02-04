package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaService categoriaService=context.getBean("categoriaServiceImpl", CategoriaService.class);
		
		
		//ADD
				
				categoriaService.add(0, "Programacion", "Distribuida");
				
		//////////UP
				//categoriaService.up(81, "Programacion", "Distribuida");
		
				
	//////////////DEL
					
				//categoriaService.del(72);
		
		
		//findAll
		
				List<Categoria> categorias = categoriaService.findAll();
				
				for (Categoria item : categorias) {
						System.out.println(item.toString());
				}
				
				
								
			///////findOne
				
				//Categoria categoria1 = categoriaService.findOne(1);
				//System.out.println(categoria1.toString());
					
				
				
				
		
		context.close();
		
		

	}

}
