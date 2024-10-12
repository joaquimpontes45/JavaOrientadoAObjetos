import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }
}
