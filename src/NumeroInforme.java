import java.util.*;

public class NumeroInforme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        try{
            System.out.println("Digite um número: ");
            numero=input.nextInt();

        } catch (InputMismatchException e){
            System.out.println("Digito não permitido");
        }

//        System.out.println("O número informado foi: "+numero);

    }
}
