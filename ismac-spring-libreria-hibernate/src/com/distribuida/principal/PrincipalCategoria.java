package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO=context.getBean("categoriaDAOimpl", CategoriaDAO.class);
		
		
		//ADD
				Categoria categoria= new Categoria (0, "categoria1", "libro de prueba");
				//categoriaDAO.add(categoria);
				
				
				
				
				
		//////////UP
				
				Categoria categoria2= new Categoria (77, "categoria11", "libro de prueba prueba");
				categoriaDAO.add(categoria2);
				
	//////////////DEL
					
				//categoriaDAO.del(72);
		
		
		//findAll
		
				List<Categoria> categorias = categoriaDAO.findAll();
				
				for (Categoria item : categorias) {
						System.out.println(item.toString());
				}
				
				
				
				
				
				
				
				
				
				
				
			///////findOne
				
				//Categoria categoria1 = categoriaDAO.findOne(1);
				//System.out.println(categoria1.toString());
					
				
				
				
		
		context.close();
		
		

	}

}
