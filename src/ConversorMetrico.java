import java.util.*;

public class ConversorMetrico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letra = 0;

        System.out.print("Digite a quantidade em metros: ");
        float metro = input.nextFloat();

        if (metro > 1) {
            letra = 's';
        }

        System.out.println(metro + " metro"+ letra +" \n"  + (metro * 100) + " centimetros");

    }
}
