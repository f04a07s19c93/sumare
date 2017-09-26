/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.pedidos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Filipe
 */
@Entity
@Table(name = "c_venda", catalog = "projetopizza", schema = "")
@NamedQueries({
    @NamedQuery(name = "CVenda.findAll", query = "SELECT c FROM CVenda c"),
    @NamedQuery(name = "CVenda.findByIdCVenda", query = "SELECT c FROM CVenda c WHERE c.idCVenda = :idCVenda"),
    @NamedQuery(name = "CVenda.findByIdUsuario", query = "SELECT c FROM CVenda c WHERE c.idUsuario = :idUsuario"),
    @NamedQuery(name = "CVenda.findByIdCliente", query = "SELECT c FROM CVenda c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "CVenda.findByDataCVenda", query = "SELECT c FROM CVenda c WHERE c.dataCVenda = :dataCVenda"),
    @NamedQuery(name = "CVenda.findByHora", query = "SELECT c FROM CVenda c WHERE c.hora = :hora"),
    @NamedQuery(name = "CVenda.findByIdStatusVenda", query = "SELECT c FROM CVenda c WHERE c.idStatusVenda = :idStatusVenda"),
    @NamedQuery(name = "CVenda.findBySubtotal", query = "SELECT c FROM CVenda c WHERE c.subtotal = :subtotal"),
    @NamedQuery(name = "CVenda.findByDesconto", query = "SELECT c FROM CVenda c WHERE c.desconto = :desconto"),
    @NamedQuery(name = "CVenda.findByTotalGeral", query = "SELECT c FROM CVenda c WHERE c.totalGeral = :totalGeral"),
    @NamedQuery(name = "CVenda.findByObsCVenda", query = "SELECT c FROM CVenda c WHERE c.obsCVenda = :obsCVenda")})
public class CVenda implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_c_venda")
    private Integer idCVenda;
    @Column(name = "id_usuario")
    private Short idUsuario;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @Column(name = "data_c_venda")
    @Temporal(TemporalType.DATE)
    private Date dataCVenda;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "id_status_venda")
    private Short idStatusVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "subtotal")
    private BigDecimal subtotal;
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Basic(optional = false)
    @Column(name = "total_geral")
    private BigDecimal totalGeral;
    @Column(name = "obs_c_venda")
    private String obsCVenda;

    public CVenda() {
    }

    public CVenda(Integer idCVenda) {
        this.idCVenda = idCVenda;
    }

    public CVenda(Integer idCVenda, Date dataCVenda, BigDecimal totalGeral) {
        this.idCVenda = idCVenda;
        this.dataCVenda = dataCVenda;
        this.totalGeral = totalGeral;
    }

    public Integer getIdCVenda() {
        return idCVenda;
    }

    public void setIdCVenda(Integer idCVenda) {
        Integer oldIdCVenda = this.idCVenda;
        this.idCVenda = idCVenda;
        changeSupport.firePropertyChange("idCVenda", oldIdCVenda, idCVenda);
    }

    public Short getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Short idUsuario) {
        Short oldIdUsuario = this.idUsuario;
        this.idUsuario = idUsuario;
        changeSupport.firePropertyChange("idUsuario", oldIdUsuario, idUsuario);
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        Integer oldIdCliente = this.idCliente;
        this.idCliente = idCliente;
        changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
    }

    public Date getDataCVenda() {
        return dataCVenda;
    }

    public void setDataCVenda(Date dataCVenda) {
        Date oldDataCVenda = this.dataCVenda;
        this.dataCVenda = dataCVenda;
        changeSupport.firePropertyChange("dataCVenda", oldDataCVenda, dataCVenda);
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        Date oldHora = this.hora;
        this.hora = hora;
        changeSupport.firePropertyChange("hora", oldHora, hora);
    }

    public Short getIdStatusVenda() {
        return idStatusVenda;
    }

    public void setIdStatusVenda(Short idStatusVenda) {
        Short oldIdStatusVenda = this.idStatusVenda;
        this.idStatusVenda = idStatusVenda;
        changeSupport.firePropertyChange("idStatusVenda", oldIdStatusVenda, idStatusVenda);
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        BigDecimal oldSubtotal = this.subtotal;
        this.subtotal = subtotal;
        changeSupport.firePropertyChange("subtotal", oldSubtotal, subtotal);
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        BigDecimal oldDesconto = this.desconto;
        this.desconto = desconto;
        changeSupport.firePropertyChange("desconto", oldDesconto, desconto);
    }

    public BigDecimal getTotalGeral() {
        return totalGeral;
    }

    public void setTotalGeral(BigDecimal totalGeral) {
        BigDecimal oldTotalGeral = this.totalGeral;
        this.totalGeral = totalGeral;
        changeSupport.firePropertyChange("totalGeral", oldTotalGeral, totalGeral);
    }

    public String getObsCVenda() {
        return obsCVenda;
    }

    public void setObsCVenda(String obsCVenda) {
        String oldObsCVenda = this.obsCVenda;
        this.obsCVenda = obsCVenda;
        changeSupport.firePropertyChange("obsCVenda", oldObsCVenda, obsCVenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCVenda != null ? idCVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CVenda)) {
            return false;
        }
        CVenda other = (CVenda) object;
        if ((this.idCVenda == null && other.idCVenda != null) || (this.idCVenda != null && !this.idCVenda.equals(other.idCVenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "principal.pedidos.CVenda[ idCVenda=" + idCVenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
