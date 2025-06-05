package simulaBanco;

public class banco {

    private String nome;
    private double saldo;
    private int id;

    public void setConta(double deposito, int id, String nome) {
        addSaldo(deposito);
        this.id = id;
        this.nome = nome;
    }

    public void setConta(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void addSaldo(double add) {
        saldo += add;
    }

    public void saque(double valor) {
        saldo -= (5 + valor);
    }

    public void printt() {
        System.out.println("Account " + id + ", Holder: " + nome + ", Balance: $ " + String.format("%.2f", saldo));
    }
}
