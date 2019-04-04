package teste;
import model.Professor;
import model.Curso;
import dao.CursoDAO;
import dao.ProfessorDAO;

public class MainTest {
    public static void main(String[] args) {
        Professor p1 = new Professor("Marco Antônio");
        Professor p2 = new Professor("Luiz Oscar");
        Professor p3 = new Professor("Diana Barci");
        
        Curso c1 = new Curso("Sistema de Informação", 40, "Bacharelado", 8, p1);
        Curso c2 = new Curso("Mecatrônica", 40, "Engenharia", 10, p2);
        Curso c3 = new Curso("Física", 40, "Licensiatura", 10, p3);
        
        ProfessorDAO.getInstance().salvar(p1);
        ProfessorDAO.getInstance().salvar(p2);
        ProfessorDAO.getInstance().salvar(p3);
        
        CursoDAO.getInstance().salvar(c1);
        CursoDAO.getInstance().salvar(c2);
        CursoDAO.getInstance().salvar(c3);
    }    
}
