	package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.DetalleFacturaDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

	@Autowired
	
	private DetalleFacturaDAO detallefacturaDAO;
	@Autowired
	private FacturaDAO facturaDAO;
	@Autowired
	private LibroDAO libroDAO;
	
	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return detallefacturaDAO.findAll();
	}

	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
		return detallefacturaDAO.findOne(id);
	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		detallefacturaDAO.del(id);

	}

	public void add(int idDetalleFactura, int cantidad, Double subTotal, int idFactura , int idLibro) {
		// TODO Auto-generated method stub
		
		Factura factura =facturaDAO.findOne(idFactura);
		Libro libro =libroDAO.findOne(idLibro);
		
		DetalleFactura detalleFactura = new DetalleFactura(idDetalleFactura,  cantidad,  subTotal);
		detalleFactura.setFactura(factura);
		detalleFactura.setLibro(libro);
		detallefacturaDAO.add(detalleFactura);	
	}
	

	public void up(int idDetalleFactura, int cantidad, Double subTotal, int idFactura , int idLibro) {
		// TODO Auto-generated method stub
		
		Factura factura =facturaDAO.findOne(idFactura);
		Libro libro =libroDAO.findOne(idLibro);
		
		DetalleFactura detalleFactura = new DetalleFactura(idDetalleFactura,  cantidad,  subTotal);
		detalleFactura.setFactura(factura);
		detalleFactura.setLibro(libro);
		detallefacturaDAO.up(detalleFactura);
		
	}
	
	public void add(int idDetalleFactura, int cantidad, Double subTotal, Factura factura, Libro libro) {
		// TODO Auto-generated method stub
		
	}

	public void up(int idDetalleFactura, int cantidad, Double subTotal, Factura factura, Libro libro) {
		// TODO Auto-generated method stub
		
	}

}
