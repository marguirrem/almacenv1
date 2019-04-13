package org.marlonaguirre.almacen.core.dao;

import java.util.List;
import org.marlonaguirre.almacen.core.db.Conexion;
import org.marlonaguirre.almacen.core.model.Proveedor;

public class ProveedorDaoImpl implements ProveedorDao{

    @Override
    public List<Proveedor> findAllProveedor() {
        return (List<Proveedor>) Conexion.getInstancia().findAll(Proveedor.class);
    }

    @Override
    public Proveedor findById(Long codigoProveedor) {
        return (Proveedor) Conexion.getInstancia().findById(Proveedor.class, codigoProveedor);
    }

    @Override
    public void saveProveedor(Proveedor elemento) {
        Conexion.getInstancia().save(elemento);
    }

    @Override
    public void deleteProveedor(Proveedor elemento) {
        Conexion.getInstancia().delete(elemento);
    }

    @Override
    public void updateProveedor(Proveedor elemento) {
        Conexion.getInstancia().update(elemento);
    }
    
}
