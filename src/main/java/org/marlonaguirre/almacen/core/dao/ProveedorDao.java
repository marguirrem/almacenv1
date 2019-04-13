
package org.marlonaguirre.almacen.core.dao;

import java.util.List;
import org.marlonaguirre.almacen.core.model.Proveedor;


public interface ProveedorDao {
 
    public List<Proveedor> findAllProveedor();
    public Proveedor findById(Long codigoProveedor);
    public void saveProveedor(Proveedor elemento);
    public void deleteProveedor(Proveedor elemento);
    public void updateProveedor(Proveedor elemento);
    
}
