package org.marlonaguirre.almacen.core.dao;

import java.util.List;
import org.marlonaguirre.almacen.core.db.Conexion;
import org.marlonaguirre.almacen.core.model.Factura;

public class FacturaDaoImpl implements FacturaDao {

    @Override
    public List<Factura> findAllFactura() {
        return (List<Factura>)Conexion.getInstancia().findAll(Factura.class);
    }

    @Override
    public Factura findById(Long idCompra) {
        return (Factura) Conexion.getInstancia().findById(Factura.class, idCompra);
    }

    @Override
    public void saveFactura(Factura elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteFactura(Factura elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateFactura(Factura elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
