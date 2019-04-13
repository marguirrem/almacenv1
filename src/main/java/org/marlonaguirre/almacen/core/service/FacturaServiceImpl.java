package org.marlonaguirre.almacen.core.service;

import java.util.List;
import org.marlonaguirre.almacen.core.dao.FacturaDao;
import org.marlonaguirre.almacen.core.dao.FacturaDaoImpl;
import org.marlonaguirre.almacen.core.model.Factura;

public class FacturaServiceImpl implements FacturaService {

    private FacturaDao facturadao = new FacturaDaoImpl();
    
    @Override
    public List<Factura> findAllFactura() {
        return facturadao.findAllFactura();
    }

    @Override
    public Factura findById(Long idCompra) {
        return facturadao.findById(idCompra);
    }

    @Override
    public void saveFactura(Factura elemento) {
        facturadao.saveFactura(elemento);
    }

    @Override
    public void deleteFactura(Factura elemento) {
        facturadao.deleteFactura(elemento);
    }

    @Override
    public void updateFactura(Factura elemento) {
        facturadao.updateFactura(elemento);
    }
    
}
