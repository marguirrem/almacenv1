package org.marlonaguirre.almacen.core.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="factura")
public class Factura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="numero_factura")
    private Long idCompra;
    
    @Column(name="nit")
    private String nit;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="total")
    private Double Total;

    public Factura() {
    }

    public Factura(Long idCompra, String nit, Date fecha, Double Total) {
        this.idCompra = idCompra;
        this.nit = nit;
        this.fecha = fecha;
        this.Total = Total;
    }

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
    
    
}
