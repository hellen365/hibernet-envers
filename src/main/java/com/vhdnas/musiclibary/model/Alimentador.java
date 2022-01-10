package com.vhdnas.musiclibary.model;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Audited
@Entity
@Table
@AuditTable(value="alimentador_audit")
public class Alimentador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private double bebedouro;

    @Column(nullable = false)
    private double comedouro;

    @Column(name = "data_ultima_alteracao")
    private Date ultimaAlteracao;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBebedouro() {
        return bebedouro;
    }

    public void setBebedouro(double bebedouro) {
        this.bebedouro = bebedouro;
    }

    public double getComedouro() {
        return comedouro;
    }

    public void setComedouro(double comedouro) {
        this.comedouro = comedouro;
    }

    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public void setUltimaAlteracao(Date ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }
}
