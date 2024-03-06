public class Estudante {
    String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
