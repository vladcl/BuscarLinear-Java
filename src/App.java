import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vector = new int[8];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }

        System.out.println("Por favor, digite um número para sua busca.");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();

        int count = 0;
        boolean findIt = false;
        for (int i = 0; i < vector.length; i++) {
            count++;
            if (vector[i] == searchNumber) {
                findIt = true;
                break;
            }
        }

        System.out.println("Para este número eu fiz: " + count + " teste(s).");
        if (findIt == true) {
            System.out.println("Achei! :)");
        } else {
            System.out.println("Não achei! :(");
        }
    }
}
