import java.util.Scanner;

public class MediaBimestral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notas = new float[4];
        float media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i+1)+ "a nota bimestral: ");
            notas[i] = input.nextFloat();
        }

        for (int i = 0; i < 4; i++) {
            media = notas[i] + media;
        }
        System.out.println("Média Bimestral: " + (media/4));
    }
}

