package org.marlonaguirre.almacen.core.service;

import java.util.List;
import org.marlonaguirre.almacen.core.dao.ProveedorDao;
import org.marlonaguirre.almacen.core.dao.ProveedorDaoImpl;
import org.marlonaguirre.almacen.core.model.Proveedor;

public class ProveedorServiceImpl implements ProveedorService{
    // interface                            // implementacion de interface
    private ProveedorDao proveedorDao = new ProveedorDaoImpl();
    
    @Override
    public List<Proveedor> findAllProveedor() {
        return proveedorDao.findAllProveedor();
    }

    @Override
    public Proveedor findById(Long codigoProveedor) {
        return proveedorDao.findById(codigoProveedor);
    }

    @Override
    public void saveProveedor(Proveedor elemento) {
         proveedorDao.saveProveedor(elemento);
    }

    @Override
    public void deleteProveedor(Proveedor elemento) {
        proveedorDao.deleteProveedor(elemento);
    }

    @Override
    public void updateProveedor(Proveedor elemento) {
        proveedorDao.updateProveedor(elemento);
    }
}
