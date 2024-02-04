package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService =context.getBean("clienteServiceImpl", ClienteService.class);
		
		
		//add
		
		clienteService.add(0,"01020304059090", "JeffersonGGG", "GutierritosSSSS","Quito","0987654321","jgutierritos@correo.com");
		
		
		//UP
		//clienteService.up(43,"01020304058", "Jefferson8", "Gutierritos8","Quito","0987654321","jgutierritos@correo.com");
		
		//clienteService.del(42);
		
		
		//FindAll
		
		List<Cliente> clientes =clienteService.findAll();
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
		}
		
		//findOne
		
		//Cliente cliente = clienteService.findOne(1);
		
		//System.out.println(cliente.toString());
		
		context .close();

	}
	
}
