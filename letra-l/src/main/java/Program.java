public class Program {
    public static void main(String[]args){
        Estudante estudanteGenerico = new Estudante("Erik");
        estudanteGenerico.estudar();

        EstudanteDePosGraduacao estudantePosGraduacao = new EstudanteDePosGraduacao("Erik Pós Graduação");
        EstudanteDeGraduação estudanteDeGraduacao = new EstudanteDeGraduação("Erik Graduação");

        estudantePosGraduacao.estudar();
        estudanteDeGraduacao.estudar();

        estudanteDeGraduacao.entregarTCC();
        estudantePosGraduacao.entregarTCC();



    }
}
