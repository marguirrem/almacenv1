/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.marlonaguirre.almacen.core.service;

import java.util.List;
import org.marlonaguirre.almacen.core.dao.ClienteDao;
import org.marlonaguirre.almacen.core.dao.ClienteDaoImpl;
import org.marlonaguirre.almacen.core.model.Cliente;

/**
 *
 * @author marlon
 */
public class ClienteServiceImpl implements ClienteService{

    private ClienteDao clientedao = new ClienteDaoImpl();
    
    @Override
    public List<Cliente> findAllCliente() {
       return clientedao.findAllCliente();
    }

    @Override
    public Cliente findById(String nit) {
        return clientedao.findById(nit);
    }

    @Override
    public void saveCliente(Cliente elemento) {
       clientedao.saveCliente(elemento);
    }

    @Override
    public void deleteCliente(Cliente elemento) {
        clientedao.deleteCliente(elemento);
    }

    @Override
    public void updateCliente(Cliente elemento) {
        clientedao.updateCliente(elemento);
    }
    
}
