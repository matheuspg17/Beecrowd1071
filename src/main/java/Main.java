
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2, numeromenor, numeromaior, soma = 0;

        numero1 = leia.nextInt();
        numero2 = leia.nextInt();

        if (numero1 > numero2) {
            numeromaior = numero1;
            numeromenor = numero2;
        } else {
            numeromaior = numero2;
            numeromenor = numero1;
        }
        for (int i = numeromenor + 1; i < numeromaior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }

        }
        System.out.println(soma);
    }
}
    