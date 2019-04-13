package org.marlonaguirre.almacen.core.dao;

import java.util.List;
import org.marlonaguirre.almacen.core.model.Cliente;
import org.marlonaguirre.almacen.core.db.Conexion;

public class ClienteDaoImpl implements ClienteDao{

    @Override
    public List<Cliente> findAllCliente() {
        return (List<Cliente>)Conexion.getInstancia().findAll(Cliente.class);
    }

    @Override
    public Cliente findById(String nit) {
        return (Cliente) Conexion.getInstancia().findById(Cliente.class, nit);
    }

    @Override
    public void saveCliente(Cliente elemento) {
        Conexion.getInstancia().save(Cliente.class);
    }

    @Override
    public void deleteCliente(Cliente elemento) {
        Conexion.getInstancia().delete(Cliente.class);
    }

    @Override
    public void updateCliente(Cliente elemento) {
        Conexion.getInstancia().update(Cliente.class);
    }
    
}
