import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = leitura.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = leitura.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("O Índice de Massa Corporal (IMC) é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Você está Peso ideal");
        } else if (imc < 30) {
            System.out.println("Você está Acima do peso");
        } else {
            System.out.println("Você está Obeso");
        }
    }
}
