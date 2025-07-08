import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite o seu peso em (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura em (m): ");
        sc.nextLine();
        double altura = sc.nextDouble();
        System.out.println("Digite o seu nome completo: ");
        sc.nextLine();
        nome = sc.nextLine();

        double imc = peso/Math.pow(altura,2);

        System.out.println(nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: "+ altura);
        System.out.printf("IMC: %.2f", + imc);

    }
}
