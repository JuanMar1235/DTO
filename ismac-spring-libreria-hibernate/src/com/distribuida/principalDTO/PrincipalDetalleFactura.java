package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.DetalleFacturaService;
import com.distribuida.dto.FacturaService;
import com.distribuida.dto.LibroService;


import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class PrincipalDetalleFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DetalleFactura detallefacturaService =context.getBean("detallefcturaServiceImpl", DetalleFactura.class);
		
		//CRU
		
		//ADD

		detallefacturaService.add(0, 3, 22.22,1,1);
		
		
//////////UP
		
		//detallefacturaService.up(86, 3, 22.22,1,1);
		
		
		//BORRADO
		//detallefacturaService.del(86);
		
		//FindAll
		
		List<DetalleFactura> detallefacturas = detallefacturaService.findAll();
		
		for (DetalleFactura item : detallefacturas) {
			
			System.out.println(item);
		}
		
		
		// findOne
		
				//DetalleFactura detallefactura = detallefacturaService.findOne(1);
				//System.out.println(detallefactura.toString());
		context.close();
		
		
		

	}

}
