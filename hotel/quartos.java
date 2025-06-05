package hotel;
import java.util.Scanner;
public class quartos {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
           System.out.println("How many rooms will be rented ?");
           int n = sc.nextInt();
           estudante[] vect = new estudante[10];
           for(int i = 1; i <= n; i++) {
                System.out.println("Rent#" + i + ":");
                System.out.println("Name:");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Email:");
                String email = sc.next();
                System.out.println("Room:");
                int room_number = sc.nextInt();
                vect[room_number].setAluguel(name, email);
           }
           System.out.println();
           System.out.println("Busy rooms:");
           for(int i = 0; i < 10; i++) {
            if(vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }
           }
        }
    }
    
    }
    

