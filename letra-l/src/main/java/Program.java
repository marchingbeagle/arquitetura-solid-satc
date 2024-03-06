public class Program {
    public static void main(String[]args){
        Estudante estudante1 = new Estudante("Erik");
        estudante1.estudar();

        EstudanteDePosGraduacao estudanteGraduacao = new EstudanteDePosGraduacao("erik");
        String nome = estudanteGraduacao.getNome();
        System.out.println(nome);
        estudanteGraduacao.estudar();
    }
}
