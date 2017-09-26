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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Filipe
 */
@Entity
@Table(name = "produtos", catalog = "projetopizza", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p"),
    @NamedQuery(name = "Produtos.findByIdProduto", query = "SELECT p FROM Produtos p WHERE p.idProduto = :idProduto"),
    @NamedQuery(name = "Produtos.findByNmProduto", query = "SELECT p FROM Produtos p WHERE p.nmProduto = :nmProduto"),
    @NamedQuery(name = "Produtos.findByDescricaoProduto", query = "SELECT p FROM Produtos p WHERE p.descricaoProduto = :descricaoProduto"),
    @NamedQuery(name = "Produtos.findByValorPequena", query = "SELECT p FROM Produtos p WHERE p.valorPequena = :valorPequena"),
    @NamedQuery(name = "Produtos.findByValorMedia", query = "SELECT p FROM Produtos p WHERE p.valorMedia = :valorMedia"),
    @NamedQuery(name = "Produtos.findByValorGrande", query = "SELECT p FROM Produtos p WHERE p.valorGrande = :valorGrande"),
    @NamedQuery(name = "Produtos.findByValorMeia", query = "SELECT p FROM Produtos p WHERE p.valorMeia = :valorMeia"),
    @NamedQuery(name = "Produtos.findByIdGrupoProduto", query = "SELECT p FROM Produtos p WHERE p.idGrupoProduto = :idGrupoProduto"),
    @NamedQuery(name = "Produtos.findByFoto", query = "SELECT p FROM Produtos p WHERE p.foto = :foto"),
    @NamedQuery(name = "Produtos.findByObsProduto", query = "SELECT p FROM Produtos p WHERE p.obsProduto = :obsProduto")})
public class Produtos implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produto")
    private Integer idProduto;
    @Basic(optional = false)
    @Column(name = "nm_produto")
    private String nmProduto;
    @Column(name = "descricao_produto")
    private String descricaoProduto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_pequena")
    private BigDecimal valorPequena;
    @Column(name = "valor_media")
    private BigDecimal valorMedia;
    @Column(name = "valor_grande")
    private BigDecimal valorGrande;
    @Column(name = "valor_meia")
    private BigDecimal valorMeia;
    @Column(name = "id_grupo_produto")
    private Short idGrupoProduto;
    @Column(name = "foto")
    private String foto;
    @Column(name = "obs_produto")
    private String obsProduto;

    public Produtos() {
    }

    public Produtos(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produtos(Integer idProduto, String nmProduto) {
        this.idProduto = idProduto;
        this.nmProduto = nmProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        Integer oldIdProduto = this.idProduto;
        this.idProduto = idProduto;
        changeSupport.firePropertyChange("idProduto", oldIdProduto, idProduto);
    }

    public String getNmProduto() {
        return nmProduto;
    }

    public void setNmProduto(String nmProduto) {
        String oldNmProduto = this.nmProduto;
        this.nmProduto = nmProduto;
        changeSupport.firePropertyChange("nmProduto", oldNmProduto, nmProduto);
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        String oldDescricaoProduto = this.descricaoProduto;
        this.descricaoProduto = descricaoProduto;
        changeSupport.firePropertyChange("descricaoProduto", oldDescricaoProduto, descricaoProduto);
    }

    public BigDecimal getValorPequena() {
        return valorPequena;
    }

    public void setValorPequena(BigDecimal valorPequena) {
        BigDecimal oldValorPequena = this.valorPequena;
        this.valorPequena = valorPequena;
        changeSupport.firePropertyChange("valorPequena", oldValorPequena, valorPequena);
    }

    public BigDecimal getValorMedia() {
        return valorMedia;
    }

    public void setValorMedia(BigDecimal valorMedia) {
        BigDecimal oldValorMedia = this.valorMedia;
        this.valorMedia = valorMedia;
        changeSupport.firePropertyChange("valorMedia", oldValorMedia, valorMedia);
    }

    public BigDecimal getValorGrande() {
        return valorGrande;
    }

    public void setValorGrande(BigDecimal valorGrande) {
        BigDecimal oldValorGrande = this.valorGrande;
        this.valorGrande = valorGrande;
        changeSupport.firePropertyChange("valorGrande", oldValorGrande, valorGrande);
    }

    public BigDecimal getValorMeia() {
        return valorMeia;
    }

    public void setValorMeia(BigDecimal valorMeia) {
        BigDecimal oldValorMeia = this.valorMeia;
        this.valorMeia = valorMeia;
        changeSupport.firePropertyChange("valorMeia", oldValorMeia, valorMeia);
    }

    public Short getIdGrupoProduto() {
        return idGrupoProduto;
    }

    public void setIdGrupoProduto(Short idGrupoProduto) {
        Short oldIdGrupoProduto = this.idGrupoProduto;
        this.idGrupoProduto = idGrupoProduto;
        changeSupport.firePropertyChange("idGrupoProduto", oldIdGrupoProduto, idGrupoProduto);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    public String getObsProduto() {
        return obsProduto;
    }

    public void setObsProduto(String obsProduto) {
        String oldObsProduto = this.obsProduto;
        this.obsProduto = obsProduto;
        changeSupport.firePropertyChange("obsProduto", oldObsProduto, obsProduto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.idProduto == null && other.idProduto != null) || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "principal.pedidos.Produtos[ idProduto=" + idProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
