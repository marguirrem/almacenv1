
package org.marlonaguirre.almacen.core.dao;

import java.util.List;
import org.marlonaguirre.almacen.core.model.Cliente;

public interface ClienteDao {
    public List<Cliente> findAllCliente();
    public Cliente findById(String nit);
    public void saveCliente(Cliente elemento);
    public void deleteCliente(Cliente elemento);
    public void updateCliente(Cliente elemento);
}
