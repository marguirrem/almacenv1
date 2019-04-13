package org.marlonaguirre.almacen.core.service;

import java.util.List;
import org.marlonaguirre.almacen.core.model.Factura;

public interface FacturaService {
    public List<Factura> findAllFactura();
    public Factura findById(Long idCompra);
    public void saveFactura(Factura elemento);
    public void deleteFactura(Factura elemento);
    public void updateFactura(Factura elemento);
}
