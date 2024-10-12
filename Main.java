import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Aprenda a desenvolver aplicações em Java.");

        Curso curso1 = new Curso("Java Básico", "Curso introdutório de Java.", 20);
        Curso curso2 = new Curso("Java Avançado", "Curso avançado de Java.", 60);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java.", LocalDate.now());

        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);

        Dev dev1 = new Dev("Joaquim");
        dev1.inscreverCurso(curso1);
        dev1.inscreverMentoria(mentoria1);

        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição: " + bootcamp.getDescricao());
        System.out.println("Cursos disponíveis:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getTitulo());
        }
        System.out.println("Mentorias disponíveis:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTitulo());
        }
        System.out.println("Dev: " + dev1.getNome());
        System.out.println("Cursos inscritos: " + dev1.getCursosInscritos().get(0).getTitulo());
        System.out.println("Mentorias inscritas: " + dev1.getMentoriasInscritas().get(0).getTitulo());
    }
}
