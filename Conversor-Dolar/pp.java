import java.util.Scanner;

public class pp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.println("Qual o preço do dólar?");
            double price = sc.nextDouble();
            System.out.println("Quantos dólares você deseja comprar?");
            double n = sc.nextDouble();
            double x = dolar.conversor(n, price); 
            System.out.println("O valor gasto em reais foi: R$" + x);
        } catch (Exception e) { 
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
