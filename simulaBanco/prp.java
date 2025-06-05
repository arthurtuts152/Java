package simulaBanco;

import java.util.Scanner;

public class prp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            banco bank = new banco();
            System.out.println("Entre the account number:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter account holder");
            String nome = sc.nextLine();
            System.out.println("Is there a an initial deposit:");
            String dec = sc.nextLine();
            if (dec.equals("y")) {
                System.out.println("Enter initial deposit value:");
                double saldo = sc.nextDouble();
                sc.nextLine();
                bank.setConta(saldo, id, nome);
            } else if (dec.equals("n")) {
                bank.setConta(id, nome);
            }
            System.out.println("Account data:");
            bank.printt();
            System.out.println("Enter a deposit value:");
            double add = sc.nextDouble();
            bank.addSaldo(add);
            bank.printt();
            System.out.println("Enter a withdraw value:");
            double y = sc.nextDouble();
            bank.saque(y);
            bank.printt();

        }

    }
}
