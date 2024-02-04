package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dto.ClienteService;
import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaService facturaService =context.getBean("facturaServiceImpl", FacturaService.class);
		//ClienteService clienteService =context.getBean("clienteServiceImpl", ClienteService.class);
		
		//CRU
		
		//ADD
	//	Cliente cliente =clienteService.findOne(1);
		
		facturaService.add(0, "fac-00099",new Date(), 22.22,2.30,25.23, 1);
		
		
//////////UP
		//Cliente cliente2 =clienteService.findOne(2);
		
		//facturaService.up(87, "fac-00098",new Date(), 23.22,2.44,25.666 , 1);
		
		
		//BORRADO
		//facturaService.del(86);
		
		//FindAll
		
		List<Factura> facturas =facturaService.findAll();
		
		for (Factura item : facturas) {
			
			System.out.println(item);
		}
		
		
		// findOne
		
				//Factura factura = facturaDAO.findOne(1);
				//System.out.println(factura.toString());
		context.close();
		
		
		

	}

}
