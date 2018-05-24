package com.hamp.app.service;

import java.util.List;


import com.hamp.app.models.entity.Cliente;
import com.hamp.app.models.entity.Factura;
import com.hamp.app.models.entity.Producto;

public interface IClienteService {

	public List<Cliente> findAll();

	public void save(Cliente cliente);

	public Cliente findOne(Long id);

	public void delete(Long id);

	public List<Producto> findByNombre(String term);

	public void saveFactura(Factura factura);

	public Producto findProductoById(Long id);

	public Factura findFacturaById(Long id);

	public void deleteFactura(Long id);

	public Factura fetchFacturaByIdWithClienteWhithItemFacturaWithProducto(Long id);

}
