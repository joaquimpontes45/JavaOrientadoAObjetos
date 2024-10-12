import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos = new ArrayList<>();
    private List<Mentoria> mentoriasInscritas = new ArrayList<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
    }

    public String getNome() {
        return nome;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public List<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }
}
