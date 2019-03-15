import java.util.*;

public class ImprimaSoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        System.out.println("Soma: "+(numero1+numero2));
    }
}
