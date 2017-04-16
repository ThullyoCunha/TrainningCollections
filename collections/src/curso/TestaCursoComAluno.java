package curso;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Carlos Ferraz");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Alan Araujo", 11111);
        Aluno a2 = new Aluno("Thullyo Cunha", 22222);
        Aluno a3 = new Aluno("Breno Calado", 33333);
        Aluno a4 = new Aluno("Sergio Endrigo", 44444);
        
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
        
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
    }
}