public class EstudanteDePosGraduacao extends Estudante {
    public EstudanteDePosGraduacao(String nome) {
        super(nome);
    }

    public void estudar(){
        System.out.println("estudar 2");
    }
    
    public void entregarTCC() {
        System.out.printf("entregar tcc");
    }
}
