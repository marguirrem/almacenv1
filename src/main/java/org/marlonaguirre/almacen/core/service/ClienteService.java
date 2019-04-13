package org.marlonaguirre.almacen.core.service;

import java.util.List;
import org.marlonaguirre.almacen.core.model.Cliente;

public interface ClienteService {
    public List<Cliente> findAllCliente();
    public Cliente findById(String nit);
    public void saveCliente(Cliente elemento);
    public void deleteCliente(Cliente elemento);
    public void updateCliente(Cliente elemento);
}
