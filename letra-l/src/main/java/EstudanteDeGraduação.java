public class EstudanteDeGraduação extends Estudante{
    public EstudanteDeGraduação(String nome) {
        super(nome);
    }

    public void estudar(){
        System.out.println(nome + " está estudando na graduação.");
    }

    public void entregarTCC(){
        System.out.println(nome + " Entregando TCC...");
    }
}
