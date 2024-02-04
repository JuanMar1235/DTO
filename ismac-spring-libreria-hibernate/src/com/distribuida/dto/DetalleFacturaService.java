package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public interface DetalleFacturaService {
	public List<DetalleFactura> findAll();

	public DetalleFactura findOne (int id);
	
	public void add(int idDetalleFactura, int cantidad, Double subTotal, int idFactura, int idLibro);
	
	public void up(int idDetalleFactura, int cantidad, Double subTotal, int idFactura, int idLibro);
	
	public void del(int id);

	

	

}
