package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Curso implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer cargaHoraria;
    private String tipoCurso;
    private Integer totalPeriodos;
    @ManyToOne
    private Professor coordenador;
    
    public Curso() {}
    
    public Curso(String nome, Integer cargaHoraria, String tipoCurso, Integer totalPeriodos, Professor coordenador) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.tipoCurso = tipoCurso;
        this.totalPeriodos = totalPeriodos;
        this.coordenador = coordenador;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargaHoraria
     */
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the tipoCurso
     */
    public String getTipoCurso() {
        return tipoCurso;
    }

    /**
     * @param tipoCurso the tipoCurso to set
     */
    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    /**
     * @return the totalPeriodos
     */
    public Integer getTotalPeriodos() {
        return totalPeriodos;
    }

    /**
     * @param totalPeriodos the totalPeriodos to set
     */
    public void setTotalPeriodos(Integer totalPeriodos) {
        this.totalPeriodos = totalPeriodos;
    }
    
    public Professor getCoordernador() {
        return coordenador;
    }
    
    public void setCoodernador(Professor coordenador) {
        this.coordenador = coordenador;
    }
}
