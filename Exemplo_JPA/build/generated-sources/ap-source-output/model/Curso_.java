package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Professor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-04T07:58:51")
@StaticMetamodel(Curso.class)
public class Curso_ { 

    public static volatile SingularAttribute<Curso, String> tipoCurso;
    public static volatile SingularAttribute<Curso, Integer> totalPeriodos;
    public static volatile SingularAttribute<Curso, String> nome;
    public static volatile SingularAttribute<Curso, Long> id;
    public static volatile SingularAttribute<Curso, Professor> coordenador;
    public static volatile SingularAttribute<Curso, Integer> cargaHoraria;

}