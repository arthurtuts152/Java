package hotel;
public class estudante {
    private String nome;
    private String email;

    public void setAluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    @Override
    public String toString() {
        return nome + "," + email;
    }
    }

