import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 1;


        while (quantidade <= 10) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt(); // Para ler o número dentro do loop
            soma += numero;
            quantidade++;
        }

        System.out.println("A soma dos números digitados é: " + soma);

            scanner.close();
        }
    }



// 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.