package com.distribuida.principalDTO;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorService autorService=context.getBean("autorServiceImpl", AutorService.class);
		
		//CRUD
		
		//ADD
		
		autorService.add(0, "Diego", "Maiquez", "Ecuador", "Tumbaco", "telefono1", "correo1");
		
		//////////UP
		
	
		//autorService.up(56, "nombre8", "apellido8", "pais8", "direccion2", "telefono2", "correo2");
		
		
		//////////////DEL
		
		//autorDAO.del(57);
		try {
			System.out.println(">>>>DEL>>>>>"+autorService.findOne(56));}catch(Exception e) {e.printStackTrace();}
		
		//findAll
			
		List<Autor> autores = autorService.findAll();
		
		for (Autor item : autores) {
			System.out.println(item.toString());
		}
		
			
		///////findOne
		
		//Autor autor = autorService.findOne(1);
		//System.out.println(autor.toString());
		
		
		/*List<Autor> autores2 = autorDAO.findAll("pam");
		for(Autor autor3: autores2) {
			System.out.println(autor3.toString());	
		}*/
		
		context.close();

	}
	
}
